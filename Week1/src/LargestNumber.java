public class LargestNumber {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 10;
        int number3 = 1;
        int largest = number1;
        if (number2 > number1) {
            largest = number2;
        }

        if (number3 > largest) {
            largest = number3;
        }

        System.out.println("Largest number is: " + largest);
    }
}
