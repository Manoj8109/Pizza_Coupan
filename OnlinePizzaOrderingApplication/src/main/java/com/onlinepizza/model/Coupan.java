package com.onlinepizza.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.sun.istack.NotNull;
@Entity
@Table(name="Coupan1")
@SequenceGenerator(name="sequence", initialValue = 1, allocationSize = 1)
public class Coupan implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
	@Column(name="COUPANID",length=10)
	private Integer coupanId;
	@Column(length = 18)
	@NotNull
	private String coupanName;
	@Column(length = 35)
	private String coupanType;
	@Column(length = 60)
	private String coupanDescription;
	@Column(length = 5)
	@NotNull
	private Integer coupanPizzaId;
	
	/**
	 * Default constructor
	 */
	
	public Coupan() {
		
	}
	
	/**
	 * Parameterized constructor 
	 * @param coupanId
	 * @param coupanName
	 * @param coupanDescription
	 * @param coupanPizzaId
	 */
	public Coupan(String coupanName, String coupanType, String coupanDescription) {
		super();
		this.coupanName = coupanName;
		this.coupanType = coupanType;
		this.coupanDescription = coupanDescription;
	}
	
	/**
	 * 
	 * Getters and Setters
	 */
	public Integer getCoupanId() {
		return coupanId;
	}
	public void setCoupanId(Integer coupanId) {
		this.coupanId = coupanId;
	}
	public String getCoupanName() {
		return coupanName;
	}
	public void setCoupanName(String coupanName) {
		this.coupanName = coupanName;
	}
	public String getCoupanType() {
		return coupanType;
	}
	public void setCoupanType(String coupanType) {
		this.coupanType = coupanType;
	}
	public String getCoupanDescription() {
		return coupanDescription;
	}
	public void setCoupanDescription(String coupanDescription) {
		this.coupanDescription = coupanDescription;
	}
	public Integer getCoupanPizzaId() {
		return coupanPizzaId;
	}
	public void setCoupanPizzaId(Integer coupanPizzaId) {
		this.coupanPizzaId = coupanPizzaId;
	}	
	
	/**
	 * to String method
	 */
	@Override
	public String toString() {
	return "Coupan [coupanId=" + coupanId + ", coupanName=" + coupanName + ", coupanType=" + coupanType
				+ ", coupanDescription=" + coupanDescription + ", coupanPizzaId=" + coupanPizzaId + "]";
}
	
	
}