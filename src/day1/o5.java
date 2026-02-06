package day1;

public class o5 {

	public static void main(String[] args) {
		//duplicate charater
		String s = "programming";
		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
		    for (int j = i + 1; j < arr.length; j++) {
		        if (arr[i] == arr[j]) {
		            System.out.println(arr[i]);
		            break;
		        }
		    }
		}


	}

}
