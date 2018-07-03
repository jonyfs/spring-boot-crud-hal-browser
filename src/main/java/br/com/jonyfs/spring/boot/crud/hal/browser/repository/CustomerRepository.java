package br.com.jonyfs.spring.boot.crud.hal.browser.repository;

import br.com.jonyfs.spring.boot.crud.hal.browser.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long>, RevisionRepository<Customer, Long, Integer> {
    public Customer findByFirstName(String firstName);
}
