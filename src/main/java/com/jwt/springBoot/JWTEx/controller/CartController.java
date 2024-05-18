package com.jwt.springBoot.JWTEx.controller;


import com.jwt.springBoot.JWTEx.entity.Cart;
import com.jwt.springBoot.JWTEx.repository.CartRepository;
import com.jwt.springBoot.JWTEx.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CartController {

	@Autowired
	CartService cartService;
	
	@Autowired
	CartRepository cartRepository;
	
	@PostMapping("/post")
	public Cart post(@RequestBody Cart cart) {
		return cartService.post(cart);
	}
	
	@GetMapping("/get/{id}")
	public Cart getById(@PathVariable int id) {
		return cartService.getById(id);
	}
	
	@GetMapping("/getall")
	public List<Cart> getAll() {
		return cartService.getAll();
	}
	
//	@PutMapping("/update")
//	public Cart update(@RequestBody Cart cart) {
//		return applicantService.update(cart);
//	}
	
	@PutMapping("/update/{id}")
	Cart update(@RequestBody Cart cart, @PathVariable int id) {
        return cartRepository.findById(id)
                .map(caRT -> {
                	caRT.setCourseCname(caRT.getCourseCname());
                	caRT.setCourseCuploadDate(caRT.getCourseCuploadDate());
                	caRT.setCourseCarticle(cart.getCourseCarticle());
                    return cartRepository.save(caRT);
                })
                .orElseGet(() -> {
                	cart.setCart_id(id);
                    return cartRepository.save(cart);
                });
    }
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return cartService.delete(id);
	}
	
	@PostMapping("/postall")
	public List<Cart> postAll(@RequestBody List<Cart> list) {
		return cartService.postAll(list);
	}
}
