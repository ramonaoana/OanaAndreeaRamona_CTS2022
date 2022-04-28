package FlyWeight_9;

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz1=new Autobuz("Mercedes",2007,60);
        Autobuz autobuz2=new Autobuz("BMW",2015,30);
        Autobuz autobuz3=new Autobuz("SKODA",2019,40);
        Autobuz autobuz4=new Autobuz("AUDI",2021,20);

        FabricaLinie fabricaLinie=new FabricaLinie();
        fabricaLinie.getLinie(133).afiseazaDetaliiAutobuzLinie(autobuz1);
        fabricaLinie.getLinie(133).afiseazaDetaliiAutobuzLinie(autobuz3);
        fabricaLinie.getLinie(137).afiseazaDetaliiAutobuzLinie(autobuz2);
        fabricaLinie.getLinie(137).afiseazaDetaliiAutobuzLinie(autobuz4);
    }
}
