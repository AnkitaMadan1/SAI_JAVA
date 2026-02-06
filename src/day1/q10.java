package day1;

public class q10 {

    static int max(int num1, int num2, int num3) {
        int max;  // variable to store the greatest number

        if (num1 > num2 && num1 > num3) {
            max = num1;  // num1 is greatest
        } else if (num2 > num3) {
            max = num2;  // num2 is greatest
        } else {
            max = num3;  // num3 is greatest
        }

        return max;  // return the greatest number
    }

    public static void main(String[] args) {

        int num4 = 40;
        int num5 = 70;
        int num6 = 30;

        int result = max(num4, num5, num6);  // calling method
        System.out.println("The largest number is: " + result);

    }
}

