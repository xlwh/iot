/*
 * Title:        在线打印系统2014年8月15日
 * Description:  [描述模块的功能、作用、使用方法和注意事项]
 * Copyright:    Copyright (c) 2014
 * Company:      个人项目
 * @author       张洪斌
 * @version      1.0  2014年8月15日
 */
package com.zhang.service;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhang.dao.ApplyDao;
import com.zhang.domain.Apply;

/**
 * (一句话功能简述)
 * (功能详细描述)
 * @author       张洪斌
 * @see          [相关类,可选,也可多条,对于重要的类或接口建议注释]
 * @since        在线打印系统, 2014年8月15日
 */
public class ApplyService
{
    /*
     * 申请加入科协
     */
	
	public boolean apply(Apply apply)
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		ApplyDao dao = (ApplyDao)ctx.getBean( "applydao" );
		dao.add( apply );
		return true;
	}
	
	
	/*
	 * 管理员审核结果
	 */
	public boolean update(Apply apply)
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		ApplyDao dao = (ApplyDao)ctx.getBean( "applydao" );
		dao.update( apply );
		return true;
	}
	
	/*
	 * 获取所有报名者的信息
	 */
	public List<?> vewAll()
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		ApplyDao dao = (ApplyDao)ctx.getBean( "applydao" );
		return dao.viewAll();
	}
	
	
	 /*
	  * 获得所有已经通过审核的学生的信息
	  */
	public List<?> vewOready()
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		ApplyDao dao = (ApplyDao)ctx.getBean( "applydao" );
		return dao.viewOready();
	}
	
	
}
