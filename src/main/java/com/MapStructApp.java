package com;

import java.util.List;

import com.domain.Customer;
import com.domain.Employee;
import com.domain.Provider;
import com.entity.ProviderEntity;
import com.google.gson.Gson;
import com.service.MapStructService;

/**
 * Hello world!
 *
 */
public class MapStructApp 
{
	
	MapStructService mapStructService = new MapStructService();

    public static void main( String[] args )
    {
    	
    	MapStructApp mapStructApp = new MapStructApp();
    	
    	mapStructApp.getProvider();
    	
    	mapStructApp.getProviderEntity();
    	
    	mapStructApp.getCustomer();
    	
    	mapStructApp.getCustomerList();
    	
    	mapStructApp.getEmployee();
        
    }
    
    private void getProvider() {
    	
    	Gson gson = new Gson();
    	
    	Provider provider = mapStructService.getProvider();
    	
    	   System.out.println("Provider (Entity to Domain):\n"+
    	                      "============================\n\n"+  
    	                      gson.toJson(provider));
    }
    
    private void getProviderEntity() {
    	
    	Gson gson = new Gson();
    	
    	ProviderEntity providerEntity = mapStructService.getProviderEntity();
    	
    	   System.out.println("\n\nProvider (Domain to Entity):\n"+
                              "============================\n\n"+  
                              gson.toJson(providerEntity));    	   
    }  
    
    

    private void getCustomer() {
    	
    	Gson gson = new Gson();
    	
    	Customer customer = mapStructService.getCustomer();
    	
    	   System.out.println("\n\nCustomer (Domain to Entity):\n"+
    	                      "============================\n\n"+  
    	                      gson.toJson(customer));
    }
    
    private void getCustomerList() {
    	
    	Gson gson = new Gson();
    	
    	List<Customer> customerList = mapStructService.getCustomerList();
    	
    	   System.out.println("\n\nCustomer List (Domain to Entity):\n"+
    	                          "================================\n\n"+  
    	                      gson.toJson(customerList));
    } 
    
    private void getEmployee() {
    	
    	Gson gson = new Gson();
    	
    	Employee employee = mapStructService.getEmployee();
    	
    	   System.out.println("\nEmployee (Domain to Entity):\n"+
    	                      "==============================\n\n"+  
    	                      gson.toJson(employee));
    }    
    
}
