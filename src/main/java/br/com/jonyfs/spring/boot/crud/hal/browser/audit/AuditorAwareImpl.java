package br.com.jonyfs.spring.boot.crud.hal.browser.audit;

import br.com.jonyfs.spring.boot.crud.hal.browser.model.AuditableUser;
import java.util.Optional;
import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AuditorAwareImpl implements AuditorAware<AuditableUser> {

    @PostConstruct
    public void logMessage() {
        LOGGER.info("STARTED");
    }

    @Override
    public Optional<AuditableUser> getCurrentAuditor() {
        AuditableUser user = AuditableUser.builder().username("system").email("system@test.com").build();
        return Optional.of(user);
    }

}
