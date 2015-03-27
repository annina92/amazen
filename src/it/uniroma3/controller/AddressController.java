package it.uniroma3.controller;

import java.util.List;

import it.uniroma3.model.Address;
import it.uniroma3.model.AddressFacade;
import it.uniroma3.model.Product;
import it.uniroma3.model.ProductFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class AddressController {
	
	@ManagedProperty(value = "#{param.id}")
	private Long id;
    private String street;	
	private String city;
	private String zipCode;	
	private String country;
	private Address address;
	private List<Address> addresses;
	
	@EJB
	private AddressFacade addressFacade;
	
	
	public String createAddress() {
		this.address = addressFacade.createAddress(street, city, zipCode, country);
		return "address"; 
	}
	
	public Address createAddress(String boh) {
		this.address = addressFacade.createAddress(street, city, zipCode, country);
		return address; 
	}
	
	public String listAddresses() {
		this.addresses = addressFacade.getAllAddress();
		return "addresses"; 
	}

	public String findAddress() {
		this.address = addressFacade.getAddress(id);
		return "address";
	}
	
	public String findAddress(Long id) {
		this.address = addressFacade.getAddress(id);
		return "address";
	}
	
	public Long getId() {
        return id;
    }
	
	public void setId(Long id) {
		this.id = id;
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
	
    public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}
