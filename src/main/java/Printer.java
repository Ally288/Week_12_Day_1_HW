public class Printer {

    private int numOfSheets;
    private int tonerLevel;

    public Printer(int numOfSheets, int tonerLevel){
        this.numOfSheets = numOfSheets;
        this.tonerLevel = tonerLevel;
    }

    public static int getSheets() {
        return numOfSheets;
    }


}
