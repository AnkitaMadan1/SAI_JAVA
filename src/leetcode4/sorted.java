package leetcode4;

public class sorted {
	public static boolean sorted(int[] arr) {
        boolean sorted = false;
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] > arr[i + 1]) {
				sorted=  false;
				//return sorted;
			}else {
			    sorted= true;
			}
		}
		
   return sorted;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 6, 5 };
		System.out.println(sorted(a));

	}

}
