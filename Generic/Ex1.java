package Generic;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print1("Hello");
		print1(1230);
		print1(23.22222f);
		print1(15.23232d);
		

	}
	
	public static <T> void print1(T data) {
		System.out.println(data);
		
	}

}
