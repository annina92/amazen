package it.uniroma3.model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQuery (name = "checkUsername", query ="SELECT a FROM Admin a WHERE a.username =: username")

public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(unique = true , nullable = false)
	private String username;
	
	@Column(nullable = false)
	private String password;
	
	public Admin(){}
	
	public Admin(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	public Long getId(){
		return this.id;
	}
	
	public void setId(){
		this.id = id;
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
	
    public boolean equals(Object obj) {
        Admin admin = (Admin)obj;
        return this.username.equals(admin.getUsername())&&
        		this.password.equals(admin.getPassword());
    }
    
    public int hashCode() {
        return this.username.hashCode()+ this.password.hashCode();
   }
}