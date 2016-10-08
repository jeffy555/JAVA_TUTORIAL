package ThreadExample;

class Demo extends Thread{


		
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

	public 	class Threading
		{
			public static void main(String[] args)
			{
				Demo t = new Demo();
				t.start();
				Demo t1 = new Demo();
				t1.start();
			}
		}
		

