package com.deadlockarena.backend.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Configuration targeting the JPA and transactions of database.
 *
 * @author Phong Vo
 * @version 1.0
 * @since 1.0
 */
@Configuration
@EnableTransactionManagement
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@EntityScan(basePackages = "com.deadlockArena.backEnd.entity")
@EnableJpaRepositories(basePackages = "com.deadlockArena.backEnd.repository")
public class JpaConfig {

	/**
	 * A bean to be served for the AuditorAware interface.
	 *
	 * @return auditorAware instance.
	 */
	@Bean
	public AuditorAware<String> auditorAware() {
		return new DeadlockAuditorAware();
	}
}