package com.psl;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyTimerInterceptor implements Interceptor {

	public void destroy() {
		System.out.println("in MyTimerInterceptor destroy ");

	}

	public void init() {
		System.out.println("in MyTimerInterceptor init ");
		// TODO Auto-generated method stub

	}

	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("in MyTimerInterceptor intercept ");
		long start = System .currentTimeMillis();
		String retval=null;
		retval=	ai.invoke();
		System.out.println("in MyTimerInterceptor retval "+retval);
		long end = System .currentTimeMillis();
		System.out.println("Time  taken to process interceptor  "+(end-start));
		return retval;
	}

}
