public class Gad extends Zwierze {
    private boolean jadowity;



    public Gad ( String nazwa, int wiek, boolean jadowity){
        super(nazwa, wiek);
        this.jadowity = jadowity;
    }

    @Override
    public String wydajDzwiek() {
        return "syczy ";
    }

    @Override
    public String poruszajSie() {
        return "Pełza ";
    }
    public boolean czJadowity(){
        return jadowity;
    }

}
