package com.BikkadIT.CrudRepositoryMethod.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.CrudRepositoryMethod.model.User;
import com.BikkadIT.CrudRepositoryMethod.service.UserServiceI;

@RestController                            //its response to ModelAndView
public class UserController {
	
    @Autowired                          //here UserService  inject in userviceI and usersrviceI inject in controller
	private UserServiceI userServiceI ;
                                        // here we pass the value f object User "user"
/*	public User saveUser(User user) {
	User user2=userServiceI.saveUser(user);	
		return user2;                       //here now if want to data for front-end,then its ready for it.we can show at jsp pages if want.
		
	                                              	//but here we skip front end portion and we used direct used in main method and try to give it persistence layer
	
	}
	public List<User> saveAllUser(List<User> list) {
		List<User>saveAll=(List<User>)userServiceI.saveAllUser(list);
		return saveAll;
	}                                             //here saveAll value injecting service to usercontroller layer
	public long countNoOfrecords() {
		long count=userServiceI.countNoOfrecords();
		return count;                               //here no.ofrecords value injecting servivce to usercontroller layer
	}
	public boolean existsRecord(int id) {      
		 boolean existsById=userServiceI.existsRecord(id);
		return existsById ;                         //here "existById" query injected by service to controller layer
	}
	public User getRecordById(int id) {            //here "getRecordById" query are injected service to controller layer
		User findById=userServiceI.getRecordById(id);
		return findById;
}
	public List<User> getAllUser() {                   //here "findByAll" query are injected service laye to controller layer
		List<User>findAll=(List<User>)userServiceI.getAllUser();
			return  findAll;
		}
	public List<User> getRecordsMultiplePK(List<Integer> list) {
		List<User>allByID=(List<User>)userServiceI.getRecordsMultiplePK(list);
		return allByID;                        //findByAllIterator query injected by MultiplePrimary key service layer to controller layer
	}
	public void deleteRecordById(int id) {     //DeleteRecordById Query
		userServiceI.deleteRecordById(id);
	}
	public void deleteRecordByObject(User user) { // delete recordByObject
		userServiceI.deleteRecordByObject(user);
	}
	public void deleteAllRecordbyMPK(List<Integer> list) { //delete Query byMPK
		userServiceI.deleteAllRecordbyMPK(list);
	}
	public void deleteAllRecords() {              //deleteAll query 
		userServiceI.deleteAllRecords();
	}
	
	//================jpa Repository Operation===================//
	public Page<User> userPagination() {
		 
		
		Page<User>findAll=userServiceI.userPagination();
		return findAll;
	}*/
	public List<User> sortingUser() {
		List<User>findAll=userServiceI.sortingUser(); //we are apply here Sorting method 
		return findAll;
	}
	
	}
