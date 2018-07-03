package java1;

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     
		int n=7;
		
		 if( n%3==0 || n%5==0)
		{
			System.out.println("FIZZBUZZ");
		
		}
		 else{
			 
			 if(n%3==0)
				{
					System.out.println("FIZZ");
				}
					
				else	if(n%5==0)
				
				{
				System.out.println("BUZZ");	
				}
			
			System.out.println("NUMBER IS : "+n);
		
		 }
		
	}
	
}

	
