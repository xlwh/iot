/*
 * Title:        在线打印系统2014年8月15日
 * Description:  [描述模块的功能、作用、使用方法和注意事项]
 * Copyright:    Copyright (c) 2014
 * Company:      个人项目
 * @author       张洪斌
 * @version      1.0  2014年8月15日
 */
package com.zhang.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zhang.domain.Apply;

/**
 * (一句话功能简述)
 * (功能详细描述)
 * @author       张洪斌
 * @see          [相关类,可选,也可多条,对于重要的类或接口建议注释]
 * @since        在线打印系统, 2014年8月15日
 */
public class ApplyDao extends HibernateDaoSupport
{
    /*
     * 数据添加
     */
	
	public void add(Apply apply)
	{
		this.getHibernateTemplate().save( apply );
	}
	
	/*
	 * 审核
	 */
	
	public void update(Apply apply)
	{
		this.getHibernateTemplate().update( apply );
	}
	
	/*
	 * 查看所有报名者数据
	 * 
	 */
	
	public List<?> viewAll()
	{
		return this.getHibernateTemplate().find( "from Apply where state='0'" );
	}
	
	/*
	 * 获得所有已经被录取的学生的名单
	 */
	
	public List<?> viewOready()
	{
		return this.getHibernateTemplate().find( "from Apply where state='1'" );
	}
}
