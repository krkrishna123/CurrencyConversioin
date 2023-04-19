package com.BikkadIT.CrudRepositoryMethod.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.BikkadIT.CrudRepositoryMethod.model.User;
import com.BikkadIT.CrudRepositoryMethod.repository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceI{
	
@Autowired	
private UserRepository userRepository;

//==============(1).crud Repository Operation================//

/*@Override
public User saveUser(User user) {
	User user2=userRepository.save(user);
	return user2; //here we pass the value of object and made method in controller layer
}

@Override
public List<User> saveAllUser(List<User> list) {
	List<User>saveAll=(List<User>)userRepository.saveAll(list);
	return saveAll;               //here Save All query are implemented
}

@Override
public long countNoOfrecords() {   
	long count=userRepository.count();
	return count;                       //here :"count" query are implemented
}

@Override
public boolean existsRecord(int id) {      
    boolean existsById=userRepository.existsById( id);
	return existsById ;                         //here "existById" query are implemented
}

@Override
public User getRecordById(int id) {            //here "getRecordById" query are implemented
	User findById=userRepository.findById(id).get();
	return findById;
}

@Override
public List<User> getAllUser() {                   //here "findByAll" query are implemented
List<User>findAll=(List<User>)userRepository.findAll();
	return  findAll;
}

@Override
public List<User> getRecordsMultiplePK(List<Integer> list) {
	List<User>allByID=(List<User>)userRepository.findAllById(list);
	return allByID;                        //findByAllIterator query implemented by MultiplePrimary key
}

@Override
public void deleteRecordById(int id) {
	userRepository.deleteById(id);
	
}

@Override
public void deleteRecordByObject(User user) {
	userRepository.delete(user);
	
}

@Override
public void deleteAllRecordbyMPK(List<Integer> list) {
	userRepository.deleteAllById(list);
	
}

@Override
public void deleteAllRecords() {
	userRepository.deleteAll();
	
}
//================(2).jpa repository operation================//
@Override
public Page<User> userPagination() {
	//PageRequest of=PageRequest.of(0, 3);//at 0 no.record we want 3 details fetch
	//PageRequest of=PageRequest.of(1, 4);//at 1 no.record we want 4 details fetch
	PageRequest of=PageRequest.of(1, 4);//at 2 no.record we want 9 details fetch
	
	Page<User>findAll=userRepository.findAll(of);
	return findAll;
}*/

@Override
public List<User> sortingUser() {          
	List<User>findAll=userRepository.findAll(Sort.by("userAddress").descending()); // data sorting by userName; here in " -" we use bywhich data print whatever we want,like :- userName,userId,userAddress......etc.
	//List<User>findAll=userRepository.findAll(Sort.by("userId").descending()); //data sorting by userId;
	return findAll;                //bydefault it ascending but here we are try descending order data print and fetch
}

	
}



