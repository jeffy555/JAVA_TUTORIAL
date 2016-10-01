
public class PrimeNumber {

	public static void main(String[] args) {
		
		int limit = 100;
		
		System.out.println("Print Prime numbers between 1 to 100");
		
		for(int i=2;i<100;i++)
		{
			boolean prime = true;
			
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					prime = false;
					break;
				}
			}
		
		if (prime)
		{
			System.out.println("Values are prime"+i);
		}
		
		}
		
		
		
	}
}
