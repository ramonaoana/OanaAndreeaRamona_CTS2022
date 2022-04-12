package facade_classes;

public class Facade {
    public static void deschideUsi(Autobuz autobuz){
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
        autobuz.lasaPeLiberUsaFata();
        autobuz.lasaPeLiberUsaMijloc();
        autobuz.lasaPeLiberUsaSpate();
    }

    public static void lasaLiber(Autobuz autobuz){
        autobuz.lasaPeLiberUsaSpate();
        autobuz.lasaPeLiberUsaMijloc();
        autobuz.lasaPeLiberUsaSpate();
    }


}
