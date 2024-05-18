package com.jwt.springBoot.JWTEx.controller;


import com.jwt.springBoot.JWTEx.dto.FileInfo;
import com.jwt.springBoot.JWTEx.dto.MessageDTO;
import com.jwt.springBoot.JWTEx.service.CourseFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/coursefile")
@CrossOrigin("*")
public class CourseFileController {

	@Autowired
	private CourseFileService courseFileService;
	
	@PostMapping("/post")
	public ResponseEntity<MessageDTO> post(@RequestParam("file") MultipartFile[] file, @RequestParam("id") int id) {
        String message = "";
        try {

            System.out.println(id);
            courseFileService.save(file, id);
            message = "Uploaded the file successfully. " ;
            return ResponseEntity.status(HttpStatus.OK).body(new MessageDTO(message));
        } catch (Exception e) {
            message = "Could not upload the file: " + ". Error: " + e.getMessage();
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new MessageDTO(message));
        }
    }
	
	@GetMapping("/getall")
    public ResponseEntity<List<FileInfo>> getListFiles() {
        List<FileInfo> fileInfos = courseFileService.loadAll().map(path -> {
            String filename = path.getFileName().toString();
            String url = MvcUriComponentsBuilder
                    .fromMethodName(CourseFileController.class, "getFile", path.getFileName().toString()).build().toString();
            return new FileInfo(filename, url);
        }).collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(fileInfos);
    }
	
	@DeleteMapping("/delete/{filename:.+}")
    public ResponseEntity<MessageDTO> delete(@PathVariable String filename) {
        String message = "";

        try {
            boolean existed = courseFileService.delete(filename);

            if (existed) {
                message = "Delete the file successfully: " + filename;
                return ResponseEntity.status(HttpStatus.OK).body(new MessageDTO(message));
            }

            message = "The file does not exist!";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new MessageDTO(message));
        } catch (Exception e) {
            message = "Could not delete the file: " + filename + ". Error: " + e.getMessage();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new MessageDTO(message));
        }
    }
	
}
