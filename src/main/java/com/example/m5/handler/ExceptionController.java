package com.example.m5.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.m5.exception.ErrorExc;
import com.example.m5.response.LikeResponse;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler({ ErrorExc.class })
    public ResponseEntity<LikeResponse>  handleException(ErrorExc exc) {
		return ResponseEntity
				.badRequest()
				.body(new LikeResponse(exc.getMessage()));
    }

}


