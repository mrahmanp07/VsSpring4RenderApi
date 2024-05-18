package com.jwt.springBoot.JWTEx.repository;

import com.jwt.springBoot.JWTEx.entity.CourseFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseFileRepository extends JpaRepository<CourseFile, Integer>{

}
