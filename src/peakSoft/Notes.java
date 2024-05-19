package peakSoft;

import java.util.Arrays;
import java.util.Scanner;

public class Notes {
    private String[] notes = new String[100];
    private int countForNotes = 0;
    private String[] newArray1 = new String[0];
    private final Scanner scannerForString = new Scanner(System.in);
    private final Scanner scannerForInt = new Scanner(System.in);

    public Notes() {
    }

    public Notes(String[] notes, int countForNotes, String[] newArray1) {
        this.notes = notes;
        this.countForNotes = countForNotes;
        this.newArray1 = newArray1;
    }

    public String[] getNotes() {
        return notes;
    }

    public void setNotes(String[] notes) {
        this.notes = notes;
    }

    public int getCountForNotes() {
        return countForNotes;
    }

    public void setCountForNotes(int countForNotes) {
        this.countForNotes = countForNotes;
    }

    public String[] getNewArray1() {
        return newArray1;
    }

    public void setNewArray1(String[] newArray1) {
        this.newArray1 = newArray1;
    }
    public void getMenuNotes(Scanner scannerForInt){
        int num=0;
        while (true){
            System.out.println("""
                    [][[][][][[][][][][][][][]
                    []                      []
                    []  1.Add new Note      []
                    []  2.Update notes      []
                    []  3.Delete notes      []
                    []  0.Menu              []
                    []                      []
                    [][][][][][][][][][][][][]""");
            num=scannerForInt.nextInt();

            switch (num){
                case 1:addNewNotes();
                break;
                case 2:updateNotes();
                break;
                case 3:deleteNotes();
                break;
                case 0:return;
                default:
                    System.out.println("Invalid number");
                    return;
            }
        }
    }

    public void addNewNotes() {
        System.out.println("Write new Notes:");
        String newNotes = scannerForString.nextLine();
        notes[countForNotes] = newNotes;
        countForNotes++;
        System.out.println("New Notes successfully added");
        int b = 0;
        int c = 0;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] != null) {
                b++;

            }
        }
        String[] newArray = new String[b];
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] == null) {
                continue;
            }
            newArray[c++] = notes[i];
        }
        newArray1 = newArray;
        System.out.println(Arrays.toString(newArray1));


    }
    public void updateNotes(){
        System.out.println("Write index of notes for updating");
       int oldNotes=scannerForInt.nextInt();
        System.out.println("Write new notes");
       String  newNotes=scannerForString.nextLine();
       boolean founded=false;
        for (int i = 0; i < newArray1.length; i++) {
            if (i==oldNotes){
                newArray1[i]=newNotes;
                founded=true;
                System.out.println("Successfully updated");
                break;
            }
        }
        if (!founded){
            System.out.println("Not found index of notes");
        }
        System.out.println(Arrays.toString(newArray1));
    }

    public void deleteNotes(){
        boolean founded=false;
        int index=0;
        System.out.println("Write index of notes for deleting");
        int b =scannerForInt.nextInt();
        if (b<0|| b>=newArray1.length){
            System.out.println("Invalid index");
            return;
        }
        String[] newMassive= new String[newArray1.length-1];
        for (int i = 0; i < newArray1.length; i++) {
            if (i==b){
                founded=true;
                System.out.println("Successfully deleted");
                continue;

            }
           newMassive[index++]=newArray1[i];

        }
        if (!founded){
            System.out.println("Not found index");
        }
        System.out.println(Arrays.toString(newMassive));

    }

    @Override
    public String toString() {
        return "Notes " +
                "notes:" + Arrays.toString(notes) + "\n";
    }
}
