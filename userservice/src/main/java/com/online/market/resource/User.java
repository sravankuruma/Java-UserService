package com.online.market.resource;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	@Column
	private String userName;
	@Column
	private String userEmail;
	@Column
	private String userAddress;
	@Column
	private String userMobile;
	@Column
	private String userGender;
}
