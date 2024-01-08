package com.employee.employee.configuration;

import com.employee.employee.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class EmployeeConfig {

	@Bean
	public ModelMapper modelMapperBean() {
		return new ModelMapper();
	}

}
