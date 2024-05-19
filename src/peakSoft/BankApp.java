package peakSoft;

import java.util.Scanner;

public class BankApp {
    private Long balance=1000000L;
    private static final String login = "baktulan";
    private static final String password = "Baktulan1234";
    private final String cardNumber = "100400";
    private final Scanner scannerBankInt= new Scanner(System.in);
    private final Scanner scannerBankString= new Scanner(System.in);

    public BankApp() {

    }

    public BankApp(Long balance) {
        this.balance = balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Long getBalance() {
        return balance;
    }

    public void signIn(Scanner scanner) {
        while (true) {
            System.out.println("Write login: or '0' for exit:");
            String login1 = scannerBankString.nextLine();
            System.out.println("Write password: or '0' for exit:");
            String password1 = scannerBankString.nextLine();
            if (login1.equals("0")) {
                return;
            }
            if (password1.equals(0)){
                return;
            }
            if (login.equals(login1) && password.equals(password1)) {
                System.out.println("Welcome "+ login);
                getMenu(scannerBankInt);
                break;
            } else {
                System.out.println("Login or password incorrect! Please try again!");

            }
        }

    }

    private void getMenu(Scanner scanner) {

        int balance1=0;

        while (true){
            System.out.println("""
                    [][[][][][[][][][][][][][]
                    []                      []
                    []  1.Check balance     []
                    []  2.Send Money        []
                    []  0.Menu              []
                    []                      []
                    [][][][][][][][][][][][][]""");
            balance1= scanner.nextInt();
            switch (balance1){
                case 1:
                    System.err.println("Your balance is :"+balance);
                    break;
                case 2: sendMoney(scannerBankInt);
                break;
                case 0:return;
            }
        }
    }

    private void sendMoney(Scanner scannerBankInt) {

        while (true) {
            System.out.println("Write recipient card ( 6 digit number):");
            String cardaNumberRec = scannerBankString.nextLine();
            if (cardaNumberRec.length() != 6) {
                System.out.println("Number of card must be 6 digit");
            }else {
                System.out.println("Please indicate the amount");
                Long numberOfBalance = scannerBankInt.nextLong();
                if (numberOfBalance>balance){
                    System.out.println("Not enough amount");
                } else {
                    System.out.println(" Money sent successfully " + " balance:" + (balance - numberOfBalance));
                    balance -= numberOfBalance;
                }
                break;
            }

        }
    }


}
