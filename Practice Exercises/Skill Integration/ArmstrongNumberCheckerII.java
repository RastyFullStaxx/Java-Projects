public class ArmstrongNumberChecker {
    public static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == originalNum;
    }

    public static void main(String[] args) {
        int number = 153;
        System.out.println(number + " is an Armstrong number: " + isArmstrongNumber(number));
    }
}
