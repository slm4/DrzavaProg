public class FederativnaDrzava extends AbstractDrzava {

    static void dodajDrzavu() {
        FederativnaDrzava d1 = new FederativnaDrzava();
        d1.setId(3);
        d1.setIme("Rusija");
        AbstractDrzava.listSvihDrzava.add(d1);

        FederativnaDrzava d2 = new FederativnaDrzava();
        d2.setId(4);
        d2.setIme("USA");
        AbstractDrzava.listSvihDrzava.add(d2);

    }
}
