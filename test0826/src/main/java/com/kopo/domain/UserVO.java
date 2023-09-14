package com.kopo.domain;

import java.util.Date;

import lombok.Data;

@Data
public class UserVO {

/*	
	create table tbl_user (
		    userId VARCHAR2(10) not null,
		    userFirstName VARCHAR2(20),
		    userLastName VARCHAR2(20), 
		    userPhone VARCHAR2(20),
		    userBdate DATE,
		    userEmail VARCHAR2(30),
		    verify number default 0,
		    primary key(userId)
		);
*/
	
	private String userId;
	private String userFirstName;
	private String userLastName;
	private String userPhone;
	private Date userBdate;
	private String userEmail;
	private int verify;

}
