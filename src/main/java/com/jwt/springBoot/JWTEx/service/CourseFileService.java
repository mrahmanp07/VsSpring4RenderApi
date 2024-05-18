package com.jwt.springBoot.JWTEx.service;

import com.jwt.springBoot.JWTEx.entity.CourseFile;
import com.jwt.springBoot.JWTEx.repository.CourseFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

@Service
public class CourseFileService {

	@Autowired
	CourseFileRepository courseFileRepository;
	
	private final Path root = Paths.get("upload/");
	
	public void init() {
		try {
			Files.createDirectories(root);
		} catch (Exception e) {
			throw new RuntimeException("Could not initialize folder for upload!");
		}
		
	}
//	<<<<< save files >>>>>
	public void save(MultipartFile[] files, int id) {
		try {
			for(MultipartFile file : files) {
				try {
					String fileName = file.getOriginalFilename();//full name of file submitted
                    String fileNameSplit = fileName.substring(fileName.lastIndexOf(".") + 1);//split between name and extension
                    System.out.println("extension  "+ fileNameSplit);
                    Files.copy(file.getInputStream(), this.root.resolve(file.getOriginalFilename()));
				} catch (Exception e) {
					e.printStackTrace();
				}
				CourseFile fileUpload = new CourseFile();
				fileUpload.setCourseFileTitle(file.getOriginalFilename());
				fileUpload.setCourseFileUrl(root + file.getOriginalFilename());
				fileUpload.setCourseId(id);
				courseFileRepository.save(fileUpload);
				System.out.println(courseFileRepository.save(fileUpload).getCourseFileUrl());
			}
		}
		catch (Exception e) {
			if (e instanceof FileAlreadyExistsException) {
				throw new RuntimeException("A file of that name already exists.");
			}
			throw new RuntimeException(e.getMessage());
		}
	}
	
	
	public void save1(MultipartFile file) {
		try {
			Files.copy(file.getInputStream(), this.root.resolve(file.getOriginalFilename()));
		}catch (UncheckedIOException io) {
			
			throw new RuntimeException(io.getMessage());
		} 
		
		catch (Exception e) {
			if (e instanceof FileAlreadyExistsException) {
				throw new RuntimeException("A file of that name already exists.");
			}
			throw new RuntimeException(e.getMessage());
		}
	}
	
//	<<<<< get all file >>>>>>
	public Stream<Path> loadAll() {
        try {
            return Files.walk(this.root, 1).filter(path -> !path.equals(this.root)).map(this.root::relativize);
        } catch (IOException e) {
            throw new RuntimeException("Could not load the files!");
        }
    }
	
	public boolean delete(String filename) {
        try {
            Path file = root.resolve(filename);
            return Files.deleteIfExists(file);
        } catch (IOException e) {
            throw new RuntimeException("Error: " + e.getMessage());
        }
    }

    public void deleteAll() {
        FileSystemUtils.deleteRecursively(root.toFile());
    }
}
