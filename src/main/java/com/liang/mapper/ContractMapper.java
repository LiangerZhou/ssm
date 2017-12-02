package com.liang.mapper;

import java.util.List;

import com.liang.entity.Contract;

public interface ContractMapper {
	
	Contract getContract(long id);
	
	int addContract(Contract cont);
	
	int deleteContract(long id);
	
	int updateContract(Contract cont);
	
	List<Contract> getCons();
}
