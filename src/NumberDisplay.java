public class NumberDisplay {
    // Attributes
    // limit på et ur (60)
    // value tiden på et ur
    int limit;
    int value;

    //vores constructor der sætter vores tal på 0 i dette tilfælde når vi rammer vores limit
    // value i 0 da vores ur begynder ved 0
    public NumberDisplay(int rollOverLimit) {
        limit = rollOverLimit;
        value = 0;

    }

    // vores getter metode der returere vores value
    public int getValue() {
        return value;
    }

    // denne metode viser vores tal som text.
    // Hvis value er mindre end 0, så returneres en String som består af ”0” samt værdien af value.
    // Ellers, returneres ”” samt værdien af value.
    public String getDisplayValue() {
        if (value <= 10) {
            return "0" + value;
        } else {
            return "" + value;
        }

    }

    // setter metoder (bruger man hvis man vil ændre en værdi (value).
    // her har vi sagt at hvis replacementvalue er højere eller = med 0 og mindre eller = vores limit så ændre vi
    // vores value til vores replacementvalue.
    public void setValue(int replacementValue) {
        if (replacementValue >= 0 && replacementValue < limit) {
            value = replacementValue;

        }


    }
    // her har vi en metode der gør det muligt at vores value stiger
    // her har vi gjort at hvis vores value overstiger Limit (value = (value +1 ))
    // via % limit tilskrives kun den resterende værdi. så 58 + 1 % 59  så vores value = 59 i dette tilfælde.
    // 59 + 1 % 60 = 1
    public void increment(){
        value = (value + 1) % limit;
    }

}
