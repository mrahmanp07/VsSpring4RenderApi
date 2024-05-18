package com.jwt.springBoot.JWTEx.service;


import com.jwt.springBoot.JWTEx.entity.PurchaseCourse;
import com.jwt.springBoot.JWTEx.repository.PurchaseCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseCourseService {

    @Autowired
    private PurchaseCourseRepository purchaseCourseRepository;

    public PurchaseCourse post(PurchaseCourse purchaseCourse) {
        if (!purchaseCourse.equals(null)) {
            return purchaseCourseRepository.save(purchaseCourse);
        }
        return null;
    }

    public List<PurchaseCourse> getAll() {
        return purchaseCourseRepository.findAll();
    }

    public PurchaseCourse getById(int id) {
        Optional<PurchaseCourse> optional = purchaseCourseRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

//	public PurchaseCourse update(PurchaseCourse purchaseCourse) {
//		Optional<PurchaseCourse> optional = courseRepository.findById(purchaseCourse.getCourseId());
//		if (optional.isPresent()) {
//			return optional.get();
//		}
//		return courseRepository.save(purchaseCourse);
//	}

    public String delete(int id) {
        Optional<PurchaseCourse> optional = purchaseCourseRepository.findById(id);
        if (optional.isPresent()) {
            purchaseCourseRepository.delete(optional.get());
            return "Success!";
        }
        return "Failed!";
    }

    public List<PurchaseCourse> postAll(List<PurchaseCourse> list) {
        return purchaseCourseRepository.saveAll(list);
    }
}
