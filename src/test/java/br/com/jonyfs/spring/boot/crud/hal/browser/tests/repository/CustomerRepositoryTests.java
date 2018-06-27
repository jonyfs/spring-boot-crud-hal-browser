package br.com.jonyfs.spring.boot.crud.hal.browser.tests.repository;

import br.com.jonyfs.spring.boot.crud.hal.browser.model.Customer;
import br.com.jonyfs.spring.boot.crud.hal.browser.repository.CustomerRepository;
import javax.annotation.Resource;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CustomerRepositoryTests {

    @Autowired
    private TestEntityManager entityManager;

    @Resource
    private CustomerRepository customerRepository;

    @Test
    public void whenFindByName_thenReturnCustomer() {
        // given
        Customer customer = Customer
            .builder()
            .firstName("John")
            .lastName("Smith")
            .build();
        entityManager.persist(customer);
        entityManager.flush();

        // when
        Customer found = customerRepository.findByFirstName(customer.getFirstName());

        // then
        assertThat(found.getFirstName()).isEqualTo(customer.getFirstName());
    }
}
