package com.address.address.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.address.address.entity.Address;
import com.address.address.repository.AddressRepo;
import com.address.address.response.AddressResponse;

import java.util.Optional;

@Service
public class AddressService {

	@Autowired
	private AddressRepo addressRepo;

	@Autowired
	private ModelMapper mapper;

	public AddressResponse findAddressByEmployeeId(int employeeId) {
		Optional<Address> addressByEmployeeId = addressRepo.findAddressByEmployeeId(employeeId);
		AddressResponse addressResponse = mapper.map(addressByEmployeeId, AddressResponse.class);
		return addressResponse;
	}

}
