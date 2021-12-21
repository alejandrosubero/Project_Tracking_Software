package com.pts.pojo;

public class LogingResponse {

	private String authorization;
	private String token;
	private Object status;
	
	
	public LogingResponse() {
		this.authorization = "Authorization";
	}


	public String getAuthorization() {
		return authorization;
	}


	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}


	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}


	public Object getStatus() {
		return status;
	}


	public void setStatus(Object status) {
		this.status = status;
	}
	
	
}
