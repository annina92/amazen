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
public class LogInController {
	
	public String SignIn(){
		return "signIn";
	}
	
	public String signUp(){
		return "signUp";
	}
}
