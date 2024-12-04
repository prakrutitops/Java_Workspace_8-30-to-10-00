package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService 
{
	public User addStudent(User s);//add
	public List<User> viewAllStudent();//view
	public void deleteStudent(int id);//delete
	public User StudentById(int id);//fetch data by id
	public User updateStudent(User s,int id);//update
	
	
}
