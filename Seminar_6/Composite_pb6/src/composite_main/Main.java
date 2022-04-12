package composite_main;

import composite_classes.Autobuz;
import composite_classes.Flota;
import composite_classes.Nod;

public class Main {
    public static void main(String[] args) throws Exception {
        Autobuz autobuz1=new Autobuz("mercedes","a1",12);
        Autobuz autobuz2=new Autobuz("mercedes","a53",23);
        Autobuz autobuz3=new Autobuz("mercedes","a3456",24);
        Autobuz autobuz4=new Autobuz("mercedes","7654",43);
        Autobuz autobuz5=new Autobuz("mercedes","56",20);
        Autobuz autobuz6=new Autobuz("mercedes","875",11);

        Nod flota=new Flota("F1");
        Nod flota2=new Flota("F2");
        Nod flota3=new Flota("F3");

        Nod flotaGenerala=new Flota("FLOTA GENERALA");

        try {
            flota.adauga(autobuz1);
            flota.adauga(autobuz2);

            flota2.adauga(autobuz3);
            flota2.adauga(autobuz4);

            flota3.adauga(autobuz5);
            flota3.adauga(autobuz6);

            flotaGenerala.adauga(flota);
            flotaGenerala.adauga(flota2);
            flotaGenerala.adauga(flota3);

        } catch (Exception exception) {
            exception.printStackTrace();
        }

        flota.afiseazaDescriere();

        flota2.sterge(autobuz3);
        flota2.afiseazaDescriere();

        flotaGenerala.afiseazaDescriere();
        System.out.println("SUMA GARANTIE FLOTA GENERALA");
        System.out.println(flotaGenerala.calculeazaSumaGarantie(2));

        System.out.println("SUMA GARANTIE FLOTA MICA");
        System.out.println(flota.calculeazaSumaGarantie(2));

    }
}
