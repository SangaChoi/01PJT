package jp09;

public class AfterThreadRunnable implements Runnable {
	
	private String name;

	public AfterThreadRunnable() {
		// TODO Auto-generated constructor stub
	}
	public AfterThreadRunnable(String name) {
		this.name=name;
	}

	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			System.out.println(name+" : "+i);
			
			
			 //sleep()
			 /* try{
			  	Thread.sleep(1000);			  	
			  }catch(InterruptedException e) {
			  	System.out.println(e);
			  }*/
			 
			
		}

	}

	public static void main(String[] args) {

		System.out.println("여기는 main start...");
		Runnable bt1=new AfterThreadRunnable("1번째");
		Runnable bt2=new AfterThreadRunnable("2번째");
		
		Thread t1=new Thread(bt1);
		Thread t2=new Thread(bt2);

		t1.start();
		t2.start();
		System.out.println("여기는 main end...");

	}

}
