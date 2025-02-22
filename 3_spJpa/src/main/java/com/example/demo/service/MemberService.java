package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Member;

public interface MemberService 
{
	//create	
	void addMember(Member m);
			
	//read
	Member LoginMember(String username,String password);
	boolean selectUsername(String username);
	List<Member> selectAllMember();
			
	//update
	void updateMember(int id,String name,String address);
			
	//delete
	void deleteMember(int id);
}