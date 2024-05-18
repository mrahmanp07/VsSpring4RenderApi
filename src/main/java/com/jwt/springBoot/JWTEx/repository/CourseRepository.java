package com.jwt.springBoot.JWTEx.repository;

import com.jwt.springBoot.JWTEx.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{
//    List<Course> findAllByCourseCatName2(String courseCatName2);

    @Query(value = "SELECT * FROM courses c WHERE c.course_cat_name2 =:courseCatName", nativeQuery = true)
    List<Course> gatAllByCategory(@Param("courseCatName") String category);

}
