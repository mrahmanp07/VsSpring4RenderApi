package com.jwt.springBoot.JWTEx.controller;


import com.jwt.springBoot.JWTEx.entity.PurchaseCourse;
import com.jwt.springBoot.JWTEx.repository.PurchaseCourseRepository;
import com.jwt.springBoot.JWTEx.service.PurchaseCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchasecourse")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class PurchaseCourseController {

    @Autowired
    private PurchaseCourseService purchaseCourseService;
    @Autowired
    private PurchaseCourseRepository purchaseCourseRepository;

    @PostMapping("/post")
    public PurchaseCourse post(@RequestBody PurchaseCourse purchaseCourse) {
        PurchaseCourse pc = new PurchaseCourse();
        pc.setpCourseId(purchaseCourse.getpCourseId());
        pc.setPurchaseCourseName(purchaseCourse.getPurchaseCourseName());
        pc.setPurchaseCoursePrice(purchaseCourse.getPurchaseCoursePrice());
        pc.setPurchaseCourseUserName(purchaseCourse.getPurchaseCourseUserName());
        pc.setPurchaseCourseUserAccount(purchaseCourse.getPurchaseCourseUserAccount());
        pc.setPurchaseCoursePayment(purchaseCourse.getPurchaseCoursePayment());
        pc.setPurchaseCourseTime(purchaseCourse.getPurchaseCourseTime());
        pc.setPurchaseCourseAccountType(purchaseCourse.getPurchaseCourseAccountType());
        pc.setPurchaseCourseCountry(purchaseCourse.getPurchaseCourseCountry());
        return purchaseCourseService.post(purchaseCourse);
    }

    @GetMapping("/get/{id}")
    public PurchaseCourse getById(@PathVariable int id) {
        return purchaseCourseService.getById(id);
    }

    @GetMapping("/getall")
    public List<PurchaseCourse> getAll() {
        return purchaseCourseService.getAll();
    }

//	@PutMapping("/update")
//	public Course update(@RequestBody Course course) {
//		return courseService.update(course);
//	}

//    @PutMapping("/update/{id}")
//    PurchaseCourse update(@RequestBody PurchaseCourse purchaseCourse, @PathVariable int id) {
//        return courseRepository.findById(id)
//                .map(purCHASE -> {
//                    purCHASE.setCourseName(course.getCourseName());
//                    purCHASE.setCourseUploadDate(course.getCourseUploadDate());
//                    purCHASE.setCourseDuration(course.getCourseDuration());
//                    purCHASE.setCourseArticle(course.getCourseArticle());
//                    purCHASE.setCourseResource(course.getCourseResource());
//                    couRSE.setCourseAccess(course.getCourseAccess());
//                    couRSE.setCourseDescription(course.getCourseDescription());
//                    couRSE.setCourseCurriculum(course.getCourseCurriculum());
//                    couRSE.setCoursePrice(course.getCoursePrice());
//                    couRSE.setCourseDiscount(course.getCourseDiscount());
//                    return courseRepository.save(couRSE);
//                })
//                .orElseGet(() -> {
//                    course.setCourse_id(id);
//                    return courseRepository.save(course);
//                });
//    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return purchaseCourseService.delete(id);
    }

    @PostMapping("/postall")
    public List<PurchaseCourse> postAll(@RequestBody List<PurchaseCourse> list) {
        return purchaseCourseService.postAll(list);
    }

    @GetMapping("/getcount/{id}")
    public Integer getCount(@PathVariable int id) {
        Integer countall = purchaseCourseRepository.countAll(id);
        return  countall;
    }

    @GetMapping("/getprice/{id}")
    public Integer getPrice(@PathVariable int id) {
        Integer totalprice = purchaseCourseRepository.totalPrice(id);
        return  totalprice;
    }

    @GetMapping("/gettotal")
    public Integer getTotal() {
        Integer total = purchaseCourseRepository.total();
        return  total;
    }

    @GetMapping("/getbyusername/{username}")
    List<PurchaseCourse> getAllUser(@PathVariable String username) {
        List<PurchaseCourse> allUser = purchaseCourseRepository.getAllByUsername(username);
        return allUser;
    }
}
