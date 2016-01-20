package com.alithya.service;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alithya.domain.Member;

@Service
public class MemberService {
	@PersistenceContext
	private EntityManager em;
	private Logger logger = Logger.getLogger("MemberService");
	private List<Member> list = new LinkedList<Member>();
	
	@Transactional
	public List<Member> findAll() {
		list = em.createQuery("SELECT m FROM Member m", Member.class).getResultList();
		return list;
	}
	
	@Transactional
	public void add(Member member) {
		em.persist(member);
		//list.add(member);
	}
	
	@Transactional
	public Member login(String username, String password) {
		
		TypedQuery<Member> query = em.createQuery(
				"SELECT m FROM Member m WHERE m.username = :username AND m.password = :password",
				Member.class);
		query.setParameter("username", username);
		query.setParameter("password", password);
		try {
			return query.getSingleResult();
		}
		catch(NoResultException e) {
			return null;
		}
		
		
	}
}
