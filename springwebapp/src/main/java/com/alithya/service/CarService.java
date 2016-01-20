package com.alithya.service;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.alithya.domain.Car;

@Service
public class CarService {
	private List<Car> carList = new LinkedList<Car>();

	@PersistenceContext
	private EntityManager em;
	private Logger logger = Logger.getLogger("CarService");
	
	CarService() {
		//logger.info(em.toString());
		logger.info("Testing CarService");
		Car car1 = new Car();
		car1.setName("Mercedes SL");
		car1.setPrice(new BigDecimal(123400));
		carList.add(car1);
		
		Car car2 = new Car();
		car2.setName("BMW M6 Coupé");
		car2.setPrice(new BigDecimal(125000));
		carList.add(car2);

		Car car3 = new Car();
		car3.setName("Audi R8");
		car3.setPrice(new BigDecimal(136100));
		carList.add(car3);
	}
	
	public List<Car> findAll() {
		return carList;
	}
	
	public void add(Car car) {
		carList.add(car);
	}
}
