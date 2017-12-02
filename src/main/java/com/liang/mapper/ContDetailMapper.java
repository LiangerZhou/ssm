package com.liang.mapper;

import java.util.List;

import com.liang.entity.ContractDetail;

public interface ContDetailMapper {
	
	ContractDetail getContDetail(long id);
	
	int addContDetail(ContractDetail contdDetail);
	
	int deleteContDetail(long id);
	
	int updateContDetail(ContractDetail contdDetail);
	
	List<ContractDetail> getConDtails();
}
