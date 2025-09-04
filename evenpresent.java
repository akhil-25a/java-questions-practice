//how many evendigit  of numbers present in array
public class evenpresent {
    public static void main(String[] args) {
        int []nums={12,33,4,5,6,123};
        System.out.print(findnum(nums));
    }
//fxn to check digits in array
    static int findnum(int[] nums) {
        int count = 0;
        for (int num: nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
//check the digit is even or not
    static boolean even(int num) {
        int numberofdigits = digit(num);
        if (numberofdigits % 2 == 0) {
            return true;
        }
        return false;
    }
//count the number of digits
    static int digit(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;}}
