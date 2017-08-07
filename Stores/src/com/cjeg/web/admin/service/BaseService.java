package com.cjeg.web.admin.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

/**
 * 
 * 
 * @author 张瑞志
 * 
 *         创建时间:2017年4月1日 下午8:43:48
 * 
 * @param <I>
 *            mapper接口
 * @param <M>
 *            model实体类
 * @param <K>
 *            primary 主键类型
 */
public interface BaseService<M, K> {
	/**
	 * 根据主键查询
	 * 
	 * @param k
	 * @return
	 */
	M selectPrimaryKey(K k);

	/**
	 * 根据条件查询对象
	 * 
	 * @param m
	 * @return
	 */
	List<M> selectBySeletvie(M m);

	/**
	 * 分页显示
	 * 
	 * @param m
	 * @param rowb
	 * @return
	 */
	List<M> selectBySeletvie(M m, RowBounds rowb);

	/**
	 * 根据主键更新
	 * 
	 * @param m
	 */
	void updateSelectiveByPrimaryKey(M m);

	/**
	 * 根据主键删除数据
	 * 
	 * @param k
	 */
	void deleteByPrimaryKey(K k);

	void insertSelective(M m);
}
