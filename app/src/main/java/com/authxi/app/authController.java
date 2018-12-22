package com.authxi.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class authController {
	
	@Autowired
	private UserService userInstance;

	@RequestMapping("/")
	public String welcome(){
		return "- Welcome- Application Default Page ";
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/register")
	public void registerUser(@RequestBody String name,@RequestBody String Profession, @RequestBody Integer age,@RequestBody String passwd ){
		 User user = new User(name, Profession, age, passwd);
		 userInstance.addUser(user);
    }
    
    @RequestMapping("/users")
	public List<User> retrieveAllUsers(){
		return userInstance.getallUsers();
    }

    @RequestMapping("/users/{name}")
	public User retrieveSingleUser(@PathVariable String name) {
		return userInstance.getSingleUser(name);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/users/edit/{name}")
	public String editUser(@PathVariable String name, @RequestBody User newUser ){
		 return userInstance.editUser(name, newUser);
	}
	
    @RequestMapping(method=RequestMethod.DELETE, value="/users/del/{name}")
	public void deleteUser(@PathVariable String name ){
		 userInstance.deleteUser(name);
	}
}
