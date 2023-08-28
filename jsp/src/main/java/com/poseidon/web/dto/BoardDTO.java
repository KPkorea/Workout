package com.poseidon.web.dto;

import lombok.Data;

@Data
public class BoardDTO {
	private int b_no, member_no, b_like, b_read;
	private String b_title, b_content, b_date, member_name, member_id;

	
}