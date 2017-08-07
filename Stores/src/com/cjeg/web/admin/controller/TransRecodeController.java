package com.cjeg.web.admin.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjeg.Util.StringUtils;
import com.cjeg.web.admin.mapper.GoodsMapper;
import com.cjeg.web.admin.mapper.MoneyMapper;
import com.cjeg.web.admin.mapper.TransRecodeMapper;
import com.cjeg.web.admin.model.Goods;
import com.cjeg.web.admin.model.Money;
import com.cjeg.web.admin.model.TransRecode;
import com.cjeg.web.commen.message.MessageVO;

/**
 * 
 * @author 张瑞志
 * 
 *         创建时间:2017年4月9日 下午8:47:22
 * 
 */
@Controller
@RequestMapping("/trans")
public class TransRecodeController {

	@Autowired
	private TransRecodeMapper transRecodeMapper;
	
	@Autowired
	private GoodsMapper goodsMapper;
	
	@Autowired
	private MoneyMapper moneyMapper;

	@RequestMapping("/list")
	@ResponseBody
	public MessageVO list(TransRecode trans) {
		MessageVO mv = new MessageVO();
		List<TransRecode> list = transRecodeMapper.selectSelective(trans);
		mv.setData(list);
		mv.setFlag(true);
		return mv;
	}

	@RequestMapping("/add")
	@ResponseBody
	public MessageVO add(TransRecode trans,Boolean ispay) {
		String id=StringUtils.getUUID32();
		MessageVO mv = new MessageVO();
		trans.setId(StringUtils.getUUID32());
		try {
			trans.setId(id);
			trans.setCreateTime(new Date());
			trans.setUpdateTime(new Date());
			
			if (trans.getType() == 0||trans.getType() == 3) {// 入库,销售退货
				if(trans.getGoodsId()!=null&&!trans.equals("")){
					//增加货物 的数量
					Goods good=goodsMapper.selectByPrimaryKey(trans.getGoodsId());
					good.setNumber(good.getNumber()+trans.getNumber());
					goodsMapper.updateByPrimaryKey(good);
					
				}else{
					mv.setFlag(false);
					return mv;
				}
			} else if (trans.getType() == 1||trans.getType() == 2) {//批发销售//零售销售
				if(trans.getGoodsId()!=null&&!trans.equals("")){
					//减少货物 的数量
					Goods good=goodsMapper.selectByPrimaryKey(trans.getGoodsId());
					if(trans.getNumber()>good.getNumber()){
						mv.setFlag(false);
						mv.setMessage("库存不足");
						return mv;
					}
					if(trans.getType() == 1&&!ispay){
						Money money=new Money();
						money.setId(StringUtils.getUUID32());
						money.setAmount(trans.getAmount());
						money.setGoodsId(trans.getGoodsId());
						money.setTransId(id);
						money.setPersonId(trans.getPersonId());
						money.setStatus(true);
						money.setCreateTime(new Date());
						money.setUpdateTime(new Date());
						moneyMapper.insertSelective(money);
					}
					good.setNumber(good.getNumber()-trans.getNumber());
					goodsMapper.updateByPrimaryKey(good);
				}else{
					mv.setFlag(false);
					return mv;
				}
			} else if (trans.getType() == 3) {//销售退货

			} 
			transRecodeMapper.insertSelective(trans);
			mv.setFlag(true);
			mv.setMessage("添加成功");
		} catch (Exception e) {
			e.printStackTrace();
			mv.setFlag(false);
			mv.setMessage("添加失败");
		}
		return mv;
	}

	@RequestMapping("/delete")
	@ResponseBody
	public MessageVO delete(String id) {
		MessageVO mv = new MessageVO();
		transRecodeMapper.deleteByPrimaryKey(id);
		mv.setFlag(true);
		mv.setMessage("删除成功");
		return mv;
	}
}
