package com.kopo.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ResvVO {

	/*
	create table tbl_resv (
    resvId VARCHAR2(10) not null,
    resvRoom number,
    resvDateIn DATE,
    resvDateOut DATE,
    primary key(resvId)
);
	*/
	
	private String resvId;
	private int resvRoom;
	private Date resvDate;
	private Date resvInDate;
	private Date resvOutDate;
}
