package it.uniroma3.controller;
import it.uniroma3.model.Customer;
import it.uniroma3.model.CustomerFacade;
import it.uniroma3.model.Order;
import it.uniroma3.model.OrderFacade;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class OrderController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private Date creationTime;
	private Date closedTime;
	private Date deliveryTime;
	private Order order;
	private List <Order> orders;
	
	@EJB
	OrderFacade orderFacade;
	
	@EJB
	CustomerFacade customerFacade;
	
	public String createOrder(){
		this.order = orderFacade.createOrder();
		return "order";
	}
	
	public String getAllOrderOfCustomer(Long customerid){
		Customer customer = customerFacade.getCustomer(customerid);
		this.orders = orderFacade.getAllOrdersOfCustomer(customer);
		return "orders";
	}
	
	public String listOrders(){
		this.orders = orderFacade.getAllOrders();
		return "orders";
	}
	
	public String findOrder(){
		this.order = orderFacade.getOrder(id);
		return "order";
	}
	
	public String findOrder(Long id) {
		this.order = orderFacade.getOrder(id);
		return "order";
	}
	
	public Long getId(){
		return this.id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	public Date getCreationTime(){
		return this.creationTime;
	}
	
}
	
