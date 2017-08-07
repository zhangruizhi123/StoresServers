package com.cjeg.web.admin.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjeg.Util.StringUtils;
import com.cjeg.web.admin.mapper.PersonMapper;
import com.cjeg.web.admin.model.Person;
import com.cjeg.web.commen.message.MessageVO;

/**
 * 
 * @author 张瑞志
 *
 * 创建时间:2017年4月9日 下午3:09:20
 *
 */
@Controller
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonMapper personMapper;
	
	@RequestMapping("/list")
	@ResponseBody
	public MessageVO list(){
		MessageVO mv=new MessageVO();
		try{
			
			List<Person> ls=personMapper.selectSelective(new Person());
			mv.setFlag(true);
			mv.setData(ls);
		}
		catch(Exception e){
			mv.setFlag(false);
		}
		
		return mv;
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public MessageVO add(Person person){
		MessageVO mv=new MessageVO();
		person.setId(StringUtils.getUUID32());
		person.setCreateTime(new Date());
		person.setUpdateTime(new Date());
		personMapper.insertSelective(person);
		mv.setFlag(true);
		mv.setMessage("添加成功");
		return mv;
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	public MessageVO delete(String id){
		MessageVO mv=new MessageVO();
		personMapper.deleteByPrimaryKey(id);
		mv.setFlag(true);
		mv.setMessage("删除成功");
		return mv;
	}
	
	
}
