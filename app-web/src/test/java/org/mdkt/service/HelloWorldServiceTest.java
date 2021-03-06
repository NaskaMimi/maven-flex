package org.mdkt.service;

import org.mdkt.service.impl.HelloWorldServiceImpl;

import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

public class HelloWorldServiceTest extends AbstractDependencyInjectionSpringContextTests {

	private HelloWorldService helloWorldService;
	
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	protected String[] getConfigLocations() {
		return new String[] {"applicationContext-resource.xml", "applicationContext-service.xml"};
	}
	
	public void testSay() {
		assertTrue(helloWorldService.say("Trung").startsWith("Hello"));
	}

}

