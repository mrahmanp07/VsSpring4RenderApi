package com.jwt.springBoot.JWTEx.repository;

import com.jwt.springBoot.JWTEx.entity.PurchaseCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseCourseRepository extends JpaRepository<PurchaseCourse, Integer> {
    @Query(value = "SELECT COUNT(purchase_course_id) AS total FROM purchase_course pc WHERE pc.p_course_id =:purchaseCourseId", nativeQuery = true)
    Integer countAll(@Param("purchaseCourseId") int id);

    @Query(value = "SELECT SUM(purchase_course_price) AS price FROM purchase_course pc WHERE pc.p_course_id =:purchaseCourseId", nativeQuery = true)
    Integer totalPrice(@Param("purchaseCourseId") int id);

    @Query(value = "SELECT COUNT(purchase_course_id) FROM purchase_course ", nativeQuery = true)
    Integer total();

    @Query(value = "SELECT * FROM purchase_course pc WHERE pc.purchase_course_user_name =:purchaseCourseUsername", nativeQuery = true)
    List<PurchaseCourse> getAllByUsername(@Param("purchaseCourseUsername") String username);
}
