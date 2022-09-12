package in.co.rays.basics;

public class Helloar {
	public static void main(String[]args) {
		
		System.out.println("hello" +args[0] +args[1]);

		if (args.length==1) {
			System.out.println(args[0]);
			
		}
		else
			System.out.println(" parameter is required");
	}

}
