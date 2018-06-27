package br.com.jonyfs.spring.boot.crud.hal.browser.repository;

import br.com.jonyfs.spring.boot.crud.hal.browser.model.Customer;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>, QuerydslPredicateExecutor<Customer> {

    public Customer findByFirstName(String firstName);

}
