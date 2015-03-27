package it.uniroma3.controller;

import java.util.List;

import it.uniroma3.model.Admin;




import it.uniroma3.model.AdminFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class AdminController {
	
	private Long id;
	private String username;
	private String password;
	private Admin admin;
	private List<Admin> admins;

	@EJB
	private AdminFacade adminFacade;
	

	public String createAdmin(){
		this.admin = adminFacade.createAdmin(username, password);
		return "admin";
	}
	
	public String createNewAdmin(){
		return "newAdmin";
	}
	
	public String logIn(){
		String path = "errorLogIn";
		Admin admin = adminFacade.checkAdmin(this.username , this.password);
		if(admin != null){
			this.id = admin.getId();
			this.admin = admin;
			this.username=null;
			this.password=null;
			path = "adminIndex";
		}
		else{
			this.username=null;
			this.password=null;
		}
		return path;
	}
	
	public String formLogIn(){
		return "formLogIn";
	}
	
	public String newProduct(){
		if(this.id != null)
			return "newProduct";
		else
			return "formLogIn";
	}
	
	
/*	public String deleteAdmin(){
		adminFacade.deleteAdmin(id);
		return "admins";
	}
	*/
	public void setId(Long id){
		this.id = id;
	}
	
	public Long getId(){
		return this.id;
	}
	
	public String getUsername(){
		return this.username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public List<Admin> getAdmins() {
		return admins;
	}

	public void setAdmins(List<Admin> admins) {
		this.admins = admins;
	}
	
	

	
	
}
