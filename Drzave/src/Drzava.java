import java.util.ArrayList;
import java.util.List;

public class Drzava extends AbstractDrzava {

  static  List<Mesto>listaMestaDrzave = new ArrayList<>();

    static void dodajDrzavu() {
        Drzava d1 = new Drzava();
        d1.setId(1);
        d1.setIme("Srbija");
        d1.listaMestaDrzave.addAll(Mesto.mestaSrbija());
        AbstractDrzava.listSvihDrzava.add(d1);

        Drzava d2 = new Drzava();
        d2.setId(2);
        d2.setIme("Bosna");
        d2.listaMestaDrzave.addAll(Mesto.mestaBosna());
        AbstractDrzava.listSvihDrzava.add(d2);
    }


}
