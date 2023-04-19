package com.BikkadIT.CrudRepositoryMethod.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.BikkadIT.CrudRepositoryMethod.model.User;

public interface UserServiceI {
//for Object save below used methods
	
/* public User saveUser(User user); //"user" is object its implemented in UserServiceImpl
	
 public List<User>saveAllUser(List<User>list);//used for list of All multiple data save
 
 public long countNoOfrecords();// no.of count of Data how much available in ourRecord
 
 public boolean existsRecord(int id);// to check for existByID Query 
 
 public User getRecordById(int id);// to check for getRecordByID Query
	
 public List<User>getAllUser(); // to check getAll Query
 
 public List<User>getRecordsMultiplePK(List<Integer>list); // to get details using multiple primary key
 
 public void deleteRecordById(int id); //to check deleteRecordbyId Query
 
 public void deleteRecordByObject(User user); //to check deleterecordByObject query
 
 public void deleteAllRecordbyMPK(List<Integer>list);  //delete query used by multiple PrimaryKey
 
 public void deleteAllRecords(); //deleteAll Query
 
 //=================now we are using JpaRepository========================//
 public Page<User>userPagination();*/
 
 public List<User>sortingUser(); // data sorting by any method(userid,username,...etc)
	} 

