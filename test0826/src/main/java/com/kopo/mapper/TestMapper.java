package com.kopo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface TestMapper {

public List<String> test(@Param("id") int id);

//	@Insert("insert into tbl_user(userId, userFirstName, userLastName, userPhone, userBdate, userEmail, verify) "
//			+ "values (유저아이디는 체크인날짜+방번호인데이거 어케 하지, #{userFirstName}, #{userLastName}, #{userPhone}, #{userBdate}, #{userEmail}, #{verify})")
//	public void ReservationInsertUser(UserVO uservo);

}
