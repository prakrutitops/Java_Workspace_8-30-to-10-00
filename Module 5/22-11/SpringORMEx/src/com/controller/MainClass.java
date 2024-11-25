package com.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bo.Bo;
import com.model.Person;

public class MainClass 
{
	public static void main(String[] args)
	{
		
		ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		Scanner sc = new Scanner(System.in);
		Bo bo = (Bo) con.getBean("bo");
		
		
//		Person p = new Person();
//		System.out.println("Enter Your Name");
//		p.setName(sc.next());
//		bo.insert(p);
		
//		Person p = new Person();
//		System.out.println("Enter Your Id");
//		p.setId(sc.nextInt());
//		System.out.println("Enter Your Name");
//		p.setName(sc.next());
//		bo.update(p);
//		
		
		Person p = new Person();
		System.out.println("Enter Your Id");
		p.setId(sc.nextInt());
		bo.delete(p);
		
	}	
}
