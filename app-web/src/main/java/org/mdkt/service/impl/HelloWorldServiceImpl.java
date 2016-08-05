/**
 * Copyright Standard Chartered Bank Singapore.
 */
package org.mdkt.service.impl;

import org.mdkt.service.HelloWorldService;

/**
 * 
 * 
 */
public class HelloWorldServiceImpl implements HelloWorldService {

	/* (non-Javadoc)
	 * @see org.mdkt.app.service.HelloWorldService#say(java.lang.String)
	 */
	public String say(String name) {
		return "Hello " + name;
	}

}
