package com.onlinepizza.service;

import java.time.LocalDate;
import java.util.List;

import com.onlinepizza.exceptions.OrderIdNotFoundException;
import com.onlinepizza.model.PizzaOrder;


public interface IPizzaOrderService {

		 PizzaOrder bookPizzaOrder(PizzaOrder order);
		  
		 PizzaOrder updatePizzaOrder(PizzaOrder order);
		 
		 PizzaOrder cancelPizzaOrder(int bookingOrderId);
		 
		 PizzaOrder  viewPizzaOrder(int bookingOrderId);
		 
		 List<PizzaOrder> viewOrdersList();
		 
		 List<PizzaOrder> viewOrdersList(LocalDate date) throws OrderIdNotFoundException;
		  
		 List<PizzaOrder> calculateTotal(String size, Integer quantity);
	}
