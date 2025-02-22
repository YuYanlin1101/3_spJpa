package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Member;
import com.example.demo.service.impl.MemberServiceImpl;

@RestController
@RequestMapping("memberApi")
public class MemberApi 
{
	@Autowired
	MemberServiceImpl msi;
	
	@GetMapping("allMember")
	public List<Member> allMember()//提供前端資料用串接意思
	{
		return msi.selectAllMember();
	}
	
	@PostMapping("loginMember")
	public Member loginMember(String username,String password)
	{
		return msi.LoginMember(username,password);
	}
}