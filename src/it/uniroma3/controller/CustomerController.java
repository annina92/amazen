package it.uniroma3.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import it.uniroma3.model.Address;
import it.uniroma3.model.AddressFacade;
import it.uniroma3.model.Customer;
import it.uniroma3.model.CustomerFacade;
import it.uniroma3.model.Product;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class CustomerController {
	
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String password;
	private String dateOfBirth;
	private Date registrationDate;
	private Address address;
	private Customer customer;
	private List<Customer> customers;
	
	//address
	private String street;
	private String city;
	private String zipCode;
	private String country;
	
	@EJB
	private CustomerFacade customerFacade;
	@EJB
	private AddressFacade addressFacade;

	
	public String logIn(){
		String path = "errorLogIn";
		Customer customer = customerFacade.checkCustomer(this.email, this.password);
		
		if (customer != null){
			this.id = customer.getId();
			this.customer = customer;
			
			path = "customerIndex";
		}
		return path;
	}
	
	public String formForLogIn(){
		return "formForLogIn";
	}
	
	public String createCustomer() throws ParseException {
		Date dateOB = convertToDate(dateOfBirth);
		this.address =  new Address(street, city, zipCode, country);
		this.customer = customerFacade.createCustomer(firstName, lastName, email, password,  phoneNumber, address, dateOB);
		return "customer"; 
	}
	
	public Date convertToDate(String date) throws ParseException{
		Date dateOfBirth = new Date();
		try{
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			dateOfBirth = formatter.parse(date);
			return dateOfBirth;
		}catch (ParseException e){
			e.printStackTrace();
		}
		return dateOfBirth;
	}
	
	public String signIn(){
		return "signIn";
	}
	
	public String signUp(){
		return "signUp";
	}
	
	public String logInFailed(){
		return "signIn";
	}
	
	public String createNewCustomer(){
		return "newCustomer";
	}
	
	public String backToIndex(){
		return "index";
	}
	
	public String listCustomers() {
		this.customers = customerFacade.getAllCustomers();
		return "customers"; 
	}
	
	public String findCustomer(){
		this.customer = customerFacade.getCustomer(id);
		return "customer";
	}
	
	public String findCustomer(Long id) {
		this.customer = customerFacade.getCustomer(id);
		return "product";
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
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
    
    public String getPassword(){
    	return this.password;
    }
    
    public void setPassword (String password){
    	this.password = password;
    }
    
    public String getPhoneNumber() {
    	return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber){
    	this.phoneNumber = phoneNumber;
    }
    
    public Address getAddress(){
    	return this.address;
    }
    
    public void setAddress(Address address){
    	this.address = address;
    }
    
    public void setStreet(String street){
    	this.street=street;
    }
    
    public void setCity(String city){
    	this.city = city;
    }
    
    public void setCountry(String country ){
    	this.country =country;
    }
    
    public void setZipCode(String zipCode){
    	this.zipCode= zipCode;
    }
    
    public String getCity(){
    	return this.city;
    }
    
    public String getStreet(){
    	return this.street;
    }
    
    public String getZipCode(){
    	return this.zipCode;
    }
    
    public String getCountry(){
    	return this.country;
    }
    
    public Customer getCustomer(){
    	return this.customer;
    }
    
    public void setCustomer (Customer customer) {
    	this.customer = customer;
    }
    
    public List<Customer> getCustomers() {
    	return customers;
    }
    
    public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
    

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}


}