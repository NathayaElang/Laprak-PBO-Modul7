package UNGUIDED;

public class Persegi extends Titik{
    private double sisiPersegi = super.hitungJarak(this);
    //konstruktor
    public Persegi(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
    }
    //menghitung jarak antar titik
    public void jaraktitikPersegi() {
        super.hitungJarak(this);
    }
    public double luasPersegi() {
        return sisiPersegi * sisiPersegi;
    }
    public void tampil() {
        System.out.println("====DATA Persegi====");
        tampilTitik();
        System.out.println("sisi Persegi : " + sisiPersegi);
        System.out.println("luas Persegi : " + luasPersegi());
        System.out.println(" ");
    }
}