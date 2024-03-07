import java.util.Objects;

public class Choroba {
    private String nazwaChoroby;
    private int stopienSmiertelnosci;

    public Choroba(String nazwaChoroby) {
        this.nazwaChoroby = nazwaChoroby;
    }
    public Choroba(){

    }

    public String getNazwaChoroby() {
        return nazwaChoroby;
    }

    public int getStopienSmiertelnosci() {
        return stopienSmiertelnosci;
    }

    public void setNazwaChoroby(String nazwaChoroby) {
        this.nazwaChoroby = nazwaChoroby;
    }

    public void setStopienSmiertelnosci(int stopienSmiertelnosci) {
        this.stopienSmiertelnosci = stopienSmiertelnosci;
    }

    @Override
    public String toString() {
        return String.format("chroba o nazwie :%s ma stopień śmiertelnośći: %d(jest to liczba punktów)",nazwaChoroby,stopienSmiertelnosci);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Choroba choroba = (Choroba) o;
        return stopienSmiertelnosci == choroba.stopienSmiertelnosci && Objects.equals(nazwaChoroby, choroba.nazwaChoroby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwaChoroby, stopienSmiertelnosci);
    }
}
