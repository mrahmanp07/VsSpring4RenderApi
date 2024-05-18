package com.jwt.springBoot.JWTEx.service;


import com.jwt.springBoot.JWTEx.entity.Cart;
import com.jwt.springBoot.JWTEx.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {

	@Autowired
	CartRepository cartRepository;
	
	public Cart post(Cart cart) {
		if (!cart.equals(null)) {
			return cartRepository.save(cart);
		}
		return null;
	}
	
	public List<Cart> getAll() {
		return cartRepository.findAll();
	}
	
	public Cart getById(int id) {
		Optional<Cart> optional = cartRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}	
		return null;
	}
	
//	public Cart update(Cart cart) {
//		Optional<Cart> optional = cartRepository.findById(cart.getCourseId());
//		if (optional.isPresent()) {
//			return optional.get();
//		}
//		return cartRepository.save(cart);
//	}
	
	public String delete(int id) {
		Optional<Cart> optional = cartRepository.findById(id);
		if (optional.isPresent()) {
			cartRepository.delete(optional.get());
			return "Success!";
		}
		return "Failed!";
	}
	
	public List<Cart> postAll(List<Cart> list) {
		return cartRepository.saveAll(list);
	}
}
