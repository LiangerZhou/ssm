package com.liang.mapper;

import java.util.List;

import com.liang.entity.ContractDetail;

public interface ContDetailMapper {
	
	ContractDetail getContDetail(long ctdid);
	
	int addContDetail(ContractDetail contdDetail);
	
	int deleteContDetail(long ctdid);
	
	int updateContDetail(ContractDetail contdDetail);
	
	List<ContractDetail> getContDtails();
}
