package Introduction;

public class for_each {

	public static void main(String[] args) {

		int[] arr = { 54, 78 };
		int sum = 0;
		
		for (int test : arr) {
			sum = sum+test;
			
			//System.out.println(sum);
		}
		 int avg = sum/arr.length;
         System.out.println(avg);
         System.out.println(sum);
	}

}
