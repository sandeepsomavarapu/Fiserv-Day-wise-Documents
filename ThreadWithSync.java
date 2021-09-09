package com.threads;
class First {
	public synchronized void display(String msg) {
		System.out.print("[" + msg);// [welcome][new][ja ]
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class Second extends Thread// is-a
{
	String msg;
	First fobj;// has-a

	Second(First fp, String str) {
		this.fobj = fp;
		this.msg = str;
		this.start();
	}

	public void run() {
		fobj.display(msg);// welcome
	}
}

public class ThreadWithSync {
	public static void main(String[] args) {
		First fnew = new First();

		Second ss = new Second(fnew, "welcome");//t1

		ss = new Second(fnew, "new");//t2

		ss = new Second(fnew, "java programmer");//t3

	}
}