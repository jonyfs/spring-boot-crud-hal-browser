package br.com.jonyfs.spring.boot.crud.hal.browser.repository;

import br.com.jonyfs.spring.boot.crud.hal.browser.model.AuditableUser;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface AuditableUserRepository extends CrudRepository<AuditableUser, Long>, QuerydslPredicateExecutor<AuditableUser> {

}
