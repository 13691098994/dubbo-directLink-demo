package com.ms.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author iengchen
 * @since 2018-11-24
 */


@Service
public class HelloServiceImpl implements HelloService{

	@Override
	public String sayHello(String name) {
		return "hello,"+name;
	}

	

}
