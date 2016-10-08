package ThreadExample;

public class Threading2 {
	
	public static void main(String[] args) {
		
		Thread t3 = new Thread(new Runnable() {
			
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
			
		});

		t3.start();
		
}		
}
		
	


