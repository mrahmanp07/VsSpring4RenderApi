package com.jwt.springBoot.JWTEx.controller;

import com.jwt.springBoot.JWTEx.entity.CourseCategory;
import com.jwt.springBoot.JWTEx.repository.CourseCategoryRepository;
import com.jwt.springBoot.JWTEx.service.CourseCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coursecat")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CourseCategoryController {

	@Autowired
	private CourseCategoryService courseCategoryService;
	
	@Autowired
	private CourseCategoryRepository courseCategoryRepository;
	
	@PostMapping("/post")
	public CourseCategory post(@RequestBody CourseCategory courseCategory) {
		return courseCategoryService.post(courseCategory);
	}
	
	@GetMapping("/get/{id}")
	public CourseCategory getById(@PathVariable int id) {
		return courseCategoryService.getById(id);
	}
	
	@GetMapping("/getall")
	public List<CourseCategory> getAll() {
		return courseCategoryService.getAll();
	}
	
//	@PutMapping("/update")
//	public CourseCategory update(@RequestBody CourseCategory courseCategory) {
//		return courseCategoryService.update(courseCategory);
//	}
	
	@PutMapping("/update/{id}")
	CourseCategory update(@RequestBody CourseCategory courseCategory, @PathVariable int id) {
        return courseCategoryRepository.findById(id)
                .map(courseCat -> {
                	courseCat.setCourseCatName(courseCategory.getCourseCatName());
                    return courseCategoryRepository.save(courseCat);
                })
                .orElseGet(() -> {
                	courseCategory.setCourse_cat_id(id);
                    return courseCategoryRepository.save(courseCategory);
                });
    }
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return courseCategoryService.delete(id);
	}
	
	@PostMapping("/postall")
	public List<CourseCategory> postAll(@RequestBody List<CourseCategory> list) {
		return courseCategoryService.postAll(list);
	}
}
