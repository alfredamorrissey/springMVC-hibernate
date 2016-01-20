package com.alithya.service;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alithya.domain.RFP;

@Service
public class RFPService {
	@PersistenceContext
	private EntityManager em;
	private Logger logger = Logger.getLogger("RFPService");
	private List<RFP> list = new LinkedList<RFP>();
	
	@Transactional
	public List<RFP> findAll() {
		logger.info("findAll");
		logger.info(em.toString());
		if (em.isOpen())
			logger.info("Entity Manager is open");
		list = em.createQuery("SELECT r FROM RFP r", RFP.class).getResultList();
		return list;
	}
	
	@Transactional
	public void add(RFP rfp) {
		//list.add(rfp);
		em.persist(rfp);
	}
}
