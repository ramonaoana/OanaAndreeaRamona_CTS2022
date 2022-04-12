package facade_main;

import facade_classes.Autobuz;
import facade_classes.Facade;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz();
        Facade.deschideUsi(autobuz);
        Facade.lasaLiber(autobuz);

    }
}
