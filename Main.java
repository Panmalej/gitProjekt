import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pojisteny> pojisteniList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("Vyberte moznost:");
            System.out.println("1 - Vytvorit pojisteneho");
            System.out.println("2 - Zobrazit seznam vsech pojistenych");
            System.out.println("3 - Vyhledat pojisteneho podle jmena a prijmeni");
            System.out.println("0 - Konec");

            int volba = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (volba) {
                case 1:
                    System.out.println("Zadejte jmeno:");
                    String jmeno = sc.nextLine();
                    System.out.println("Zadejte prijmeni:");
                    String prijmeni = sc.nextLine();
                    System.out.println("Zadejte vek:");
                    int vek = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    System.out.println("Zadejte telefonni cislo:");
                    String telefon = sc.nextLine();
                    Pojisteny pojisteny = new Pojisteny(jmeno, prijmeni, vek, telefon);
                    pojisteniList.add(pojisteny);
                    break;
                case 2:
                    for (Pojisteny p : pojisteniList) {
                        System.out.println(p.toString());
                    }
                    break;
                case 3:
                    System.out.println("Zadejte jmeno a prijmeni hledane osoby:");
                    String najdiJmeno = sc.nextLine();
                    for (Pojisteny p : pojisteniList) {
                        if (p.toString().contains(najdiJmeno)) {
                            System.out.println(p.toString());
                        }
                    }
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Neplatna moznost, zkuste znovu.");
                    break;
            }
        }

        sc.close();
    }
}