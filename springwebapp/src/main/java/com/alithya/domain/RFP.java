package com.alithya.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rfp")
public class RFP {
	@Id
	@GeneratedValue
	private int rfp_id;
	
	private String name;
	private Date due_date;
	private Date date_received;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRfp_id() {
		return rfp_id;
	}
	public void setRfp_id(int rfp_id) {
		this.rfp_id = rfp_id;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public Date getDate_received() {
		return date_received;
	}
	public void setDate_received(Date date_received) {
		this.date_received = date_received;
	}
	
	

}
