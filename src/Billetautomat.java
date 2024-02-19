public class Billetautomat {
// attributes
    private int pris;
    private int saldo;
    private int total;

// constructor
    public Billetautomat (int billetpris) {
        saldo = 0;
        total = 0;
        pris = billetpris;


    }
    //getters
    public int getPris() {
        return pris;
    //getters
    }
    public int getSaldo(){
        return saldo;
    }
    public void indbetal(int kroner){
        if (kroner > 0){
            saldo += kroner;
        } else {
            System.out.println("indsæt et postivt beløb, der er større end kroners værdi");
        }

    }
    public void printbillet() {
        if (saldo >= pris) {
            System.out.println("########################");
            System.out.println("### Linje F(antasi) ###");
            System.out.println("########################");
            System.out.println("## Billet: " + pris + " kr. ##");



            total += saldo;
            saldo =0;

        }else {
            int diffrence = pris = saldo;
            System.out.println("der mangler " + diffrence + " kroner");
        }

    }



}
