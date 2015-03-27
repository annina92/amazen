package it.uniroma3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	
	@Entity
	
	public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String street;
	
	private String city;


	private String zipCode;
	
	private String country;
	
	public Address() {
    }

	public Address(String street, String city, String zipCode, String country) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
	}

    
   public Long getId() {
        return id;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    public String getCountry() {
    	return this.country;
    }
    
    public void setCountry(String country){
    	this.country = country;
    }
    
    public boolean equals(Object obj) {
        Address address = (Address)obj;
        return this.street.equals(address.getStreet());
    }

    public int hashCode() {
         return getStreet().hashCode();
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Address"); 
        sb.append("{id=").append(id); 
        sb.append(", street='").append(street); 
        sb.append(", city=").append(city); 
        sb.append(", zipCode='").append(zipCode); 
        sb.append(", country='").append(country);
        sb.append("}\n");
        return sb.toString();
    
	
    }

}