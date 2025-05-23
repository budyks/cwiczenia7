public class Ssak extends Zwierze {
     private String gatunek;

    public Ssak(String nazwa, int wiek, String gatunek) {
        super(nazwa, wiek);
        this.gatunek = gatunek;
    }
    public String getGatunek(){
        return gatunek;
    }



    @Override
    public String wydajDzwiek() {
        return gatunek.equals("Lew") ? "Ryczy" : "odgłos ssaka";
    }

    @Override
    public String poruszajSie() {
        return "skrada się";
    }

    public boolean czyMiesozereny(){
        return gatunek.equals("lew");
    }
}
