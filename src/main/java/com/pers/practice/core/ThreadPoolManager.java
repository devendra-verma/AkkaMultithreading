package com.pers.practice.core;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class ThreadPoolManager {
	
	private static ThreadPoolManager threadPoolManager = null;
	private static ThreadPoolExecutor ccruThreadPoolExecutor = null;
	
	public static ThreadPoolManager getInstance() {
		if (null == threadPoolManager) {
			threadPoolManager = new ThreadPoolManager();
		}
		return threadPoolManager;
	}
	
	public static ThreadPoolExecutor getCCRUThreadPoolExecutor() {
		if (null == ccruThreadPoolExecutor) {
			ccruThreadPoolExecutor  =  new ThreadPoolExecutor(10, 15, 1000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
		}
		return ccruThreadPoolExecutor;
	}
}
