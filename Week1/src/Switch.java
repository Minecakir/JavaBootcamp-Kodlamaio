public class Switch {
    public static void main(String[] args) {
        char grade = 72;
        switch (grade) {
            case 65:
                System.out.println("Excellent : Passed");
                break;
            case 66:
                System.out.println("Perfect : Passed");
                break;
            case 67:
                System.out.println("Good : Passed");
                break;
            case 68:
                System.out.println("Not Good : Passed");
                break;
            case 69:
            default:
                System.out.println("Invalid Note");
                break;
            case 70:
                System.out.println("Bad : Failed");
        }

    }
}
