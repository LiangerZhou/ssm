package com.liang.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.liang.entity.Employee;

@MapperScan
public interface EmpMapper {
	
	Employee getEmp(long id);
	
	int addEmp(Employee emp);
	
	int deleteEmp(long id);
	
	int updateEmp(Employee emp);
	
	List<Employee> getEmps();
}
