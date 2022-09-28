public class Arrays {

    public static void main(String[] args) {
        String[] students = new String[]{"Mine", "Muge"};

        for (int i = 0; i < students.length; ++i) {
            System.out.println(students[i]);
        }

        String[] var6 = students;
        int i = students.length;

        int j;
        for (j = 0; j < i; ++j) {
            String student = var6[j];
            System.out.println(student);
        }

        String[][] cities = new String[3][3];
        cities[0][0] = "Eskisehir";
        cities[0][1] = "Istanbul";
        cities[0][2] = "Tekirdag";
        cities[1][0] = "Izmir";
        cities[1][1] = "Mugla";
        cities[1][2] = "Antalya";
        cities[2][0] = "Ankara";
        cities[2][1] = "Edirne";
        cities[2][2] = "Aydin";

        for (i = 0; i < cities.length; ++i) {
            System.out.println("--------------------");

            for (j = 0; j < cities.length; ++j) {
                System.out.println(cities[i][j]);
            }
        }

    }
}