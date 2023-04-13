package io;

public class MyThread extends Thread
{
	//to execute the code
	public void run()
	{
		for(int i=1;i<=5;i++) {
			System.out.println("Thread"+Thread.currentThread().getId()+":"+i);
		try {
			Thread.sleep(1000);//sleep for 1 second
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		}
	}
	public class ThreadExample
	{
	public static void main(String[] args) 
	{
	 //Create and start 3 threads
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		t1.start();//to start the thread execution
		t2.start();
		t3.start();
		
		//wait for all threads to finish
		try
		{
		t1.join();
		t2.join();
		t3.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("All threads Finished");
	}
	}
	}
