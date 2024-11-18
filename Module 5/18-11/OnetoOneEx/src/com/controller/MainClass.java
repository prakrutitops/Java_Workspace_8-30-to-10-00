package com.controller;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Address;
import com.model.Person;

public class MainClass 
{	
	public static void main(String[] args)
	{
		Session sess =  new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name = sc.next();
		
		System.out.println("Enter Address");
		String address = sc.next();
		
		
		Person p1 = new Person();
		p1.setName(name);
		
		Address a1 = new Address();
		a1.setCity(address);
		
		
		
		a1.setPerson(p1);
		
		sess.save(p1);
		sess.save(a1);
		tr.commit();
		sess.close();
		
	}
}
