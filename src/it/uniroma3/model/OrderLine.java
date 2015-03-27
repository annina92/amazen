package it.uniroma3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Column;
import javax.persistence.Table;


@Entity
@Table (name="orders_line")
@NamedQuery(name="getOrderLines", query="SELECT OBJECT (ol) FROM OrderLine ol WHERE ol.order = :order")


public class OrderLine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column (nullable = false)
	private float unitPrice;
	
	private Product product;
	
	
	private int quantity;
	
	public OrderLine(){
		
	}
	
	public OrderLine(Product product , int quantity, Order order){
		this.product = product;
		this.unitPrice = product.getPrice();
		this.name = product.getName();
		this.quantity = quantity;
		this.order = order;
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
	
    public boolean equals(Object obj) {
        OrderLine orderLine = (OrderLine)obj;
        return this.getUnitPrice() == orderLine.getUnitPrice()
        		&& this.getQuantity() == orderLine.getQuantity();
    }

    public int hashCode() {
         return (int)getUnitPrice()+ getQuantity();
    }
}
