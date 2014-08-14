/*
 * Title:        南京邮电大学物联网学院科学技术协会网站 2014年8月15日
 * Description:  招新报名表映射对象
 * Copyright:    Copyright (c) 2014
 * Company:      个人项目
 * @author       张洪斌
 * @version      1.0  2014年8月15日
 */
package com.zhang.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * 招新报名表映射对象
 * 
 * @author 张洪斌
 * @see
 * @since 2014年8月15日
 */

@Entity
@Table(name="apply")
public class Apply
{
	private int			id;
	private String		name;
	private String		academy;
	private String		major;
	private String		studentid;
	private String		email;
	private String		qq;
	private String		desc;
	private int			state;
	

	@Id
	@GeneratedValue
	public int getId()
	{
		return id;
	}

	public void setId( int id )
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public String getAcademy()
	{
		return academy;
	}

	public void setAcademy( String academy )
	{
		this.academy = academy;
	}

	public String getMajor()
	{
		return major;
	}

	public void setMajor( String major )
	{
		this.major = major;
	}

	public String getStudentid()
	{
		return studentid;
	}

	public void setStudentid( String studentid )
	{
		this.studentid = studentid;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail( String email )
	{
		this.email = email;
	}

	public String getQq()
	{
		return qq;
	}

	public void setQq( String qq )
	{
		this.qq = qq;
	}

	public String getDesc()
	{
		return desc;
	}

	public void setDesc( String desc )
	{
		this.desc = desc;
	}

	public int getState()
	{
		return state;
	}

	public void setState( int state )
	{
		this.state = state;
	}
     
}
