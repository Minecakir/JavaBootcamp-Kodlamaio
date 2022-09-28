public class MethodsWithParameter {
    public static void main(String[] args){
        add();
        System.out.println("Call sum function "+sum(8,2));
        System.out.println("Call multiplication function "+multiplication(8,2));
    }

    public static void add(){
        System.out.println("Added");
    }

    public static void delete(){
        System.out.println("Deleted");
    }

    public static void update(){
        System.out.println("Updated");
    }

    public static int sum(int number1, int number2){
        return(number1+number2);
    }

    public static int multiplication(int number1, int number2){
        return(number1*number2);
    }
}
