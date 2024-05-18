package com.jwt.springBoot.JWTEx.repository;

import com.jwt.springBoot.JWTEx.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

}
