package com.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.ms.dubbo.service.HelloService;


/**
 * @author iengchen
 * @since 2018-11-24
 */

@RestController
public class HelloController {

	@Reference
	HelloService service;
	
	@RequestMapping("/say")
	public String sayHello(@RequestParam String name) {
		System.out.println("用户名是："+name);
		
		return service.sayHello(name);
	}

}
