package com.poseidon.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchDTO {
	private int startPage, lastPage;
	private String search_name, search_value;

}
//윈도우 서버화
// 80(홈페이지), ftp(21), db(3306)