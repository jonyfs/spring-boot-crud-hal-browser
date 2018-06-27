package br.com.jonyfs.spring.boot.crud.hal.browser.audit;

import br.com.jonyfs.spring.boot.crud.hal.browser.model.AuditableUser;
import java.util.Optional;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

@Component
public class AuditorAwareImpl implements AuditorAware<AuditableUser> {

    @Override
    public Optional<AuditableUser> getCurrentAuditor() {
        AuditableUser user = AuditableUser.builder().username("system").email("system@test.com").build();
        return Optional.of(user);
    }

}
