package java1;

public class Try {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch ( ArithmeticException A) {
			// TODO Auto-generated catch block
			System.out.println("PLEASE SELECT PROPER NUMBER ");
		}
	}
}
 