package com.cjeg.web.admin.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjeg.Util.StringUtils;
import com.cjeg.web.admin.mapper.TypeMapper;
import com.cjeg.web.admin.model.Type;
import com.cjeg.web.commen.message.MessageVO;

/**
 * 
 * @author 张瑞志
 * 
 *         创建时间:2017年4月9日 下午4:12:35
 * 
 */
@Controller
@RequestMapping("/type")
public class TypeController {

	@Autowired
	private TypeMapper typeMapper;

	@RequestMapping("/list")
	@ResponseBody
	public MessageVO list(){
		MessageVO mv=new MessageVO();
		List<Type> list=typeMapper.selectSelective(new Type());
		mv.setData(list);
		mv.setFlag(true);
		return mv;
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public MessageVO add(Type type){
		MessageVO mv=new MessageVO();
		type.setId(StringUtils.getUUID32());
		type.setCreateTime(new Date());
		type.setUpdateTime(new Date());
		typeMapper.insertSelective(type);
		mv.setFlag(true);
		mv.setMessage("添加成功");;
		return mv;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public MessageVO delete(String id){
		MessageVO mv=new MessageVO();
		typeMapper.deleteByPrimaryKey(id);
		mv.setFlag(true);
		mv.setMessage("删除成功");
		return mv;
	}
}
