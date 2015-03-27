package it.uniroma3.model;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

@Stateless
public class AdminFacade {
	
	@PersistenceContext(unitName = "project-unit")
    private EntityManager em;
	
	public Admin createAdmin(String email, String password){
		Admin admin = new Admin (email, password);
		em.persist(admin);
		return admin;
	}
	
	public Admin checkAdmin(String username , String password){	
		Admin admin;
		try {
			admin =(Admin) em.createNamedQuery("checkUsername").setParameter("username", username).getSingleResult();
		}catch(Exception e){
			return null;
		}
		if(admin.getPassword().equals(password))
			return admin;
		else
			return null;
	}
	
	public Admin getAdmin(Long id) {
		Admin admin = em.find(Admin.class, id);
		return admin;
	}
	
	public void updateAdmin(Admin admin){
		em.merge(admin);
	}
	
	public void deleteAdmin(Admin admin){
		em.remove(admin);
	}
	
	public void deleteAdmin(Long id) {
	       Admin admin = em.find(Admin.class, id);
	        deleteAdmin(admin);
	}
	
	
	public List <Admin> getAllAdmins() {
		CriteriaQuery<Admin> cq = em.getCriteriaBuilder().createQuery(Admin.class);
        cq.select(cq.from(Admin.class));
        List<Admin> admin = em.createQuery(cq).getResultList();
		return admin;
	}

}
