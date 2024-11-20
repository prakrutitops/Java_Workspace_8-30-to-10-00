package com.controller;

import java.util.ArrayList;
import java.util.List;
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
		
		Session sess = new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		Scanner sc = new Scanner(System.in);
		
		
		Person p = new Person();
		System.out.println("Enter Name:");
		p.setName(sc.next());
		
		
		
		Address a = new Address();
		Address a2 = new Address();
		
		System.out.println("Enter Address1:");
		a.setAddr(sc.next());
		a.setPerson(p);
		
		System.out.println("Enter Address2:");
		a2.setAddr(sc.next());
		a2.setPerson(p);
		
		List<Address> list =  new ArrayList<>();
		list.add(a);
		list.add(a2);

		p.setListaddress(list);
		
		
		
		
		sess.save(p);
		sess.save(a);
		sess.save(a2);
		
		tr.commit();
		sess.close();
		
		
		
		
	}
}
