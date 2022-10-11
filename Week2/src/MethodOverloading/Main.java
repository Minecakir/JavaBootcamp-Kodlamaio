package MethodOverloading;

public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println("Summation for two  numbers: "+ calculator.sum(1,2));
        System.out.println("Summation for three numbers: "+ calculator.sum2(1,2,3));
    }
}
