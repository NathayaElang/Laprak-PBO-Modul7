package UNGUIDED;

public class SgtSamaSisi extends Titik {
    private double sisiSegitiga;

    // konstruktor
    public SgtSamaSisi(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
        this.sisiSegitiga = Titik.hitungJarak(this);
    }

    // menghitung jarak antar titik
    public void jtSegitigaSamaSisi() {
        Titik.hitungJarak(this);
    }

    // menghitung luas segitiga sama sisi
    public double luasSegitigaSamaSisi() {
        return 0.5 * sisiSegitiga * Math.sqrt(3);
    }

    public void tampil() {
        System.out.println(" ");
        System.out.println("====DATA Segitiga====");
        tampilTitik();
        System.out.println("Sisi Segitiga : " + sisiSegitiga);
        System.out.println("Luas Segitiga : " + luasSegitigaSamaSisi());
        System.out.println(" ");
    }
}
