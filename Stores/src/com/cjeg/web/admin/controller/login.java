package com.cjeg.web.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjeg.Util.StringUtils;
import com.cjeg.web.admin.mapper.MemberMapper;
import com.cjeg.web.admin.model.Member;
import com.cjeg.web.commen.message.MessageVO;

@Controller
public class login {

	@Autowired
	private MemberMapper memberMapper;

	@RequestMapping("/login")
	@ResponseBody
	public MessageVO login(String user, String password) {
		MessageVO mv = new MessageVO();
		String pw = StringUtils.getMD5(password);
		Member member = new Member();
		member.setName(user);
		member.setPassword(pw);
		List<Member> ls = memberMapper.selectSelective(member);
		if (ls != null && ls.size() > 0) {
			mv.setObj(ls.get(0));
			mv.setFlag(true);
		} else {
			mv.setMessage("登录失败");
			mv.setFlag(false);
		}
		return mv;
	}
}
