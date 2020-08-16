package com.mapper;

import org.mapstruct.Mapper;

import com.domain.Address;
import com.domain.Employee;
import com.entity.AddressEntity;
import com.entity.EmployeeEntity;

@Mapper
public interface EmployeeMapper {
	
	Address convertAddressEntityToAddressDomain(AddressEntity addressEntity);

	Employee convertEntityToDomain(EmployeeEntity entity);

}
