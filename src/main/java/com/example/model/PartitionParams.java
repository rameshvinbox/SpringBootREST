package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "PARTITION_PARAMS", schema = "dbo")
public class PartitionParams {

	@Id
	@GeneratedValue
	private Long part_id;
	private String param_key;
	private String param_value;
	
	public PartitionParams(String param_key, String param_value) {
		super();
		this.param_key = param_key;
		this.param_value = param_value;

	}

	public Long getPart_id() {
		return part_id;
	}

	public void setPart_id(Long part_id) {
		this.part_id = part_id;
	}

	public String getParam_key() {
		return param_key;
	}

	public void setParam_key(String param_key) {
		this.param_key = param_key;
	}

	public String getParam_value() {
		return param_value;
	}

	public void setParam_value(String param_value) {
		this.param_value = param_value;
	}

	public PartitionParams() {
		super();
	}

	

}
