package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="member")
public class Member {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String username;
	private String password;
	private String address;
	private String phone;
	
	public Member(String name,String username,String password,String address,String phone)
	{
		super();
		this.name=name;
		this.username=username;
		this.password=password;
		this.address=address;
		this.phone=phone;
	}
	
	public Member()
	{
		super();
	}
}