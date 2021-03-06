package com.deadlockarena.backend.config;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

/**
 * This class gets the application's current auditor.
 *
 * @author Phong Vo
 * @version 1.0
 * @since 1.0
 */
public class DeadlockAuditorAware implements AuditorAware<String> {

	/**
	 * Returns the current auditor of the application.
	 *
	 * @return the current auditor
	 */
	@Override
	public String getCurrentAuditor() {
		// the system will be used as the current auditor.
		return Optional.of("system").get();

	}
}