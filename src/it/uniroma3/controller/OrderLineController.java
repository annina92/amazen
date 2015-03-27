package it.uniroma3.controller;

import java.util.List;

import it.uniroma3.model.Customer;
import it.uniroma3.model.OrderLine;
import it.uniroma3.model.OrderLineFacade;
import it.uniroma3.model.Product;
import it.uniroma3.model.ProductFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean



public class OrderLineController {
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private float unitPrice;
	
	private Product product;
	
	private int quantity;
	
	private OrderLine orderLine;
	private List<OrderLine> orderLines;
	
	@EJB
	OrderLineFacade orderLineFacade;
	
	public String createOrderLine(){
		this.orderLine = orderLineFacade.createOrderLine(product, unitPrice, quantity);
		return "orderLine";
	}
	
	public String listOrderLines(){
		this.orderLines = orderLineFacade.getAllOrderLines();
		return "orderLines";
	}
	
	public String findOrderLine(){
		this.orderLine = orderLineFacade.getOrderLine(id);
		return "orderLinee";
	}
	

	
	public String findOrderLine(Long id) {
		this.orderLine = orderLineFacade.getOrderLine(id);
		return "orderLines";
	}
	
	public float getUnitPrice(){
		return this.unitPrice;
	}
	
	public int getQuantity(){
		return this.quantity;
	}
	
	public void setUnitPrice(float price){
		this.unitPrice = price;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
}
