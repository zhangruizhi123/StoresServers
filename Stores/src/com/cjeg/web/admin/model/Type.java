package com.cjeg.web.admin.model;

import java.util.Date;

public class Type {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type_t.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type_t.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type_t.discripts
     *
     * @mbg.generated
     */
    private String discripts;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type_t.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type_t.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type_t.id
     *
     * @return the value of type_t.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type_t.id
     *
     * @param id the value for type_t.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type_t.name
     *
     * @return the value of type_t.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type_t.name
     *
     * @param name the value for type_t.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type_t.discripts
     *
     * @return the value of type_t.discripts
     *
     * @mbg.generated
     */
    public String getDiscripts() {
        return discripts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type_t.discripts
     *
     * @param discripts the value for type_t.discripts
     *
     * @mbg.generated
     */
    public void setDiscripts(String discripts) {
        this.discripts = discripts == null ? null : discripts.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type_t.create_time
     *
     * @return the value of type_t.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type_t.create_time
     *
     * @param createTime the value for type_t.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type_t.update_time
     *
     * @return the value of type_t.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type_t.update_time
     *
     * @param updateTime the value for type_t.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}