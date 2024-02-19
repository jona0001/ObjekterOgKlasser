import java.util.Random;

public class Terning {
    int max =6;
    int faceValue;
    Random random = new Random();

    public Terning(){
        this.random = new Random();
        this.faceValue = random.nextInt(max)+1;



    }

    public void roll (){
        this.faceValue = random.nextInt(max)+1;


    }

}
