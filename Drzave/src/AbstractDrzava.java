import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDrzava {
    int id;
    String ime;
    static List<AbstractDrzava> listSvihDrzava = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }
}
