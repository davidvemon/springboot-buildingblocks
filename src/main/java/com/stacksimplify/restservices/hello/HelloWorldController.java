package com.stacksimplify.restservices.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {
	
	//Simple Method
	//uri - /helloworld
	//GET
	//@RequestMapping(method=RequestMethod.GET,path="/helloworld")
	@GetMapping("helloworld1")
	public String helloWorld() {
		return "Hello World1!!";
	}
	
	@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean() {
		return new UserDetails("Deivid", "Vences", "México");
	}

}