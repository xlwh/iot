/*
 * Title:        在线打印系统2014年8月14日
 * Description:  [描述模块的功能、作用、使用方法和注意事项]
 * Copyright:    Copyright (c) 2014
 * Company:      个人项目
 * @author       张洪斌
 * @version      1.0  2014年8月14日
 */
package com.zhang.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * (一句话功能简述)
 * (功能详细描述)
 * @author       张洪斌
 * @see          [相关类,可选,也可多条,对于重要的类或接口建议注释]
 * @since        在线打印系统, 2014年8月14日
 */

@Entity
@Table( name="test" )
public class Person
{
	@Id
	@GeneratedValue
   private int id;
   private String name;

public String getName()
{
	return name;
}

public void setName( String name )
{
	this.name = name;
}

public int getId()
{
	return id;
}

public void setId( int id )
{
	this.id = id;
}
   


}
