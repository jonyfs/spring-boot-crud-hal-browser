package br.com.jonyfs.spring.boot.crud.hal.browser.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AuditableEntity implements Serializable {

    @Column(nullable = false)
    @CreatedDate
    protected LocalDateTime createdDate;

    @Column(nullable = false)
    @LastModifiedDate
    protected LocalDateTime lastModifiedDate;

    @ManyToOne
    @CreatedBy
    protected AuditableUser createdBy;

    @ManyToOne
    @LastModifiedBy
    protected AuditableUser lastModifiedBy;

    @Version
    private Integer version;

}
