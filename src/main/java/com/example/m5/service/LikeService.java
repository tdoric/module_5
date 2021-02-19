package com.example.m5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.m1.dao.LikeDao;
import com.example.m1.model.Like;
import com.example.m5.request.LikeRequest;
import com.example.m5.response.LikeResponse;

@Service
public class LikeService {
	
	@Autowired
	LikeDao likeDao;
	
	public ResponseEntity<LikeResponse> processLike(LikeRequest request,Integer userId){
		
		Like like = new Like();
		like.setArticleId(request.getArticleId());
		like.setUserId(userId);
		likeDao.insertLike(like);
		return ResponseEntity.ok(new LikeResponse("Like accepted successfully!"));
		
	}

}
