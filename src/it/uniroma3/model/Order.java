package it.uniroma3.model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="orders")
@NamedQuery(name="getAllOrdersCustomer", query="SELECT OBJECT (o) FROM Order o WHERE o.customer = :customer")


public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date creationTime;
	
	@Temporal(TemporalType.DATE)
	private Date closedTime;
	
	@Temporal(TemporalType.DATE)
	private Date deliveryTime;
	
	@ManyToOne
	private Customer customer;
	
	@OneToMany
	@JoinColumn(name ="orders_id")
	private List<OrderLine> orderLines;
	

	
	public Order(){
		this.creationTime = new Date();
		this.orderLines = new LinkedList<OrderLine>();
	}
	
	public Order(Customer customer){
		this();
		this.customer = customer;
	}
	
	public Long getId(){
		return this.id;
	}
	
	public Date getClosedTime(){
		return this.closedTime;
	}
	
	public void setClosedTime(Date closedTime){
		this.closedTime = closedTime;
	}
	
	public Date getCreationTime(){
		return this.creationTime;
	}
	
	public void setCreationTime(Date creation){
		this.creationTime = creation;
	}
	
    public boolean equals(Object obj) {
        Order order = (Order)obj;
        return this.creationTime.equals(order.getCreationTime());
    }

    public int hashCode() {
         return this.getCreationTime().hashCode();
    }

}
