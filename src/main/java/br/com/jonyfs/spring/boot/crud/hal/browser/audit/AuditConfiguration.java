package br.com.jonyfs.spring.boot.crud.hal.browser.audit;

import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAwareImpl")
@Slf4j
public class AuditConfiguration {
    @PostConstruct
    public void logMessage() {
        LOGGER.info("STARTED");
    }
}
