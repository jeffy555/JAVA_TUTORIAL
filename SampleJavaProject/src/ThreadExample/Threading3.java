package ThreadExample;

 class Demo2 implements Runnable{

	@Override
	
		
		
		public void run()
		{
			
			for(int i=0; i<10; i++)
			{
				System.out.println(Thread.currentThread().getId()         + "" + "Value is" + i);
			}
			
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
		
	}
	
 
 public class Threading3
 {
	 public static void main(String[] args) {
		 
		Thread t1 = new Thread(new Demo2());
		Thread t2 = new Thread(new Demo2());
		t1.start();
		t2.start();
	}
	 	
	 
	 

}
