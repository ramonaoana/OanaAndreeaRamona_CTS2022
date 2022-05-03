package memento_main;

import memento_classes.Autobuz;
import memento_classes.ManagerAutobaza;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz("Mercedes", 2009, 10, "Marian",11);
        Autobuz autobuz2=new Autobuz("Audi", 2010, 20, "Ioan",9);

        ManagerAutobaza managerAutobaza=new ManagerAutobaza();
        managerAutobaza.adaugare(autobuz.creeazaMemento());

        autobuz.setNumeSofer("Ioan");
        autobuz.setConsumMediu(14);

        managerAutobaza.adaugare(autobuz.creeazaMemento());
        System.out.println(autobuz.toString());
        autobuz.setNumeSofer("Adrian");
        System.out.println(autobuz.toString());

        autobuz.restaurare(managerAutobaza.getMemento(0));
        System.out.println(autobuz.toString());
    }
}
