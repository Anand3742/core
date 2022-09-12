package in.co.rays.basics;



public class Rverseatplace {

	public static void main(String[] args) {
		
		String name= "Vijay Dinanath Chohan";
		
		String[] arr= name.split(" ");
										
		for (int i=0;i<=arr.length-1; i++ ) {
			for (int j = arr[i].length()-1; j >=0; j--) {
				System.out.print(arr[i].charAt(j));
												
			}
			System.out.print(" ");
		}
	         	
	}
}
 							