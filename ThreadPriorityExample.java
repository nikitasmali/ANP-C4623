package io;

	public class ThreadPriorityExample {
	    public static void main(String[] args) {
	        // Create threads with different priorities
	        Thread t1 = new MyThread("Thread 1", Thread.MAX_PRIORITY);
	        Thread t2 = new MyThread("Thread 2", Thread.MIN_PRIORITY);
	        Thread t3 = new MyThread("Thread 3", Thread.NORM_PRIORITY);

	        // Start the threads
	        t1.start();
	        t2.start();
	        t3.start();
	    }

	    static class MyThread extends Thread {
	        public MyThread(String name, int priority) {
	            super(name);
	            setPriority(priority);
	        }

	        @Override
	        public void run() {
	            // Simulate some work
	            for (int i = 0; i < 5; i++) {
	                System.out.println(getName() + " is running");
	                try {
	                    Thread.sleep(1000);
	                } catch (InterruptedException e) {
	                    System.out.println(getName() + " was interrupted");
	                }
	            }
	        }
	    }
	}


