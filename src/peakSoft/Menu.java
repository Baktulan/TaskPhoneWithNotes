package peakSoft;

import java.util.Scanner;

public class Menu {
    public Menu() {
    }
    public void menu(){
        Notes notes = new Notes();
        BankApp bankApp = new BankApp();
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.println("""
                    [][[][][][[][][][][][][][]
                    []                      []
                    []  1.Bank App          []
                    []  2.Notes             []
                    []  3.Calculator        []
                    []  0:OFF               []
                    [][][][][][][][][][][][][]
                    """);
            num = scanner.nextInt();
            switch (num) {
                case 1:
                    bankApp.signIn(scanner);
                    break;
                case 2:
                    notes.getMenuNotes(scanner);
                    break;
                case 3:
                    calculator.menuCalculator(scanner);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid number. Please try again!");
                    break;
            }


        }
    }
}
