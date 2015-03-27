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

@NamedQuery (name = "checkEmail", query ="SELECT c FROM Customer c WHERE c.email = :email")


public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String firstName;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String phoneNumber;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
	@Column(nullable = false)
	private String password;
	
	@OneToOne (cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
	private Address address;
	
	@Temporal(TemporalType.DATE)
	private Date registrationDate;
	
	@OneToMany 
	@JoinColumn( name = "customer_id")
	@OrderBy("creationdate asc")
	private List <Order> orders;
	
	
	public Customer() {
		
	}
	
	public Customer (String firstName, String lastName, String email, String password, String phoneNumber, Address address, Date dateOfBirth){
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.registrationDate = new Date();
		this.orders = new LinkedList<Order>();
	}
	
	//  Getter & Setter
	
	public Long getId(){
		return this.id;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public Date getRegistrationDate(){
		return this.registrationDate;
	}
	
	public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
    	return this.lastName;
    }
    
    public void setLastName(String lastName) {
    	this.lastName = lastName;
    }
    
    public String getEmail() {
    	return this.email;
    }
    
    public void setEmail(String email) {
    	this.email = email;
    }
    
    public String getPhoneNumber() {
    	return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber){
    	this.phoneNumber = phoneNumber;
    }
    
    public String getPassword(){
    	return this.password;
    }
    
    public Address getAddress(){
    	return this.address;
    }
    
    public void setAddress(Address address){
    	this.address = address;
    }
    
    public boolean equals(Object obj) {
        Customer customer = (Customer)obj;
        return this.email.equals(customer.getEmail());
    }

    public int hashCode() {
         return this.email.hashCode();
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Customer"); 
        sb.append("{id=").append(id); 
        sb.append(", firstName='").append(firstName); 
        sb.append(", lastName=").append(lastName); 
        sb.append(", email='").append(email); 
        sb.append(", phoneNumber='").append(phoneNumber);
        sb.append(", dateOfBirth=").append(dateOfBirth);
        sb.append(", registrationDate=").append(registrationDate);
        
        sb.append("}\n");
        
        return sb.toString();
        
    }
    
}
