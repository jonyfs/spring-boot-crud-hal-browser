package br.com.jonyfs.spring.boot.crud.hal.browser.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import lombok.*;
import org.hibernate.envers.Audited;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
@Entity
@Audited
public class Customer extends AuditableEntity {

    private static final long serialVersionUID = -8040948310012296926L;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

}
