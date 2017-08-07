package com.cjeg.web.admin.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjeg.web.admin.mapper.BookMapper;
import com.cjeg.web.admin.mapper.TypeMapper;
import com.cjeg.web.admin.model.Book;
import com.cjeg.web.admin.model.Type;
import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

/**
 * 
 * @author 张瑞志
 *
 * 创建时间:2017年2月22日 下午10:06:57
 *
 */
@Controller
@RequestMapping("/test")
public class Test{
	@Autowired
	BookMapper bookMapper;
	@Autowired
	private TypeMapper typeMapper;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@RequestMapping("/index")
	@ResponseBody
	public Map<String,Object> getData(){
		Map<String,Object>result=new HashMap<String, Object>();
		result.put("name", "张三");
		result.put("sex", "男");
		return result;
	}
	
	
	@RequestMapping("/setName")
	@ResponseBody
	public List<Us> getName(String name){
		List<Us> list=new ArrayList<Us>();
		for(int i=0;i<20;i++){
			Us us=new Us();
			us.setName("张三"+i);
			us.setAge(22+i);
			list.add(us);
		}
		return list;
	}
	
	public class Us{
		private String name;
		private int age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
	}
}
