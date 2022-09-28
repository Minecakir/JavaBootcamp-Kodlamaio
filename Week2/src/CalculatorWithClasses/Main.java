package CalculatorWithClasses;


public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        System.out.println("Summation result: "+calculator.sum(3,4));
        System.out.println("Mutiplication result: "+calculator.multiplication(3,4));
        System.out.println("Division result"+calculator.division(8,2));
    }
}
