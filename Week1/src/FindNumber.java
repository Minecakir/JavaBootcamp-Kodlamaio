public class FindNumber {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int searchingNumber = 5;
        boolean find = false;
        int[] numArr = numbers;
        int numLength = numbers.length;

        for(int i = 0; i < numLength; ++i) {
            int number = numArr[i];
            if (number == searchingNumber) {
                find = true;
                break;
            }
        }

        if (find) {
            System.out.println("Number is found.");
        } else {
            System.out.println("Number is not found.");
        }

    }
}
