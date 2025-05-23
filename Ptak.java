public class Ptak extends Zwierze {
    private boolean potrafiLatac;

    public Ptak(String nazwa, int wiek, boolean potrafiLatac) {
        super(nazwa, wiek);
        this.potrafiLatac = potrafiLatac;
    }

    @Override
    public String wydajDzwiek() {
        return "Ćwierka";
    }

    @Override
    public String poruszajSie() {
        return potrafiLatac ? "Lata w powietrzu" : "Skacze po ziemi";
    }

    public boolean czyLata() {
        return potrafiLatac;
    }
}
