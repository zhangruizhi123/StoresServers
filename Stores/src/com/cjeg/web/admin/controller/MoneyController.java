package com.cjeg.web.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjeg.web.admin.mapper.MoneyMapper;
import com.cjeg.web.admin.model.Money;
import com.cjeg.web.commen.message.MessageVO;

/**
 * 
 * @author 张瑞志
 *
 * 创建时间:2017年4月10日 下午7:06:09
 *
 */
@Controller
@RequestMapping("/money")
public class MoneyController {
	
	@Autowired
	private MoneyMapper moneyMapper;
	
	
	@RequestMapping("/list")
	@ResponseBody
	public MessageVO list(Money money){
		MessageVO mv=new MessageVO();
		System.out.println(money);
		List<Money> list=moneyMapper.selectSelective(money);
		mv.setData(list);
		mv.setFlag(true);
		return mv;
	}
}
