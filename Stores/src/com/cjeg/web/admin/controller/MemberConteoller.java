package com.cjeg.web.admin.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjeg.Util.StringUtils;
import com.cjeg.web.admin.mapper.MemberMapper;
import com.cjeg.web.admin.model.Member;
import com.cjeg.web.commen.message.MessageVO;

/**
 * 
 * @author 张瑞志
 * 
 *         创建时间:2017年4月9日 下午2:04:39
 * 
 */
@Controller
@RequestMapping("/member")
public class MemberConteoller {

	@Autowired
	private MemberMapper memberMapper;

	@RequestMapping("/list")
	@ResponseBody
	public MessageVO list() {
		MessageVO mv = new MessageVO();
		List<Member> list = memberMapper.selectSelective(new Member());
		mv.setFlag(true);
		mv.setData(list);
		return mv;
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public MessageVO add(Member member){
		MessageVO mv = new MessageVO();
		System.out.println("::::"+member);
		member.setPassword(StringUtils.getMD5(member.getPassword()));
		member.setCreateTime(new Date());
		member.setUpdateTime(new Date());
		member.setId(StringUtils.getUUID32());
		try{
			
			memberMapper.insertSelective(member);
			mv.setFlag(true);
			mv.setMessage("添加成功");
		}catch(Exception e){
			e.printStackTrace();
			mv.setFlag(false);
			mv.setMessage("添加失败");
		}
		return mv;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public MessageVO delete(String id){
		MessageVO mv = new MessageVO();
		memberMapper.deleteByPrimaryKey(id);
		mv.setFlag(true);
		mv.setMessage("删除成功");
		return mv;
	}
}
