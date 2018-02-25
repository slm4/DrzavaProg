import java.util.List;
import java.util.Scanner;

public class Service {
    static Scanner sc = new Scanner(System.in);

    static void ispisMesta(List<Mesto> m) {
        for (int j = 0; j < m.size(); j++) {
            System.out.println(m.get(j).getIme());
        }
    }

    static void prikazSvihDrzava() {
        for (int i = 0; i < AbstractDrzava.listSvihDrzava.size(); i++) {
            System.out.println(AbstractDrzava.listSvihDrzava.get(i).getIme());
        }
    }

    static void prikazSvihMesta() {
        System.out.println("Unesite ime drzave");
        String unos = sc.next();
        for (int i = 0; i < Drzava.listSvihDrzava.size(); i++) {
            if (Drzava.listSvihDrzava.get(i).getIme().equals(unos)) {
                switch (unos) {
                    case "Bosna":
                        ispisMesta(Mesto.mestaBosna());
                        break;
                    case "Srbija":
                        ispisMesta(Mesto.mestaSrbija());
                        break;
                }
            }
        }
    }

//    static int sabiranjeStanovcnika(List <Mesto> m){
//        int suma = 0;
//        for (int j = 0; j < m.size(); j++) {
//            suma += m.get(j).brojStanovnika;
//
//        }
//        return suma;
//
//    }

    static int sabiranjeStanovcnika() {
        int suma = 0;
        int brojac = 0;
        for (int i = 0; i < Drzava.listaMestaDrzave.size(); i++) {

            for (int j = 0; j < Drzava.listaMestaDrzave.size(); j++) {

                if (Drzava.listaMestaDrzave.get(j).getId() == i) {
                    System.out.println(i);
                    suma += Drzava.listaMestaDrzave.get(i).brojStanovnika;
                }
            }

        }
        return suma;
    }

    static void prikazDrzavaSaBrojemStanovnika() {
        for (int i = 0; i < AbstractDrzava.listSvihDrzava.size(); i++) {
            System.out.println(AbstractDrzava.listSvihDrzava.get(i).getIme() + ", broj stanovnika: " + sabiranjeStanovcnika());

        }
    }
}
