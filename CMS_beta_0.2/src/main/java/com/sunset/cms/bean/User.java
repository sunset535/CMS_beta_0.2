package com.sunset.cms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

public class User {

	@Column
	private String username;
	private String password;
	private String email;
	private String phone;
	private String nickname;
	
	
}
