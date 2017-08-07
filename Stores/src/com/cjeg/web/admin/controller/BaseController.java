package com.cjeg.web.admin.controller;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjeg.web.admin.service.BaseService;
import com.cjeg.web.commen.message.MessageVO;

/**
 * 基类
 * 
 * @author 张瑞志
 * 
 *         创建时间:2017年4月1日 下午8:28:27
 * 
 */
public abstract class BaseController<M, K> {

	abstract BaseService<M, K> getService();

	/**
	 * 根据条件查询出一条数据
	 * 
	 * @param k
	 * @return
	 */
	@RequestMapping("/listOne")
	@ResponseBody
	public MessageVO listOne(K k) {
		MessageVO mv = new MessageVO();
		try {
			M m = getService().selectPrimaryKey(k);
			mv.setFlag(true);
			mv.setObj(m);
		} catch (Exception e) {
			mv.setFlag(false);
			mv.setMessage("查询错误");
		}
		return mv;
	}

	/**
	 * 根据条件查询出所有符合条件的
	 * 
	 * @param m
	 * @return
	 */

	@RequestMapping("/listAll")
	@ResponseBody
	public MessageVO listAll(M m) {
		MessageVO mv = new MessageVO();
		try {
			List<M> lm = getService().selectBySeletvie(m);
			mv.setFlag(true);
			mv.setData(lm);
		} catch (Exception e) {
			mv.setFlag(false);
			mv.setMessage("查询错误");
		}
		return mv;
	}

	@RequestMapping("/listPage")
	@ResponseBody
	public MessageVO listPage(M m, int page, int size) {
		MessageVO mv = new MessageVO();
		RowBounds row = new RowBounds((page - 1) * size, size);
		try {
			List<M> lm = getService().selectBySeletvie(m, row);
			mv.setFlag(true);
			mv.setData(lm);
		} catch (Exception e) {
			mv.setFlag(false);
			mv.setMessage("查询错误");
		}
		return mv;
	}

	@RequestMapping("/update")
	@ResponseBody
	public MessageVO update(M m) {
		MessageVO mv = new MessageVO();
		try {
			getService().updateSelectiveByPrimaryKey(m);
			mv.setFlag(true);
			mv.setMessage("更新成功");
		} catch (Exception e) {
			mv.setFlag(false);
			mv.setMessage("更新失败");
		}
		return mv;
	}
}
