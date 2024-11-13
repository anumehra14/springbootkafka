package com.spring_kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_kafka.service.UserProducerService;

@RestController
@RequestMapping("/userapi")
public class UserController
{

	@Autowired
	UserProducerService us;
	@PostMapping("/publish/{name}/{age}")
	
	public void sendData(@PathVariable String name ,@PathVariable int age)
	{
		us.sendMessage(name, age);
		System.out.println(name +"  "+ age );
	}
	
}
