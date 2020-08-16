package com.mapper;

import com.domain.Address;
import com.domain.Employee;
import com.entity.AddressEntity;
import com.entity.EmployeeEntity;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-08-15T21:48:37-0700",
    comments = "version: 1.3.0.Beta2, compiler: Eclipse JDT (IDE) 3.19.0.v20190903-0936, environment: Java 1.8.0_221 (Oracle Corporation)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Address convertAddressEntityToAddressDomain(AddressEntity addressEntity) {
        if ( addressEntity == null ) {
            return null;
        }

        Address address = new Address();

        address.setAddress1( addressEntity.getAddress1() );
        address.setAddress2( addressEntity.getAddress2() );
        address.setCity( addressEntity.getCity() );

        return address;
    }

    @Override
    public Employee convertEntityToDomain(EmployeeEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setEmpName( entity.getEmpName() );
        employee.setEmpAddress( convertAddressEntityToAddressDomain( entity.getEmpAddress() ) );

        return employee;
    }
}
