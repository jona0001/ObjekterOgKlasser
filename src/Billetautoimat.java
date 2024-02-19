public class Billetautoimat {
    public static void main(String[] args) {




        Billetautomat demo = new Billetautomat(50);


        System.out.println( "denne billet koster " + demo.getPris() + "kr");
        demo.indbetal(150);
        demo.printbillet();
        System.out.println(demo.getSaldo());







    }



}
