package br.com.jonyfs.spring.boot.crud.hal.browser.tests.repository;

import br.com.jonyfs.spring.boot.crud.hal.browser.model.Customer;
import br.com.jonyfs.spring.boot.crud.hal.browser.repository.CustomerRepository;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerRepositoryRevisionTests {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void whenSaved_thenReturnAuditedCustomer() {
        // given
        Customer customer = Customer
            .builder()
            .firstName("Joseph")
            .lastName("Smith")
            .build();
        // when
        Customer found = customerRepository.save(customer);

        // then
        assertThat(found);
        assertThat(found.getId()).isNotNull();
        assertThat(found.getCreatedDate()).isNotNull();
        assertThat(found.getLastModifiedDate()).isNotNull();
    }
}
