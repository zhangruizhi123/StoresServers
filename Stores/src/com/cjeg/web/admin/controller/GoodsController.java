package com.cjeg.web.admin.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjeg.Util.StringUtils;
import com.cjeg.web.admin.mapper.GoodsMapper;
import com.cjeg.web.admin.model.Goods;
import com.cjeg.web.commen.message.MessageVO;

/**
 * 
 * @author 张瑞志
 * 
 *         创建时间:2017年4月9日 下午4:04:05
 * 
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

	@Autowired
	private GoodsMapper goodsMapper;

	@RequestMapping("/list")
	@ResponseBody
	public MessageVO list(Goods good) {
		MessageVO mv = new MessageVO();
		List<Goods> list = goodsMapper.selectSelective(good);
		mv.setFlag(true);
		mv.setData(list);
		mv.setMessage("查询成功");
		return mv;
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public MessageVO add(Goods goods){
		MessageVO mv = new MessageVO();
		goods.setId(StringUtils.getUUID32());
		goods.setCreateTime(new Date());
		goods.setNumber(0);
		goods.setUpdateTime(new Date());
		try{
			goodsMapper.insertSelective(goods);
			mv.setFlag(true);
		}catch(Exception e){
			e.printStackTrace();
			mv.setFlag(false);
		}
		
		return mv;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public MessageVO delete(String id){
		MessageVO mv = new MessageVO();
		goodsMapper.deleteByPrimaryKey(id);
		mv.setFlag(true);
		mv.setMessage("删除成功");
		return mv;
	}
	
}
