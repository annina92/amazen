package it.uniroma3.model;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;


@Stateless
public class CustomerFacade {
	 
	@PersistenceContext(unitName = "project-unit")
    private EntityManager em;
	
	public Customer createCustomer (String firstName, String lastName, String email, String password, String phoneNumber, Address address, Date dateOfBirth){
		
		Customer customer = new Customer(firstName, lastName, email, password, phoneNumber, address, dateOfBirth);
		em.persist(customer);
		return customer;
	}
	
	public Customer getCustomer(Long id) {
		
		Customer customer = em.find(Customer.class, id);
		return customer;
	}
	
	public Customer getCustomer(String email) {
		Customer customer = em.find(Customer.class, email);
		return customer;
	}
	
	public List<Customer> getAllCustomers() {
		
		CriteriaQuery<Customer> cq = em.getCriteriaBuilder().createQuery(Customer.class);
		cq.select(cq.from(Customer.class));
		List<Customer> customers = em.createQuery(cq).getResultList();
		return customers;
		
	}
	
	public Customer checkCustomer(String email, String password){
		Customer customer;
		try{
		customer =(Customer) em.createNamedQuery("checkEmail").
				 setParameter("email", email).getSingleResult();
		} catch(Exception e){
			return null;
		}
		
		if (customer.getPassword().equals(password))
			return customer;
		else return null;
	}
	
	public void updateCustomer(Customer customer){
		em.merge(customer);
	}
	
	public void deleteCustomer(Customer customer){
		em.remove(customer);
	}
	
	public void deleteCustomer(Long id){
		Customer customer = em.find(Customer.class, id);
		deleteCustomer(customer);
	}
	
}