public class Hold {
    // putter mit array som en af mine attributes fordi det er nemt.og er min Information expert
    String[] klasse = {"Noah","Jonathan","Nikolaj","Esra"};
    boolean yes = true;


    //constructor
    public Hold(){
    }

    //metode
    public String findStudent(String name) {
        for (String x : klasse) {
            if (x.equals(name)) {
                return "Navnet findes! "+x+" går i denne klasse";
            }
        }
        return "Navnet findes IKKE i klassen";
    }

    }




