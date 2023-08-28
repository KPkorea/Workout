package com.poseidon.web.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.poseidon.web.dto.LoginDTO;

@Repository
@Mapper
public interface LoginDAO {

	int login(LoginDTO loginDTO);

	

	
}
