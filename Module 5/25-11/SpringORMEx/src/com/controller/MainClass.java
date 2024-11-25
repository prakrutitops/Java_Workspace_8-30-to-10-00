package com.controller;

import java.util.List;
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
		
		//INSERT
		
//		Person p = new Person();
//		System.out.println("Enter Your Name");
//		p.setName(sc.next());
//		bo.insert(p);
		
		
		//UPDATE
//		Person p = new Person();
//		System.out.println("Enter Your Id");
//		p.setId(sc.nextInt());
//		System.out.println("Enter Your Name");
//		p.setName(sc.next());
//		bo.update(p);
//		
//		
		//DELETE
//		Person p = new Person();
//		System.out.println("Enter Your Id");
//		p.setId(sc.nextInt());
//		bo.delete(p);
		
		//VIEW
		List<Person> getall = bo.view();
		System.out.println("ID\t|\tName");
		for (Person person : getall) 
		{
			System.out.println(person.getId()+"\t|\t"+person.getName());
		}
		
		
		//SELECT
//		Person p = new Person();
//		System.out.println("Enter Your Id");
//		p.setId(sc.nextInt());
//		Person p2 = bo.getsingle(p);
//		System.out.println(p2.getName());
	}	
}
