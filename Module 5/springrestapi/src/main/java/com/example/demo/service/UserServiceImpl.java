package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService
{
	
	@Autowired
	UserRepo repo;

	@Override
	public User addStudent(User s) {
		// TODO Auto-generated method stub
		return repo.save(s);
	}

	@Override
	public List<User> viewAllStudent() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteStudent(int id) {
		
		repo.deleteById(id);	
	}

	@Override
	public User StudentById(int id) 
	{
		
		return repo.findById(id).orElseThrow();
	}

	@Override
	public User updateStudent(User s, int id) {
		// TODO Auto-generated method stub
		s.setId(id);
		return repo.save(s);
	}

}
