package com.jd.dao;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jd.domain.Cart1;
import com.jd.domain.CartRepository;
import com.jd.domain.Items1;
import com.jd.domain.Student;
import com.jd.domain.StudentRespository;

@Service
public class ServiceDao {

	@Autowired
	StudentRespository stuRepo;
	
	@Autowired
	CartRepository cartRepo;

	public void insert() {


//		Student s1 = new Student(); s1.setStudentName("jaydeep");

//		Department d1 = new Department(1, "Admin", s1);
//		Department d2 = new Department(2, "IT", s1);
//		Set<Department> set = new HashSet<>(); 
//		set.add(d1);
//		set.add(d2); 
//		s1.setDept(set);

//		Student s2 = new Student(); 
//		s2.setStu_name("shreyoshi"); 
//		Set<Department> set1= new HashSet<>(); 
//		set1.add(new Department("IT")); 
//		s2.setDept(set1);
//
//		Student s3 = new Student(); 
//		s3.setStu_name("jaya");

//		stuRepo.save(s1); 
//		stuRepo.save(s2); 
//		stuRepo.save(s3);


		
		
		  Cart1 cart1 = new Cart1(); 
		  cart1.setName("MyCart1");
		  
		  Cart1 cart2 = new Cart1(); 
		  cart2.setName("MyCart2");
		  
		  Items1 item1 = new Items1("I10", 10, 1); 
		  Items1 item2 = new Items1("I20", 20, 2); 
		  Set<Items1> itemsSet = new HashSet<Items1>();
		  itemsSet.add(item1); 
		  itemsSet.add(item2);
		  
		  cart1.setItems1(itemsSet); 
		  
		  Items1 item3 = new Items1("I30", 30, 3); 
		  Items1 item4 = new Items1("I40", 40, 4);
		  Set<Items1> itemsSet2 = new HashSet<Items1>();
		  itemsSet2.add(item3);
		  itemsSet2.add(item4);
		  cart2.setItems1(itemsSet2);
		  
//		  Items1 item3 = new Items1("I30", 30, 3); 
//		  Set<Cart1> item3Carts = new HashSet<>();
//		  item3Carts.add(cart1);
//		  item3Carts.add(cart2);
//		  item3.setCarts(item3Carts);
		  
		  cart1.setTotal(10*1 + 20*2);
		  
		  cartRepo.save(cart1);
		  cartRepo.save(cart2);
//		  stuRepo.save(item3);
//		  stuRepo.save(item2);
		 
		 
	}
}
