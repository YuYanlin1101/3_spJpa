package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Member;

public interface MemberRepository extends JpaRepository<Member,Integer>//管理Member物件,主索引Integer
{
	@Query(value="select * from member where username=?1 and password=?2",nativeQuery=true)
	List<Member> selectMember(String username,String password);
	
	@Query(value="select * from member where username=?1",nativeQuery=true)
	List<Member> selectUsername(String username);
	
	@Query(value="select * from member where id=?1",nativeQuery=true)
	List<Member> selectById(int id);
}