package it.uniroma3.model;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;


@Stateless
public class AddressFacade {
	
	@PersistenceContext(unitName = "project-unit")
    private EntityManager em;
	
	public Address createAddress(String street, String city, String zipCode, String country){
		Address address = new Address (street, city, zipCode,country);
		em.persist(address);
		return address;
	}
	
	public Address getAddress(Long id){
		Address address = em.find(Address.class, id);
		return address;
	}
	
	public List <Address> getAllAddress() {
		CriteriaQuery<Address> cq = em.getCriteriaBuilder().createQuery(Address.class);
        cq.select(cq.from(Address.class));
        List<Address> address = em.createQuery(cq).getResultList();
		return address;
	}
	
	public void updateAddress(Address address){
		em.merge(address);
	}
	
	public void deleteAddress(Address address){
		em.remove(address);
	}
	
	public void deleteAddress(Long id) {
       Address address = em.find(Address.class, id);
        deleteAddress(address);
	}
}
