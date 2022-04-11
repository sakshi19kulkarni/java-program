package threadprog;

public class YieldExample extends Thread 
	{  
	    public void run()  
	    {  
	        for (int i=0; i<3 ; i++)  
	            System.out.println(Thread.currentThread().getName() + "Run in control");  
	    }  
	    public static void main(String[]args)  
	    {  
	    	YieldExample t1 = new YieldExample();  
	    	YieldExample t2 = new YieldExample();  
	        // this will call run() method  
	        t1.start();  //runnable 
	        t2.start();  //runnable
	        for (int i=0; i<3; i++)  
	        {  
	            // Control passes to child thread  
	            t1.yield();  
	            System.out.println(Thread.currentThread().getName() + " Main in control");  
	        }  
	    }  
	}



