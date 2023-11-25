package UNGUIDED;

public class Titik {
    private double x1, x2;
    private double y1, y2;

    // konstruktor
    public Titik(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public String koordinat() {
        return "[ " + x1 + ", " + y1 + "]";
    }

    public static double hitungJarak(Titik t2) {
        double xx = t2.x2 - t2.x1;
        double yy = t2.y2 - t2.y1;
        return Math.sqrt((xx * xx) + (yy * yy));
    }

    public void tampilTitik() {
        System.out.println("Point : " + koordinat());
    }
}
