import java.util.ArrayList;
import java.util.List;

public class Lekarz {
    private String imie;
    private String nazwisko;
    public ArrayList<Pacjent> pacjents = new ArrayList<>();

    public Lekarz(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public ArrayList<Pacjent> getPacjents() {
        return pacjents;
    }

    public void setPacjents(Pacjent pacjent) {
        pacjents.add(pacjent);
    }
//dodałem dla testwoawnia
    @Override
    public String toString() {
        return "Lekarz{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pacjents=" + pacjents +
                '}';
    }
}
