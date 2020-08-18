package com.learningJPA.JpaLearn.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.learningJPA.JpaLearn.entity.User;

@Repository
@Transactional
public class UseeDaoService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User use) {
		entityManager.persist(use);
		return use.getId();
	}

}
