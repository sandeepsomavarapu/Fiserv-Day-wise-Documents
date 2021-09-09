package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool4 {
public static void main(String[] args) {
	//create the pool
	ExecutorService service=	Executors.newCachedThreadPool();
	//submit tasks for execution
	for(int i=0;i<1000;i++)
	{service.execute(new Task4());}
	System.out.println("Thread name :"+Thread.currentThread().getName());
}
}
class Task4 implements Runnable
{
	public void run() {
		System.out.println("Thread name :"+Thread.currentThread().getName());
	}
	}