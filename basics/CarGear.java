package in.co.rays.basics;

public class CarGear {

	public static void main(String[]args) {
		
		int i=10;
		
	if ( i>0 && i<=20) {
	 System.out.println("1st gear");
	}
	else if ( i>21 && i<=30) {
		System.out.println("2nd gear");
	}
	else if(i>31 && i<=40) {
		System.out.println("3rd gear");
	}
	else if (i>41 && i<=50) {
		System.out.println("4th gear");
	}
	else if (i>51 && i<=100) {
		System.out.println("5th gear");
	}
	
	else {
		System.out.println("stop");
	}
	 }
	
	}