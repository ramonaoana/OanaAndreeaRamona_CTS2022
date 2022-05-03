package memento_classes;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobaza {
    List<MementoAutobuz> listaMemento;

    public ManagerAutobaza() {
        this.listaMemento = new ArrayList<>();
    }

    public void adaugare(MementoAutobuz mementoAutobuz){
        listaMemento.add(mementoAutobuz);
    }

    public MementoAutobuz getMemento(int pozitie){
        return listaMemento.get(pozitie);
    }


}
