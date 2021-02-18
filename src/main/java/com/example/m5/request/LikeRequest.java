package com.example.m5.request;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class LikeRequest {
	
	@NotBlank
    private Integer articleId;
    
}
