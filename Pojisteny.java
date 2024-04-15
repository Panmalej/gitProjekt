import java.util.ArrayList;
import java.util.Scanner;

class Pojisteny {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefon;

    public Pojisteny(String jmeno, String prijmeni, int vek, String telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return jmeno + " " + prijmeni + " (vek: " + vek + ", tel: " + telefon + ")";
    }
}