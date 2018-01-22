package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.model.PartitionParams;
import com.example.service.EmployeeService;
import com.example.service.PartitionParamsService;

@RestController
public class PartitionParamsController {

	@Autowired
	private PartitionParamsService partitionParamsService;

	@RequestMapping(value = "/partitionparams", method = RequestMethod.GET)
	public List<PartitionParams> getPartitionParams() {
		return partitionParamsService.getAllPartitionParams();
	}

	@RequestMapping(value = "/partitionparams/{id}", method = RequestMethod.GET)
	public PartitionParams getPartitionParams(@PathVariable("id") long id) {
		return partitionParamsService.getPartitionParamsById(id);
	}
}
