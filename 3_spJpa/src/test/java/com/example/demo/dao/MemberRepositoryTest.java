package com.example.demo.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Member;

@SpringBootTest
public class MemberRepositoryTest 
{
	@Autowired
	MemberRepository mrs;
	
	//@Test
	public void add()
	{
		mrs.save(new Member("yuyanlin","MB014927","0925","shulin","1132"));
		System.out.println("add success");
	}
	
	//@Test
	public void selectMemberTest()
	{
		List<Member> l=mrs.selectMember("yuyanlin","1132");
		if(l.size()!=0)
		{
			System.out.println(l);
		}
	}
	
	//@Test
	public void selectUsernameTest()
	{
		List<Member> l=mrs.selectUsername("student");
		if(l.size()!=0)
		{
			System.out.println(l);
		}
	}
	
	@Test
	public void selectByIdTest()
	{
		System.out.println(mrs.selectById(15));
	}
}