package com.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.domain.Customer;
import com.entity.CustomerEntity;

@Mapper
public interface CustomerMapper {
	
	@Mappings({
		@Mapping(target ="customerName", source="entity.custName"),
		@Mapping(target="customerAddress",source="entity.address")
	})
	Customer convertEntityToDomain(CustomerEntity entity);
	

	List<Customer> convertEntityListToDomainList(List<CustomerEntity> entityList);	
}
