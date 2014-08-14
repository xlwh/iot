/*
 * Title:        在线打印系统2014年8月14日
 * Description:  [描述模块的功能、作用、使用方法和注意事项]
 * Copyright:    Copyright (c) 2014
 * Company:      个人项目
 * @author       张洪斌
 * @version      1.0  2014年8月14日
 */
package com.zhang.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * (一句话功能简述)
 * (功能详细描述)
 * @author       张洪斌
 * @see          [相关类,可选,也可多条,对于重要的类或接口建议注释]
 * @since        在线打印系统, 2014年8月14日
 */
public class Test
{

	/**
	 * (一句话功能简述)
	 * (功能详细描述)
	 * @author       张洪斌
	 * @see          相关函数,对于重要的函数建议注释
	 * @since        在线打印系统, 2014年8月14日
	 * @param args
	 */
	public static void main( String[] args )
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		   Person person = (Person)ctx.getBean( "person" );
		   System.out.println(person.getName());

	}

}
