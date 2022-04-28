package Observer_11;

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz(116);

        Calator calator1=new Calator("Marian");
        Calator calator2=new Calator("Maria");
        Calator calator3=new Calator("Ioana");
        Calator calator4=new Calator("Adrian");
        Calator calator5=new Calator("Nicu");

        autobuz.adaugaCalator(calator1);
        autobuz.adaugaCalator(calator2);
        autobuz.adaugaCalator(calator3);
        autobuz.adaugaCalator(calator4);
        autobuz.adaugaCalator(calator5);
        autobuz.stergeCalator(calator2);

        autobuz.anuntaCalatori();
    }
}
