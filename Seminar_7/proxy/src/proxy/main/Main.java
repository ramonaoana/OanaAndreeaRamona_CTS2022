package proxy.main;

import proxy.classes.Autobuz;
import proxy.classes.AutobuzNoapte;
import proxy.classes.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz("Marian",21,0);
//        autobuz.opreste();

        MijlocTransport autobuzNoapte=new AutobuzNoapte(autobuz);
        autobuzNoapte.opreste();

    }
}
