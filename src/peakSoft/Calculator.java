package peakSoft;

import java.util.Scanner;

public class Calculator {
    private double a;
    private double b;

    public Calculator() {
    }

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    public void menuCalculator(Scanner scanner){
        int number;
        while (true){
            System.out.println("""
                    [][[][][][[][][][][][][][]
                    []                      []
                    []  1.Addition       +  []
                    []  2.Subtraction    -  []
                    []  3.Multiplication *  []
                    []  4.Division       /  []
                    []  0.Menu              []
                    []                      []
                    [][][][][][][][][][][][][]""");
            number=scanner.nextInt();
            switch (number){
                case 1:addition(scanner);
                break;
                case 2:subtraction(scanner);
                break;
                case 3:multiplication(scanner);
                break;
                case 4:division(scanner);
                break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid number");
                    break;
            }
        }
    }
    public void addition(Scanner scanner) {
        System.out.println("""
                +++++++++ADITION+++++++++""");
        System.out.println("Write first number: ");
        a = scanner.nextInt();
        System.out.println("Write second number");
        b = scanner.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
    }
    public void subtraction(Scanner scanner){
        System.out.println("""
                ---------SUBTRACTION---------""");
        System.out.println("Write first number: ");
        a= scanner.nextInt();
        System.out.println("Write second number");
        b= scanner.nextInt();
        System.out.println(a+" - "+b+" = "+(a-b));
    }
    public void multiplication(Scanner scanner){
        System.out.println("""
                ********MULTIPLICATION*********""");
        System.out.println("Write first number: ");
        a= scanner.nextInt();
        System.out.println("Write second number");
        b= scanner.nextInt();
        System.out.println(a+" * "+b+" = "+(a*b));
    }
    public void division(Scanner scanner){
        System.out.println("Write first number: ");
        a= scanner.nextInt();
        System.out.println("Write second number");
        b= scanner.nextInt();
        if (b==0){
            System.out.println("Division to Zero it is forbidden!!!");
        }else System.out.println(a+" / "+b+" = "+(a/b));
    }
}