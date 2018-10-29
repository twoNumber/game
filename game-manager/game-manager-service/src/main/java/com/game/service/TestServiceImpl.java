package com.game.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.mapper.TextMapper;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TextMapper textmapper;

	@Override
	public String queryNow() {
		return textmapper.queryNow();
//			try {
//				Class.forName("com.mysql.cj.jdbc.Driver");
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		return "2018/10/9";
	}

}
