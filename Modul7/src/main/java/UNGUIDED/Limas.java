package UNGUIDED;

public class Limas {
    SgtSamaSisi segitiga;
    Persegi persegi;
    double luasSegitiga, luasPersegi;

    // konstruktor
    public Limas(double Sx1, double Sy1, double Sx2, double Sy2, double Px1, double Py1, double Px2, double Py2) {
        segitiga = new SgtSamaSisi(Sx1, Sy1, Sx2, Sy2);
        luasSegitiga = segitiga.luasSegitigaSamaSisi();
        persegi = new Persegi(Px1, Py1, Px2, Py2);
        luasPersegi = persegi.luasPersegi();
    }

    public double luasLimas() {
        return (4 * luasSegitiga) + luasPersegi;
    }

    public void tampil() {
        segitiga.tampil();
        persegi.tampil();
        System.out.println("Luas Limas : " + luasLimas());
    }
}
