import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Choroba choroba1 = new Choroba("Evola");
        choroba1.setStopienSmiertelnosci(10);
        System.out.println(choroba1);
        Pacjent pacjent1 = new Pacjent("Frytold","Tłusty", LocalDate.now(),choroba1);
        System.out.println(pacjent1);
        Lekarz lekarz1 = new Lekarz("dub","dab");
        lekarz1.setPacjents(pacjent1);

        System.out.println(lekarz1);
    }
}