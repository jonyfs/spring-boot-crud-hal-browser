package br.com.jonyfs.spring.boot.crud.hal.browser.audit;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@RevisionEntity(AuditRevisionListener.class)
public class AuditRevisionEntity extends DefaultRevisionEntity {

    @NotBlank
    private String username;

}
