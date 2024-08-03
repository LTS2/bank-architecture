package com.universal.bankarchitecture.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.universal.bankarchitecture.config.auditor.BaseAuditorAware;

/**
 * @fileName    : JpaAuditConfig
 * @author      : ewjin
 * @since       : 2024. 8. 2.
 */
@EnableJpaAuditing(
	auditorAwareRef = "baseAuditorAware"
	// dateTimeProviderRef = "baseAuditorAware"
)
@Configuration
public class JpaAuditConfig {
	@Bean
	public AuditorAware<Long> auditorProvider() {
		return new BaseAuditorAware();
	}

}
