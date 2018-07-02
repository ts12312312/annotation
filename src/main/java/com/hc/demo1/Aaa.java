package com.hc.demo1;

public @interface Aaa {
	//加上了默认值
	public Class<?> name() default int.class;
	
	public String[] str() default {"1","34"};
	//当属性名称是value时 只需要使用一个值时  可以不写 “属性名=”
	public String[] value();
	
}
