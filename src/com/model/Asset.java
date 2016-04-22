package com.model;

/**
 * PAsset entity. @author MyEclipse Persistence Tools
 */

public class Asset implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer typeid;
	private Integer userSectionid;
	private Integer keeperid;
	private Integer userid;

	// Constructors

	/** default constructor */
	public Asset() {
	}

	/** full constructor */
	public Asset(Integer typeid, Integer userSectionid, Integer keeperid,
			Integer userid) {
		this.typeid = typeid;
		this.userSectionid = userSectionid;
		this.keeperid = keeperid;
		this.userid = userid;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTypeid() {
		return this.typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public Integer getUserSectionid() {
		return this.userSectionid;
	}

	public void setUserSectionid(Integer userSectionid) {
		this.userSectionid = userSectionid;
	}

	public Integer getKeeperid() {
		return this.keeperid;
	}

	public void setKeeperid(Integer keeperid) {
		this.keeperid = keeperid;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

}