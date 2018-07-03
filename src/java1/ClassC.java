package java1;

public class ClassC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ClassB a = new ClassB();
	a.load();
	ClassA.load();
		
	}



static {
	System.out.println("Static Block");
	
}


}