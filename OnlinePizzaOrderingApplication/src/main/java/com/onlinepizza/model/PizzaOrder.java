package com.onlinepizza.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "PizzaOrder1")
public class PizzaOrder implements Serializable {
	
	/**
	 * Author G Bhagya Sri 
	 * 
	 */
	
	/**
	 * Data fields for  PizzaOrder 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookingOrderId;
	private String Size1;
	private Integer quantity1;
	private Double totalCost;
	private String transactionMode;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="PIZZAID")
	private Pizza pizza;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ORDERID")                       
	private Order order2;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="COUPANID")
	private Coupan coupan;  
	
	/**
	 * Default constructor
	 */
	public PizzaOrder() {
	
	}
	
	/**
	 * Parameterized constructor 
	 * @param Size1
	 * @param quantity1
	 * @param totalCost
	 * @param transactionMode
	 * @param pizza
	 * @param order2
	 * @param coupan
	 */
	
	public PizzaOrder( String Size1,Integer quantity1,Double totalCost,String transactionMode,Pizza pizza,Order order2,Coupan coupan)
	 {
		super();
		this.Size1 = Size1;
		this.quantity1 = quantity1;
		this.totalCost = totalCost;
		this.transactionMode = transactionMode;
		 this.order2=order2; 
		this.coupan=coupan;
		this.pizza=pizza;
		
	}

	/**
	 * Getters and Setters
	 */
	
	public int getBookingOrderId() {
		return bookingOrderId;
	}

	public void setBookingOrderId(Integer bookingOrderId) {
		this.bookingOrderId = bookingOrderId;
	}

	public String getSize1() {
		return Size1;
	}

	public void setSize1(String size1) {
		this.Size1 = size1;
	}

	public int getQuantity1() {
		return quantity1;
	}

	public void setQuantity1(Integer quantity1) {
		this.quantity1 = quantity1;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public String getTransactionMode() {
		return transactionMode;
	}

	public void setTransactionMode(String transactionMode) {
		this.transactionMode = transactionMode;
	}


	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
}


  public Order getOrder2()
  { 
	  return order2;
  }
  
  public void setOrder2(Order order) {
	  this.order2 = order; 
	  }
 

	public Coupan getCoupan() {
	return coupan;
	}

	public void setCoupan(Coupan coupan) {
		this.coupan = coupan;
      }
	
	/**
	 * toString method
	 */

	@Override
	public String toString() {
		return "PizzaOrder [bookingOrderId=" + bookingOrderId + ", Size1=" + Size1 + ", quantity1=" + quantity1
				+ ", totalCost=" + totalCost + ", transactionMode=" + transactionMode + ", pizza=" + pizza + ", order2="
				+ order2 + ", coupan=" + coupan + "]";
	}
	public void close() {
		// TODO Auto-generated method stub
		
	}

	
	
}
