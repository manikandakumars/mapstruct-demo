package com.mapper;

import org.mapstruct.Mapper;

import com.domain.Provider;
import com.entity.ProviderEntity;

@Mapper
public interface ProviderMapper {
	
	ProviderEntity convertDomainToEntity(Provider source);
	Provider convertEntityToDomain(ProviderEntity source);
	
}
