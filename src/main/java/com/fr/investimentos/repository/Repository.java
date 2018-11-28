package com.fr.investimentos.repository;

import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.Collection;

public interface Repository {

    <T> T find(Class<T> entityClass, Serializable id);

    <T> void save(T entity);

    <T> void remove(T entity);

    <T> void remove(Class<T> entityClass, Serializable id);

    <T> Page<T> findAllWithPage(Class<T> entityClass, Pageable pageable, Predicate... where);

    <T> Collection<T> findAll(Class<T> entityClass, Predicate... where);

}
