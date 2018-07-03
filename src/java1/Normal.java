package java1;

public class Normal extends Abstract implements NewInt{

	@Override
	public void Walk() {
		// TODO Auto-generated method stub
		
		System.out.println("Walk");

	}

	@Override
	public void Talk() {
		// TODO Auto-generated method stub
		System.out.println("Talk");
	 
	}
	
	public void Sleep(){
		 
		 System.out.println(" Child Sleep");
		 super.Sleep();
	 }

	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		System.out.println("Eat");
		
	}

	@Override
	public void Write() {
		// TODO Auto-generated method stub
		System.out.println("Eat1");
		
		
	}

	@Override
	public void Drink() {
		// TODO Auto-generated method stub
		System.out.println("Eat2");
		
		
	}

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("Eat3");
		
		
	}
	
}


