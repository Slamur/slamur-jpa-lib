package com.slamur.lib.database.dao.jpa;

import com.slamur.lib.database.dao.DomainNamedDao;
import com.slamur.lib.database.domain.DomainNamedEntity;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class DomainNamedDaoJPA<EntityType extends DomainNamedEntity>
        extends DomainDaoJPA<EntityType>
        implements DomainNamedDao<EntityType> {

    protected DomainNamedDaoJPA(Class<EntityType> entityClass) {
        super(entityClass);
    }
}