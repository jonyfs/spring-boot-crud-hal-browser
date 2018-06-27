package br.com.jonyfs.spring.boot.crud.hal.browser.audit;
import org.hibernate.envers.RevisionListener;

public class AuditRevisionListener implements RevisionListener {

    @Override
    public void newRevision(Object revisionEntity) {
        AuditRevisionEntity auditRevisionEntity = (AuditRevisionEntity) revisionEntity;

        auditRevisionEntity.setUsername("wade.wilson");
    }

}
