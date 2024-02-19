import java.util.Scanner;

public class TerningSpil {
    public static void main(String[] args) {

        Terning spil = new Terning();
        Terning spil2 = new Terning();
        int shots =0;

        System.out.println("welcome to snake eyes");
        System.out.println("everytime you fail please take a shot");
        System.out.println("type in anything to begin");

        Scanner input = new Scanner(System.in);
        String roll = input.nextLine();

        if (roll.equals("start")){

        } do {

            spil.roll();
            spil2.roll();
            System.out.println("terningOne: " + spil.faceValue + " " + "terningTwo " + spil2.faceValue);
            System.out.println("not it, take a shot");
            shots +=1;


        }
        while ((spil.faceValue != 1 || spil2.faceValue != 1));
        System.out.println("you win");
        System.out.println("take " + shots + " shots");

    }
}
