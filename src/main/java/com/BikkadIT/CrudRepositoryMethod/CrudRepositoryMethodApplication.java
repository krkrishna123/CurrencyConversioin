package com.BikkadIT.CrudRepositoryMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;

import com.BikkadIT.CrudRepositoryMethod.cotroller.UserController;
import com.BikkadIT.CrudRepositoryMethod.model.User;

@SpringBootApplication
public class CrudRepositoryMethodApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(CrudRepositoryMethodApplication.class, args);
		UserController controller=context.getBean(UserController.class);
//=============(1)CRUD Repository operation===========================//	
		//==========Normal CURD OPeration=============//
		//User user=new User();

		//user.setUserId(111);  //insert the value
		//user.setUserName("Santosh");
		//user.setUserAddress("Pune");
		//user.setUserAge(55);
		
		
		//user.setUserId(111);     //here we are add values
	    //user.setUserName("Bikkad");
		//user.setUserAddress("Mumbai");
	    //user.setUserAge(53);
		
		
	    //user.setUserId(1);     //here we are upadte old values
     	//user.setUserName("Ganesh");
		//user.setUserAddress("Mumbai");
		//user.setUserAge(53);
//============list of multipleData================//
	/*	User user=new User();
		user.setUserId(3);     
	    user.setUserName("Rama");
		user.setUserAddress("Rajasthan");
	    user.setUserAge(76);
	    
	    User user1=new User();
		user1.setUserId(1);     
	    user1.setUserName("Bijli");
		user1.setUserAddress("Badh");
	    user1.setUserAge(25);
	    
	    User user2=new User();
		user2.setUserId(116);     
	    user2.setUserName("Manjunath");
		user2.setUserAddress("Mysore");
	    user2.setUserAge(15);
		List<User>list=new ArrayList();
		list.add(user);
		list.add(user1);
		list.add(user2);    //here we are fire SaveAll query for insert data and Update
		
	 List<User>saveAllUser=controller.saveAllUser(list);   //we call here saveAll method 
	    System.out.println(saveAllUser);*/
//==============for multipledataRecord count method====================//
		
//long countNoOfrecords=controller.countNoOfrecords();    //we call here No.ofcount method
//System.out.println(countNoOfrecords);
		
//+++++++++++++ExistByID Query+++++++++++++++++++//		
	//boolean existsRecord=controller.existsRecord(9)	; // here  "2" is id name,see avalaible(exist) or not in reords by existByID
	//	System.out.println(existsRecord);
		
//-----------GetRecordById Query---------------//
	//	User user=controller.getRecordById(1);  // here "1" is id gets all details in records
		//System.out.println(user);
		
		
//===========findByAll query ==================//		
	//	List<User>allUser=controller.getAllUser();
	//	System.out.println(allUser);
		
//==============findByAll query by multiple primary key================//
 //List<Integer>list=Arrays.asList(2,6); // here we want to fetch  data from list of 6 (id=2,6) data
	
 //List<User>recordsMultiplePK=controller.getRecordsMultiplePK(list);
 //System.out.println(recordsMultiplePK);
	
		//=============deleteRecordById query=========================//
		
		//controller.deleteRecordById(4);
		
		//==================deleteRecordbyObject Query==================//
		
	//	User user=new User();
	//user.setUserId(3);
	//controller.deleteRecordByObject(user);
		
		
//===============deleteAll query  by Multiple Primary key=================//	
		
	//	List<Integer>list=Arrays.asList(1,2);
		
//		controller.deleteAllRecordbyMPK(list);
			
//===============deleteAll query ======================//		
		//controller.deleteAllRecords();
		
//================(2.) Jpa Repository operation=========================//
		//Page<User>userPagination=controller.userPagination();
		//System.out.println(userPagination);
	//	for(User u:userPagination) {
		//	System.out.println(u);
		
		List<User>sortingUser=controller.sortingUser();//here we are apply sortingMethod
		System.out.println(sortingUser);
		
		for(User u:sortingUser) {  //we are print sorting value by for each loop//by defalut is ascending order
			System.out.println(u);
		}
		
		
		
		}
		
	}


