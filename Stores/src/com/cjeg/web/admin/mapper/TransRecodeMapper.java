package com.cjeg.web.admin.mapper;

import java.util.List;

import com.cjeg.web.admin.model.TransRecode;

public interface TransRecodeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trans_recode
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trans_recode
	 * @mbg.generated
	 */
	int insert(TransRecode record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trans_recode
	 * @mbg.generated
	 */
	int insertSelective(TransRecode record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trans_recode
	 * @mbg.generated
	 */
	TransRecode selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trans_recode
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(TransRecode record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trans_recode
	 * @mbg.generated
	 */
	int updateByPrimaryKey(TransRecode record);
	
	List<TransRecode> selectSelective(TransRecode record);
}