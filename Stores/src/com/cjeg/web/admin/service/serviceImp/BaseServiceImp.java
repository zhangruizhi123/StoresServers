package com.cjeg.web.admin.service.serviceImp;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.cjeg.web.admin.mapper.BaseMapper;
import com.cjeg.web.admin.service.BaseService;

/**
 * 
 * @author 张瑞志
 * 
 *         创建时间:2017年4月1日 下午8:31:59
 * 
 */
public abstract class BaseServiceImp<M, K> implements BaseService<M, K> {

	abstract BaseMapper<M, K> getBaseMapper();

	@Override
	public M selectPrimaryKey(K k) {
		return getBaseMapper().selectByPrimaryKey(k);
	}

	@Override
	public List<M> selectBySeletvie(M m) {
		return getBaseMapper().selectBySeletvie(m);
	}

	@Override
	public void updateSelectiveByPrimaryKey(M m) {
		getBaseMapper().updateByPrimaryKeySelective(m);
	}

	@Override
	public void deleteByPrimaryKey(K k) {
		getBaseMapper().deleteByPrimaryKey(k);

	}

	@Override
	public void insertSelective(M m) {
		getBaseMapper().insertSelective(m);

	}

	@Override
	public List<M> selectBySeletvie(M m, RowBounds rowb) {
		return getBaseMapper().selectBySeletvie(m, rowb);
	}

}
