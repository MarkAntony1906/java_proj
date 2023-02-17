package com.tns.CustomerService;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class customer_Service 

{
  @Autowired
  private customer_Service_Repository repo;
        
      public List<user> listAll()
      {
    	  return repo.findAll();
      }
      
      public void save(user user)
      {
    	  repo.save(user);
      }
      
      public user get(Integer user_Id)
      {
    	  return repo.findById(user_Id).get();
      }
      
      public void delete(Integer user_Id)
      {
    	  repo.deleteById(user_Id);
      }
  
}
