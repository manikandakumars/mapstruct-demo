package com.mapper;

import com.domain.Provider;
import com.entity.ProviderEntity;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-08-15T21:48:37-0700",
    comments = "version: 1.3.0.Beta2, compiler: Eclipse JDT (IDE) 3.19.0.v20190903-0936, environment: Java 1.8.0_221 (Oracle Corporation)"
)
public class ProviderMapperImpl implements ProviderMapper {

    @Override
    public ProviderEntity convertDomainToEntity(Provider source) {
        if ( source == null ) {
            return null;
        }

        ProviderEntity providerEntity = new ProviderEntity();

        providerEntity.setFirstName( source.getFirstName() );
        providerEntity.setLastName( source.getLastName() );

        return providerEntity;
    }

    @Override
    public Provider convertEntityToDomain(ProviderEntity source) {
        if ( source == null ) {
            return null;
        }

        Provider provider = new Provider();

        provider.setFirstName( source.getFirstName() );
        provider.setLastName( source.getLastName() );

        return provider;
    }
}
