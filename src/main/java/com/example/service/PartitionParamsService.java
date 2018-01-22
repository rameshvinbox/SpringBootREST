package com.example.service;

import java.util.List;

import com.example.model.PartitionParams;;

public interface PartitionParamsService {
	PartitionParams getPartitionParamsById(long id);
	List<PartitionParams> getAllPartitionParams();
}
