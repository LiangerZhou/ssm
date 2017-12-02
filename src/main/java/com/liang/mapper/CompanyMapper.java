package com.liang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import com.liang.entity.Company;

@MapperScan
public interface CompanyMapper {
	
	Company getComp(long id);
	
	int addComp(@Param("comp")Company comp);//@Param为了以防mybatis无法保存形参名，以为会自动转换成arg0 arg1等等
	
	int deleteComp(long id);
	
	int updateComp(Company comp);
	
	List<Company> getComps();
}
