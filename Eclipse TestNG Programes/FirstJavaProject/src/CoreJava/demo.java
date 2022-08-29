package CoreJava;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 12345;
		int remainder = 0;
		int reversed = 0;
		
		while(no!=0) {
			remainder = no%10;
			reversed = reversed*10+remainder;
			no = no/10;
		}
		System.out.println("Reversed no: "+ reversed);
	}

}
