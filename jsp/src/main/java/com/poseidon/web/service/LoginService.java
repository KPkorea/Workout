package com.poseidon.web.service;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.poseidon.web.dao.LoginDAO;
import com.poseidon.web.dto.LoginDTO;

@Service
public class LoginService {
	
	@Autowired
	private LoginDAO loginDAO;

	public int login(LoginDTO loginDTO) {
		return loginDAO.login(loginDTO);
	}
	
//	 private final ApplicationEnvironmentConfig envConfig;
//
//	    public String getNaverAuthorizeUrl(String type) throws URISyntaxException, MalformedURLException, UnsupportedEncodingException {
//
//	        String baseUrl = envConfig.getConfigValue("login.naver.baseUrl");
//	        String clientId = envConfig.getConfigValue("login.naver.clientId");
//	        String redirectUrl = envConfig.getConfigValue("login.naver.redirectUrl");
//
//	        UriComponents uriComponents = UriComponentsBuilder
//	                .fromUriString(baseUrl + "/" + type)
//	                .queryParam("response_type", "code")
//	                .queryParam("client_id", clientId)
//	                .queryParam("redirect_uri", URLEncoder.encode(redirectUrl, "UTF-8"))
//	                .queryParam("state", URLEncoder.encode("1234", "UTF-8"))
//	                .build();
//
//	        return uriComponents.toString();
//	    }
	
	

	

	
	
	
	
}
