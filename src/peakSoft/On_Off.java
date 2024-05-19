package peakSoft;

import java.util.Scanner;

public class On_Off {
    private String on;
    private String off;

    public On_Off() {
    }

    public On_Off(String on, String off) {
        this.on = on;
        this.off = off;
    }

    public void onOff(Scanner scanner){
        Menu menuPhone= new Menu();
        String value=null;
        while(true){
            System.out.println("""
                    [][[][][][[][][][][][][][]
                    []                      []
                    []                      []
                    []   On   ||    Off     []
                    []                      []
                    []                      []
                    [][][][][][][][][][][][][]""");
            value=scanner.nextLine();
            switch (value){
                case "on":
                    menuPhone.menu();
                    break;
                case "off":
                    System.out.println("Phone turn off");
                    break;
                default:
                    System.out.println("Write on ot off");
                    break;
            }
        }
    }
}
