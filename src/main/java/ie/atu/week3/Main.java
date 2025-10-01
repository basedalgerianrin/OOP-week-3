package ie.atu.week3;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create an instance of Calculator
        Calculator calc = new Calculator();

        //Input values
        System.out.println("Simple Calculator - Add Two Numbers");
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        double results = 0;

        //calling the methods from classes

        switch(calc){
            case 'add':
                calc.add(a,b);
                break;
            case'subtract':
                calc.sub(a,b);
                break;
            case 'multiply':
                calc.multi(a,b);
                break;
            case 'divide':
                calc.divide(a,b);
                break;
            default:
                System.out.print("Invalid input");
                break;
        }

        //output results
        System.out.println("Result: " + results);
        sc.close();
    }
    //test
}
