package com.example.m5.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.m4.services.UserDetailsImpl;
import com.example.m5.request.LikeRequest;
import com.example.m5.response.LikeResponse;
import com.example.m5.service.LikeService;

@RestController
@RequestMapping("/api")
public class LikeController {
	
	@Autowired
	LikeService likeService;
	
	
	@PostMapping("/like")
	public ResponseEntity<LikeResponse> registerUser(@Valid @RequestBody LikeRequest likeRequest) {
		UserDetailsImpl user = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return likeService.processLike(likeRequest, user.getId());
	}

}
