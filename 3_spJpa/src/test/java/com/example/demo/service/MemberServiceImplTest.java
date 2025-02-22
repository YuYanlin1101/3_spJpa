package com.example.demo.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Member;
import com.example.demo.service.impl.MemberServiceImpl;

@SpringBootTest
public class MemberServiceImplTest 
{
	@Autowired
	MemberServiceImpl msi;
	
	//@Test
	public void addMemberTest()
	{
		msi.addMember(new Member("小余","student","1132","台北","1101"));
		System.out.println("add success");
	}
	
	//@Test
	public void LoginMemberTest()
	{
		System.out.println(msi.LoginMember("student","1132"));
	}
	
	//@Test
	public void selectUsernameTest()
	{
		System.out.println(msi.selectUsername("student"));
	}
	
	//@Test
	public void selectAllMember()
	{
		List<Member> l=msi.selectAllMember();
		for(Member m:l)
		{
			System.out.println("id:"+m.getId()+"\tname:"+m.getName());
		}
	}
	
	//@Test
	public void updateMemberTest()
	{
		msi.updateMember(20,"阿余","台灣");
		System.out.println("add success");
	}
	
	@Test
	public void deleteMemberTest()
	{
		msi.deleteMember(15);
		System.out.println("delete success");
	}
}