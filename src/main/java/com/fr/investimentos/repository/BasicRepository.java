package com.fr.investimentos.repository;

import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.support.SpringDataMongodbQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;

@Component
@Transactional
public class BasicRepository implements Repository {

    @Autowired
    private MongoTemplate template;

    @Override
    public <T> T find(Class<T> entityClass, Serializable id) {
        return template.findById(id, entityClass);
    }

    @Override
    public <T> void save(T entity) {
        Objects.requireNonNull(entity);
        template.save(entity);
    }

    @Override
    public <T> void remove(T entity) {
        Objects.requireNonNull(entity);
        template.remove(entity);
    }

    @Override
    public <T> Page<T> findAllWithPage(Class<T> entityClass, Pageable pageable, Predicate... where) {
        //TODO IMPLEMENTAR
        return null;
    }

    @Override
    public <T> Collection<T> findAll(Class<T> entityClass, Predicate... where) {
        SpringDataMongodbQuery<T> query = query(entityClass);
        query.where(where);
        return query.fetch();
    }

    private <T> SpringDataMongodbQuery<T> query(Class<T> entityClass) {
        return new SpringDataMongodbQuery<>(template, entityClass);
    }

}
