package com.kopo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kopo.mapper.TestMapper;

@Repository
public class RepoImpl implements TestReop {
	
	@Autowired
	private TestMapper testMapper;
	
	@Override
	public String hi(int id) {
		return "hi";
	}

}
