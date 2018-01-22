package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.PartitionParams;
import com.example.repository.PartitionParamsRepository;

@Service("partitionParamsService")
public class PartitionParamsServiceImpl implements PartitionParamsService{
	
	@Autowired
	PartitionParamsRepository partitionParamsRepository;

	@Override
	public PartitionParams getPartitionParamsById(long id) {
		return partitionParamsRepository.findOne(id);
	}

	@Override
	public List<PartitionParams> getAllPartitionParams() {
		return partitionParamsRepository.findAll();
	} 

	

}
