package it.uniroma3.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import java.util.List;



import javax.persistence.PersistenceContext;

@Stateless
public class OrderLineFacade {
	
    @PersistenceContext(unitName = "project-unit")
    private EntityManager em;
    
	public OrderLine createOrderLine(Product product , int quantity, Order order) {
		OrderLine orderLine = new OrderLine(product, quantity, order);
		em.persist(orderLine);
		return orderLine;
	}
    
    public OrderLine getOrderLine(Long id){
    	OrderLine orderLine = em.find(OrderLine.class, id);
    	return orderLine;
    }
    
    public void updateOrderLine(OrderLine orderLine){
    	em.merge(orderLine);
    }
    
    public void removeOrderLine(OrderLine orderLine){
    	em.remove(orderLine);
    }
    
    public void removeOrderLine(Long id){
    	OrderLine orderLine = em.find(OrderLine.class, id);
    	em.remove(orderLine);
    }
    
    public List<OrderLine> getAllOrderLines (){
        CriteriaQuery<OrderLine> cq = em.getCriteriaBuilder().createQuery(OrderLine.class);
        cq.select(cq.from(OrderLine.class));
        List<OrderLine> orderLines = em.createQuery(cq).getResultList();
		return orderLines;
    }
    
    
}
