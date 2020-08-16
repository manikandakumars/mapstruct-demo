package com.service;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import com.domain.Customer;
import com.domain.Employee;
import com.domain.Provider;
import com.entity.AddressEntity;
import com.entity.CustomerEntity;
import com.entity.EmployeeEntity;
import com.entity.ProviderEntity;
import com.mapper.CustomerMapper;
import com.mapper.EmployeeMapper;
import com.mapper.ProviderMapper;

@Service
public class MapStructService {

	private ProviderMapper providerMapper=Mappers.getMapper(ProviderMapper.class);
	private CustomerMapper customerMapper=Mappers.getMapper(CustomerMapper.class);
	private EmployeeMapper employeeMapper=Mappers.getMapper(EmployeeMapper.class);
	
	
	public Provider getProvider() {
		
		ProviderEntity providerEntity = new ProviderEntity();
		providerEntity.setFirstName("Michelle");
		providerEntity.setLastName("Cooper");
		
		Provider provider = providerMapper.convertEntityToDomain(providerEntity);
		
		return provider;
		
	}
	
	public ProviderEntity getProviderEntity() {
		
		Provider provider = new Provider();
		provider.setFirstName("John");
		provider.setLastName("Smith");
		
		ProviderEntity providerEntity = providerMapper.convertDomainToEntity(provider);
		
		return providerEntity;
		
	}
	
	public Customer getCustomer() {
		
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setCustName("Peter");
		customerEntity.setAddress("Phoenix");
		
		Customer customer  = customerMapper.convertEntityToDomain(customerEntity);
		
		return customer;
		
	}	
	
	public List<Customer> getCustomerList() {
		
		List<CustomerEntity> customerEntityList = new ArrayList<CustomerEntity>();
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setCustName("Peter");
		customerEntity.setAddress("Phoenix");
		customerEntityList.add(customerEntity);
		
		customerEntity = new CustomerEntity();
		customerEntity.setCustName("John");
		customerEntity.setAddress("New York");
		customerEntityList.add(customerEntity);
		
		List<Customer> customerList  = customerMapper.convertEntityListToDomainList(customerEntityList);
		
		return customerList;
		
	}	
	
	
	public Employee getEmployee() {
		
		EmployeeEntity ee= new EmployeeEntity();
		ee.setEmpName("Mani");
		AddressEntity ae = new AddressEntity();
		ae.setAddress1("62162 S 44th St");
		ae.setCity("Phoenix");
		ee.setEmpAddress(ae);
		
		Employee employee = employeeMapper.convertEntityToDomain(ee);
		
		return employee;
	}	
	
}
