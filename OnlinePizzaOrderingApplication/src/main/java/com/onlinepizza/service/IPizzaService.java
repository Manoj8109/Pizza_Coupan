package com.onlinepizza.service;

import java.util.List;

import com.onlinepizza.exceptions.InvalidMinCostException;
import com.onlinepizza.exceptions.PizzaIdNotFoundException;
import com.onlinepizza.model.Pizza;

public interface IPizzaService {

	Pizza addPizza(Pizza pizza);

	Pizza updatePizza(Pizza pizza);

	Pizza deletePizza(int pizza);

	List<Pizza> viewPizzaList();

	Pizza viewPizza(int pizzaId) throws PizzaIdNotFoundException;

	List<Pizza> viewPizzaList(double minCost, double maxCost)throws InvalidMinCostException ;

	List<Pizza> viewPizza(String pizzaType);

}
