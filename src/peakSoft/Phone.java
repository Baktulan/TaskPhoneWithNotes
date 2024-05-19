package peakSoft;

public class Phone {
    private BankApp bankApp;
    private Calculator calculator;
    private Notes notes;

    public Phone() {
    }

    public Phone(BankApp bankApp, Calculator calculator, Notes notes) {
        this.bankApp = bankApp;
        this.calculator = calculator;
        this.notes = notes;
    }

    public BankApp getBankApp() {
        return bankApp;
    }

    public void setBankApp(BankApp bankApp) {
        this.bankApp = bankApp;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Phone: " +
                "bankApp: " + bankApp +"\n"+
                "calculator: " + calculator +"\n"+
                "notes=" + notes +"\n";
    }
}
