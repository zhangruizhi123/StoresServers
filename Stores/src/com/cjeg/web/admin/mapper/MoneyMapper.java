package com.cjeg.web.admin.mapper;

import java.util.List;

import com.cjeg.web.admin.model.Money;

public interface MoneyMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table money_t
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table money_t
	 * @mbg.generated
	 */
	int insert(Money record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table money_t
	 * @mbg.generated
	 */
	int insertSelective(Money record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table money_t
	 * @mbg.generated
	 */
	Money selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table money_t
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Money record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table money_t
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Money record);
	
	List<Money> selectSelective(Money m);
}