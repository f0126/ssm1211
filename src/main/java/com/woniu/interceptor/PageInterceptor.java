package com.woniu.interceptor;

import java.util.Properties;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;

public class PageInterceptor implements Interceptor{

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		Object obj = invocation.proceed();
		return obj;
	}

	@Override
	public Object plugin(Object target) {
		Object wrap = Plugin.wrap(target, this);
		return wrap;
	}

	@Override
	public void setProperties(Properties properties) {
		
	}

}
