import java.time.LocalDate;
import java.util.Objects;

public class Pacjent {
    private String imie;
    private String nazwikso;
    private LocalDate dataPszyjencia;

    private Choroba choroba;

    public Pacjent(String imie, String nazwikso, LocalDate dataPszyjencia, Choroba choroba) {
        this.imie = imie;
        this.nazwikso = nazwikso;
        this.dataPszyjencia = dataPszyjencia;
        this.choroba = choroba;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwikso() {
        return nazwikso;
    }

    public LocalDate getDataPszyjencia() {
        return dataPszyjencia;
    }

    public Choroba getChoroba() {
        return choroba;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwikso(String nazwikso) {
        this.nazwikso = nazwikso;
    }

    public void setDataPszyjencia(LocalDate dataPszyjencia) {
        this.dataPszyjencia = dataPszyjencia;
    }

    public void setChoroba(Choroba choroba) {
        this.choroba = choroba;
    }

    @Override
    public String toString() {
        return String.format("imie %s,nazwisko %s,data pszyjęcia %s, %s",imie,nazwikso,dataPszyjencia,choroba);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pacjent pacjent = (Pacjent) o;
        return Objects.equals(imie, pacjent.imie) && Objects.equals(nazwikso, pacjent.nazwikso) && Objects.equals(dataPszyjencia, pacjent.dataPszyjencia) && Objects.equals(choroba, pacjent.choroba);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwikso, dataPszyjencia, choroba);
    }
}
