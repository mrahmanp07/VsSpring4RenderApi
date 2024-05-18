package com.jwt.springBoot.JWTEx.repository;

import com.jwt.springBoot.JWTEx.entity.CourseCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseCategoryRepository extends JpaRepository<CourseCategory, Integer>{

}
