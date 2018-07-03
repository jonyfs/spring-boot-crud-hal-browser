package br.com.jonyfs.spring.boot.crud.hal.browser.tests.repository;

import br.com.jonyfs.spring.boot.crud.hal.browser.model.Customer;
import br.com.jonyfs.spring.boot.crud.hal.browser.repository.CustomerRepository;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class CustomerRepositoryTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
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
