package it.uniroma3.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

public class Provider {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String phoneNumber;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String vatin;
	
	@OneToOne
	private Address address;
	
	@ManyToMany
	private List <Product> products;
	
	
	public Provider() {
		
	}
	
	public Provider(String name, String phoneNumber, String email, String vatin,
			Address address){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.vatin = vatin;
		this.address = address;
	}
	
	// Getter & Setter
	
	    public String getId() {
	        return this.id;
	    }
	    
	    public String getName() {
	    return this.name;
	    }
	    
	    public void setName(String name){
	    	this.name = name;
	    }
	    
	    public String getPhoneNumber() {
	    	return this.phoneNumber;
	    }
	    
	    public void setPhoneNumber(String phoneNumber) {
	    	this.phoneNumber = phoneNumber;
	    }
	    
	    public String getEmail() {
	    	return this.email;
	    }
	    
	    public void setEmail(String email) {
	    	this.email = email;
	    }
	    
	    public String getVatin(){
	    	return this.vatin;
	    }
	    
	    public void setVatir(String vatin) {
	    	this.vatin = vatin;
	    }
	    
	    public Address getAddress(){
	    	return this.address;
	    }
	    
	    public void setAddress(Address address){
	    	this.address = address;
	    }
	    
	    public boolean equals(Object obj) {
	        Provider provider = (Provider)obj;
	        return this.getVatin().equals(provider.getVatin());
	    }

	    public int hashCode() {
	         return this.vatin.hashCode();
	    }

	    public String toString() {
	        final StringBuilder sb = new StringBuilder();
	        sb.append("Provider"); 
	        sb.append("{id=").append(id); 
	        sb.append(", name='").append(name); 
	        sb.append(", phoneNumber=").append(phoneNumber); 
	        sb.append(", email='").append(email); 
	        sb.append(", vatin='").append(vatin);
	        sb.append("}\n");
	        return sb.toString();
	    
		
	    }

}
