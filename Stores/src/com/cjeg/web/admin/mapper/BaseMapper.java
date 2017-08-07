package com.cjeg.web.admin.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

/**
 * 
 * @author 张瑞志
 * 
 *         创建时间:2017年4月1日 下午8:56:54
 * 
 */
public interface BaseMapper<M, K> {
	int deleteByPrimaryKey(K id);

	int insert(M record);

	int insertSelective(M record);

	M selectByPrimaryKey(K id);

	int updateByPrimaryKeySelective(M record);

	int updateByPrimaryKey(M record);

	List<M> selectBySeletvie(M m);

	List<M> selectBySeletvie(M m, RowBounds rowBounds);
}
