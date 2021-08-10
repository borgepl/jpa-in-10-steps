package com.deborger.spring.jpa.jpain10steps.dao;

import com.deborger.spring.jpa.jpain10steps.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDaoService {

    @PersistenceContext
    private EntityManager entityManager;

    public Long insert(User user ) {
        entityManager.persist(user);
        return user.getId();
    }
}
