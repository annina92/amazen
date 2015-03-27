package it.uniroma3.controller;

import java.util.LinkedList;
import java.util.List;

import it.uniroma3.model.Customer;
import it.uniroma3.model.CustomerFacade;
import it.uniroma3.model.Order;
import it.uniroma3.model.OrderFacade;
import it.uniroma3.model.OrderLineFacade;
import it.uniroma3.model.Product;
import it.uniroma3.model.ProductFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class ProductController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String name;
	private Float price;
	private String description;
	private String code;
	private Product product;
	private List<Product> products;
	private Long customerId;
	private int quantity;
	
	@EJB
	private ProductFacade productFacade;
	
	@EJB
	private CustomerFacade customerFacade;
	
	@EJB
	private OrderFacade orderFacade;
	
	@EJB
	private OrderLineFacade orderLineFacade;
	
	public String createProduct() {
		this.product = productFacade.createProduct(name, code, price, description);
		return "product"; 
	}
	
	public String listProducts() {
		this.products = productFacade.getAllProducts();
		return "products"; 
	}

	public String findProduct() {
		this.product = productFacade.getProduct(id);
		return "product";
	}
	
	public void deleteProduct(Long id) {
		productFacade.deleteProduct(id);
		this.listProducts();
	}
	
	public void deleteProduct() {
		productFacade.deleteProduct(id);
		this.listProducts();
	}
	
	public String listProductsAdmin(Long id) {
		if(id != null){
			this.products = productFacade.getAllProducts();
			return "productsAdmin";
		}else
			return "adminLogIn";
	}
	
	public String goToPurchase(){
		this.product = productFacade.getProduct(id);
		return "purchaseConfirm";
	}
	
	public String buyProduct(Long currCustomerId) throws Exception{
		if(currCustomerId == null)
			return "formForLogIn";
		else{
			this.product = productFacade.getProduct(this.id);
			this.customerId = currCustomerId;
			Customer customer = customerFacade.getCustomer(this.customerId);
			List<Order> orders = orderFacade.getAllOrdersOfCustomer(customer);
			Order currentOrder;
			if(orders != null && !orders.isEmpty()){
				//			customer.setOrders(orders);
				currentOrder = orders.get(orders.size()-1);
				if(currentOrder.getClosedTime() == null) 
					orderLineFacade.createOrderLine(this.product, quantity, currentOrder);
				else
					if(currentOrder.getClosedTime() != null){
						currentOrder = orderFacade.createOrder(customer);
						orderLineFacade.createOrderLine(this.product, quantity, currentOrder);
					}
			}
			else
				if(orders == null){
					orders = new LinkedList<Order>();
					currentOrder = orderFacade.createOrder(customer);
					orderLineFacade.createOrderLine(this.product, quantity, currentOrder);
				}
				else
					if(orders.isEmpty()){
						currentOrder = orderFacade.createOrder(customer);
						orderLineFacade.createOrderLine(this.product, quantity, currentOrder);
						//					customer.getOrders().add(currentOrder);
					}
			return "added";
		}
	}
	
	public String createProductAdmin(){
		this.product = productFacade.createProduct(name, code, price, description);
		return "productAdmin";
		
	}
	public String findProduct(Long id) {
		this.product = productFacade.getProduct(id);
		return "product";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}


