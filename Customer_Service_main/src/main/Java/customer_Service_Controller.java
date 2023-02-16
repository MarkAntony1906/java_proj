package com.tns.userService;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class user_Service_Controller 
{
  @Autowired(required=true)
  private user_Service service;
  
  @GetMapping("/userservice")
  public java.util.List<user>list()
  {
	  return service.listAll();
  }
  @GetMapping("/userservice/{user_Id}")
  public ResponseEntity <user> get(@PathVariable Integer user_Id)
  {
	  try
	  {
		user user = service.get(user_Id);
		return new ResponseEntity<user>(user,HttpStatus.OK);
	  }
	  catch(NoResultException e)
	  {
		  return new ResponseEntity<user>(HttpStatus.NOT_FOUND);
	  }
   
  }
	  @PostMapping("/userservice")
	  public void add(@RequestBody user user)
	  {
		  service.save(user);
	  }
	  @PutMapping ("/userservice/{user_Id}")
	  public ResponseEntity<?> update(@RequestBody user user, @PathVariable Integer user_Id)
	  {
		  user existuser = service.get(user_Id);
		  service.save(existuser);
		  return new ResponseEntity<>(HttpStatus.OK);
	  }
	  @DeleteMapping("/userservice/{user_Id}")
	  public void delete (@PathVariable Integer user_Id)
	  {
		  service.delete(user_Id);
	  }
   
}
