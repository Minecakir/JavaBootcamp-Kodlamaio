public class Loops {
    public static void main(String[] args) {
        int i;
        for(i = 0; i < 10; ++i) {
            System.out.println("Number " + i);
        }

        for(i = 1; i < 10; ++i) {
            System.out.println("Number " + i);
        }

        int j = 0;

        do {
            System.out.println(j);
            j += 2;
        } while(j < 10);

        System.out.println("End of do-while loop");
    }
}
