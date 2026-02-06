package leetcode2;

public class palindrone {

    public static boolean palindrome(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] != arr[right]) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        System.out.println(palindrome(a));
    }
}
