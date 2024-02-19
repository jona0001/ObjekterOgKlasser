public class Tid {

    public static void main(String[] args) {

        int seconds = 606060;
        printTime(seconds);

        }

        public static void printTime(int seconds){

            int remainingSeconds = seconds % 60;

            int minutes = seconds / 60;

            int remainingMinutes = minutes % 60;

            int hours = minutes / 60;

            System.out.println("The required time is "  + hours + " hours " + remainingMinutes + " minutes and " + remainingSeconds + " seconds");
        }

    }