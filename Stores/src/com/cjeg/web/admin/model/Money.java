package com.cjeg.web.admin.model;

import java.util.Date;

public class Money {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column money_t.id
	 * 
	 * @mbg.generated
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column money_t.person_id
	 * 
	 * @mbg.generated
	 */
	private String personId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column money_t.trans_id
	 * 
	 * @mbg.generated
	 */
	private String transId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column money_t.goods_id
	 * 
	 * @mbg.generated
	 */
	private String goodsId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column money_t.amount
	 * 
	 * @mbg.generated
	 */
	private Float amount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column money_t.status
	 * 
	 * @mbg.generated
	 */
	private Boolean status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column money_t.create_time
	 * 
	 * @mbg.generated
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column money_t.update_time
	 * 
	 * @mbg.generated
	 */
	private Date updateTime;

	private Person person;

	private TransRecode transRecode;

	private Goods goods;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column money_t.id
	 * 
	 * @return the value of money_t.id
	 * @mbg.generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column money_t.id
	 * 
	 * @param id
	 *            the value for money_t.id
	 * @mbg.generated
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column money_t.person_id
	 * 
	 * @return the value of money_t.person_id
	 * @mbg.generated
	 */
	public String getPersonId() {
		return personId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column money_t.person_id
	 * 
	 * @param personId
	 *            the value for money_t.person_id
	 * @mbg.generated
	 */
	public void setPersonId(String personId) {
		this.personId = personId == null ? null : personId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column money_t.trans_id
	 * 
	 * @return the value of money_t.trans_id
	 * @mbg.generated
	 */
	public String getTransId() {
		return transId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column money_t.trans_id
	 * 
	 * @param transId
	 *            the value for money_t.trans_id
	 * @mbg.generated
	 */
	public void setTransId(String transId) {
		this.transId = transId == null ? null : transId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column money_t.goods_id
	 * 
	 * @return the value of money_t.goods_id
	 * @mbg.generated
	 */
	public String getGoodsId() {
		return goodsId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column money_t.goods_id
	 * 
	 * @param goodsId
	 *            the value for money_t.goods_id
	 * @mbg.generated
	 */
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId == null ? null : goodsId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column money_t.amount
	 * 
	 * @return the value of money_t.amount
	 * @mbg.generated
	 */
	public Float getAmount() {
		return amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column money_t.amount
	 * 
	 * @param amount
	 *            the value for money_t.amount
	 * @mbg.generated
	 */
	public void setAmount(Float amount) {
		this.amount = amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column money_t.status
	 * 
	 * @return the value of money_t.status
	 * @mbg.generated
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column money_t.status
	 * 
	 * @param status
	 *            the value for money_t.status
	 * @mbg.generated
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column money_t.create_time
	 * 
	 * @return the value of money_t.create_time
	 * @mbg.generated
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column money_t.create_time
	 * 
	 * @param createTime
	 *            the value for money_t.create_time
	 * @mbg.generated
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column money_t.update_time
	 * 
	 * @return the value of money_t.update_time
	 * @mbg.generated
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column money_t.update_time
	 * 
	 * @param updateTime
	 *            the value for money_t.update_time
	 * @mbg.generated
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public TransRecode getTransRecode() {
		return transRecode;
	}

	public void setTransRecode(TransRecode transRecode) {
		this.transRecode = transRecode;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	@Override
	public String toString() {
		return "Money [id=" + id + ", personId=" + personId + ", transId="
				+ transId + ", goodsId=" + goodsId + ", amount=" + amount
				+ ", status=" + status + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", person=" + person
				+ ", transRecode=" + transRecode + ", goods=" + goods + "]";
	}
	
	

}