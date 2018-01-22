package com.example.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;



import com.example.model.PartitionParams;

@Repository("partitionParamsRepository")
public interface PartitionParamsRepository extends JpaRepository<PartitionParams, Long> {
}
