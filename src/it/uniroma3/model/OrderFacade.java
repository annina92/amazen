package it.uniroma3.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import java.util.List;

@Stateless
public class OrderFacade {
	
	@PersistenceContext(unitName ="project-unit")
	private EntityManager em;
	
	public Order createOrder(){
		Order order= new Order();
		em.persist(order);
		return order;
	}
	
	public Order createOrder(Customer customer){
		Order order = new Order(customer); 
		em.persist(order);
		return order;
	}
		
	public Order getOrder(Long id){
		Order order = em.find(Order.class, id);
		return order;
	}
	
	public List<Order> getAllOrders(){
		CriteriaQuery<Order> cq = em.getCriteriaBuilder().createQuery(Order.class);
	    cq.select(cq.from(Order.class));
	    List<Order> orders = em.createQuery(cq).getResultList();
	    return orders;
	}
	
	public List<Order> getAllOrdersOfCustomer(Customer customer){
		return em.createNamedQuery("getAllOrdersOfCustomer").setParameter("customer", customer).getResultList();	
	}
	
	public void updateOrder (Order order){
		em.merge(order);
	}
	
	public void deleteOrder(Order order){
		em.remove(order);
	}
	
	public void deleteOrder(Long id){
		Order order = em.find(Order.class, id);
		em.remove(order);
	}

}
