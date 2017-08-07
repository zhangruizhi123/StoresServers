package com.cjeg.web.admin.model;

import java.util.Date;

public class Book {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.descripts
     *
     * @mbg.generated
     */
    private String descripts;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.author
     *
     * @mbg.generated
     */
    private String author;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.publish_data
     *
     * @mbg.generated
     */
    private Date publishData;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.prime_cost
     *
     * @mbg.generated
     */
    private Float primeCost;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.current_price
     *
     * @mbg.generated
     */
    private Float currentPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.image
     *
     * @mbg.generated
     */
    private String image;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.publishing_company
     *
     * @mbg.generated
     */
    private String publishingCompany;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.type
     *
     * @mbg.generated
     */
    private String type;
    
    private Type types;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.id
     *
     * @return the value of book.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.id
     *
     * @param id the value for book.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.name
     *
     * @return the value of book.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.name
     *
     * @param name the value for book.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.descripts
     *
     * @return the value of book.descripts
     *
     * @mbg.generated
     */
    public String getDescripts() {
        return descripts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.descripts
     *
     * @param descripts the value for book.descripts
     *
     * @mbg.generated
     */
    public void setDescripts(String descripts) {
        this.descripts = descripts == null ? null : descripts.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.status
     *
     * @return the value of book.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.status
     *
     * @param status the value for book.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.author
     *
     * @return the value of book.author
     *
     * @mbg.generated
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.author
     *
     * @param author the value for book.author
     *
     * @mbg.generated
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.create_date
     *
     * @return the value of book.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.create_date
     *
     * @param createDate the value for book.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.update_date
     *
     * @return the value of book.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.update_date
     *
     * @param updateDate the value for book.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.publish_data
     *
     * @return the value of book.publish_data
     *
     * @mbg.generated
     */
    public Date getPublishData() {
        return publishData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.publish_data
     *
     * @param publishData the value for book.publish_data
     *
     * @mbg.generated
     */
    public void setPublishData(Date publishData) {
        this.publishData = publishData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.prime_cost
     *
     * @return the value of book.prime_cost
     *
     * @mbg.generated
     */
    public Float getPrimeCost() {
        return primeCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.prime_cost
     *
     * @param primeCost the value for book.prime_cost
     *
     * @mbg.generated
     */
    public void setPrimeCost(Float primeCost) {
        this.primeCost = primeCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.current_price
     *
     * @return the value of book.current_price
     *
     * @mbg.generated
     */
    public Float getCurrentPrice() {
        return currentPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.current_price
     *
     * @param currentPrice the value for book.current_price
     *
     * @mbg.generated
     */
    public void setCurrentPrice(Float currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.image
     *
     * @return the value of book.image
     *
     * @mbg.generated
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.image
     *
     * @param image the value for book.image
     *
     * @mbg.generated
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.publishing_company
     *
     * @return the value of book.publishing_company
     *
     * @mbg.generated
     */
    public String getPublishingCompany() {
        return publishingCompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.publishing_company
     *
     * @param publishingCompany the value for book.publishing_company
     *
     * @mbg.generated
     */
    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany == null ? null : publishingCompany.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.type
     *
     * @return the value of book.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.type
     *
     * @param type the value for book.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

	public Type getTypes() {
		return types;
	}

	public void setTypes(Type types) {
		this.types = types;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", descripts=" + descripts
				+ ", status=" + status + ", author=" + author + ", createDate="
				+ createDate + ", updateDate=" + updateDate + ", publishData="
				+ publishData + ", primeCost=" + primeCost + ", currentPrice="
				+ currentPrice + ", image=" + image + ", publishingCompany="
				+ publishingCompany + ", type=" + type + ", types=" + types
				+ "]";
	}
    
	
    
}