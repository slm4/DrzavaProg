import java.util.Scanner;

public class Engine {
    static void start() {
        Drzava.dodajDrzavu();
        FederativnaDrzava.dodajDrzavu();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Engine.start();
        while (true) {
            int opcija = sc.nextInt();
            switch (opcija) {
                case 1:
                    Service.prikazSvihDrzava();
                    break;
                case 2:
                    break;
                case 3:
                    Service.prikazSvihMesta();
                    break;
                case 4:
                    Service.prikazDrzavaSaBrojemStanovnika();
            }
        }
    }
}
