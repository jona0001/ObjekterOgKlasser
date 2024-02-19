public class ClockDisplay {
    //attributes
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;

    //constructor
    //
    public ClockDisplay() {
        hours = new NumberDisplay(60);
        minutes = new NumberDisplay(24);
        updateDisplay();



    }

    public String getDisplayString() {
        return displayString;
    }








}
