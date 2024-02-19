public class RegneMaskine {
    //attributions
    double x;
    double y;

    // constructor
    public RegneMaskine(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // metode
    public double addition() {
        return (this.x + this.y);
    }

    public double multiplikation() {
        return (this.x * this.y);
    }

    public double division() {
        return (this.x / this.y);
    }
}
