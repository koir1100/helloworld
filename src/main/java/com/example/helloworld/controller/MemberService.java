package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="MemberService", description="회원 관련")
@RequestMapping(path="/api/")
@RestController
public class MemberService {
	
	@Operation(summary="회원조회")
	@GetMapping("/members")
	public void get() {
		
	}
	
	@Operation(summary="회원등록")
	@PostMapping("/members")
	public void register() {
		
	}
	
	@Operation(summary="회원삭제")
	@DeleteMapping("/members")
	public void delete() {
		
	}
}
