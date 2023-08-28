package com.poseidon.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.poseidon.web.dto.BoardDTO;

@Repository//DAO
@Mapper
public interface IndexDAO {

	public int totalSize();//DB에서 레코드 값 가져오기

	public List<BoardDTO> boardList();

}
