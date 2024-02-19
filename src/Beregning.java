public class Beregning {
    public static void main(String[] args) {






        //instans eller obejct af klassen
        RegneMaskine rm = new RegneMaskine(14.0, 15.0);

        System.out.println(rm.addition());
        System.out.println(rm.multiplikation());
        System.out.println(rm.division());



        rm.x=30.0;
        rm.y=20.0;

        System.out.println("ny " + rm.addition());
        System.out.println("ny " + rm.multiplikation());
        System.out.println("ny " + rm.division());


    }
}