package com.deadlockarena.backend.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.deadlockarena.backend.service.Microservice;

/**
 * A collection of utilities used for the spring framework.
 *
 * @author zsaordenio
 *
 */
@Component
public class SpringUtils {

	public static Microservice microservice;

	/**
	 * A quick workaround if @Autowired is delayed in the spring bean creation
	 * queue.
	 *
	 * Make Spring inject the application context and save it on a static variable,
	 * so that it can be accessed from any point in the application.
	 */
	@Autowired
	private void setJpaGetData(Microservice microservice) {
		microservice = microservice;
	}
}