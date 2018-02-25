import java.util.ArrayList;
import java.util.List;

public class Mesto extends AbstractDrzava {

     int brojStanovnika;

    static List<Mesto>mestaSrbija(){

        List <Mesto>dodajMestoUSrbijai = new ArrayList();

        Mesto m1 = new Mesto();
        m1.setId(0);
        m1.setIme("Grocka");
        m1.brojStanovnika = 12000;
        dodajMestoUSrbijai.add(m1);

        Mesto m2 = new Mesto();
        m2.setIme("Begaljica");
        m2.setId(0);
        m2.brojStanovnika = 4000;
        dodajMestoUSrbijai.add(m2);

        return dodajMestoUSrbijai;
    }

    static List<Mesto>mestaBosna(){

        List <Mesto>dodajMestoUBosni = new ArrayList<>();

        Mesto m3 = new Mesto();
        m3.setId(1);
        m3.setIme("Sipovo");
        m3.brojStanovnika = 34000;
        dodajMestoUBosni.add(m3);


        Mesto m4 = new Mesto();
        m4.setId(1);
        m4.setIme("Mrkonjic Grad");
        m4.brojStanovnika = 129000;
        dodajMestoUBosni.add(m4);

        return dodajMestoUBosni;
    }

}
