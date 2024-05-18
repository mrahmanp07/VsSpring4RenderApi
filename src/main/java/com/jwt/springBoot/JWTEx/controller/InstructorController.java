package com.jwt.springBoot.JWTEx.controller;

import com.jwt.springBoot.JWTEx.entity.Instructor;
import com.jwt.springBoot.JWTEx.repository.InstructorRepository;
import com.jwt.springBoot.JWTEx.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructor")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class InstructorController {

	@Autowired
	InstructorService instructorService;
	
	@Autowired
	InstructorRepository instructorRepository;
	
	@PostMapping("/post")
	public Instructor post(@RequestBody Instructor instructor) {
		return instructorService.post(instructor);
	}
	
	@GetMapping("/get/{id}")
	public Instructor getById(@PathVariable int id) {
		return instructorService.getById(id);
	}
	
	@GetMapping("/getall")
	public List<Instructor> getAll() {
		return instructorService.getAll();
	}
	
//	@PutMapping("/update")
//	public Instructor update(@RequestBody Instructor instructor) {
//		return instructorService.update(instructor);
//	}
	
	@PutMapping("/update/{id}")
	Instructor update(@RequestBody Instructor instructor, @PathVariable int id) {
        return instructorRepository.findById(id)
                .map(insTRUCTOR -> {
                	insTRUCTOR.setInstructorName(instructor.getInstructorName());
                	insTRUCTOR.setInstructorUsername(instructor.getInstructorUsername());
                	insTRUCTOR.setInstructorPassword(instructor.getInstructorPassword());
                	insTRUCTOR.setInstructorEmail(instructor.getInstructorEmail());
                	insTRUCTOR.setInstructorPhone(instructor.getInstructorPhone());
                	insTRUCTOR.setInstructorNid(instructor.getInstructorNid());
                	insTRUCTOR.setInstructorDesignation(instructor.getInstructorDesignation());
                	insTRUCTOR.setInstructorWorkplace(instructor.getInstructorWorkplace());
                	insTRUCTOR.setInstructorPic(instructor.getInstructorPic());
                    return instructorRepository.save(insTRUCTOR);
                })
                .orElseGet(() -> {
                	instructor.setInstructor_id(id);
                    return instructorRepository.save(instructor);
                });
    }
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return instructorService.delete(id);
	}
	
	@PostMapping("/postall")
	public List<Instructor> postAll(@RequestBody List<Instructor> list) {
		return instructorService.postAll(list);
	}
}
