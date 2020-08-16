package com.mapper;

import com.domain.Customer;
import com.entity.CustomerEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-08-15T21:48:37-0700",
    comments = "version: 1.3.0.Beta2, compiler: Eclipse JDT (IDE) 3.19.0.v20190903-0936, environment: Java 1.8.0_221 (Oracle Corporation)"
)
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer convertEntityToDomain(CustomerEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setCustomerAddress( entity.getAddress() );
        customer.setCustomerName( entity.getCustName() );

        return customer;
    }

    @Override
    public List<Customer> convertEntityListToDomainList(List<CustomerEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<Customer> list = new ArrayList<Customer>( entityList.size() );
        for ( CustomerEntity customerEntity : entityList ) {
            list.add( convertEntityToDomain( customerEntity ) );
        }

        return list;
    }
}
