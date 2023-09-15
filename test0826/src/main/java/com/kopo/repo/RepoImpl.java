package com.kopo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kopo.mapper.TestMapper;


@Repository
public class RepoImpl implements TestRepo {

	@Override
	public String hi(int id) {
		// TODO Auto-generated method stub
		return "hi";
	}
	
	@Autowired
	private TestMapper testMapper;
}
