package com.khmall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.khmall.dto.Companys;
@Mapper
public interface CompanyMapper {
	List<Companys> getAllCompanys();
}
