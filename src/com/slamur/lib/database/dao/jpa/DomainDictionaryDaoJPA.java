package com.slamur.lib.database.dao.jpa;

import com.slamur.lib.database.dao.DomainDictionaryDao;
import com.slamur.lib.database.domain.DomainDictionaryEntity;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class DomainDictionaryDaoJPA<EntityType extends DomainDictionaryEntity>
        extends DomainNamedDaoJPA<EntityType>
        implements DomainDictionaryDao<EntityType> {

    protected DomainDictionaryDaoJPA(Class<EntityType> entityClass) {
        super(entityClass);
    }
}