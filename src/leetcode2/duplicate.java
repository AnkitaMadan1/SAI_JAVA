package leetcode2;

public class duplicate {

    public static void removeDuplicates(int[] arr) {
    	
    	int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            boolean isDuplicate = false;

            // check if this element already appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // print only if NOT duplicate
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 3};
       
       
    }
}
