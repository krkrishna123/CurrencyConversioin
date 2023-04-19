package com.BikkadIT.CrudRepositoryMethod.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.CrudRepositoryMethod.model.User;

@Repository        //inside the <Entityclass,PrimaryKeyDataType>
public interface UserRepository extends JpaRepository<User,Integer>{
	//1.this is by JpaRepository
	
	//public interface UserRepository extends CrudRepository<User,Integer>{
		//2.this is by crudRepository 
	

}
