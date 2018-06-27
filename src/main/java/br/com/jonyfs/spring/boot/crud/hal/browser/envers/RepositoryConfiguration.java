package br.com.jonyfs.spring.boot.crud.hal.browser.envers;

import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.envers.repository.support.EnversRevisionRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
    repositoryFactoryBeanClass = EnversRevisionRepositoryFactoryBean.class
)
@Slf4j
public class RepositoryConfiguration {

    @PostConstruct
    public void logMessage() {
        LOGGER.info("STARTED");
    }
}
