public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Zwierze[] zwierzeta = new Zwierze[3];

        zwierzeta[0] = new Ssak("Simba", 5, "Lew");
        zwierzeta[1] = new Ptak("Orzeł", 3, true);
        zwierzeta[2] = new Gad("Kobra", 2, true);

        for (Zwierze z : zwierzeta) {
            z.wyswietlInformacje();
            System.out.println("---");
        }
    }
}
