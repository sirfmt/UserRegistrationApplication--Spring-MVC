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
	private ChildService childInstance;

	@RequestMapping("/")
	public String welcome(){
		return "- Welcome- Application Default Page ";
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/register")
	public void registerChild(@RequestBody Child child){
		 //Child user = new Child(name, surname, age, parentName);
		 childInstance.addChild(child);
    }
    
    @RequestMapping("/records")
	public List<Child> retrieveAllRecords(){
		return childInstance.getRecords();
    }

    @RequestMapping("/records/{name}")
	public Child retrieveSingleChild(@PathVariable String name) {
		return childInstance.getSingleChild(name);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/records/edit/{name}")
	public void editChildRecord(@PathVariable String name, @RequestBody Child newUser ){
		 childInstance.editChild(name, newUser);
	}
	
    @RequestMapping(method=RequestMethod.DELETE, value="/records/del/{name}")
	public void deleteChild(@PathVariable String name ){
		 childInstance.deleteChild(name);
	}
}
