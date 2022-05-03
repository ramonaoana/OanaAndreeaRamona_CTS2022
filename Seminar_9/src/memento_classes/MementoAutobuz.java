package memento_classes;

public class MementoAutobuz {
    String numeSofer;
    int consumMediu;

    public MementoAutobuz(String numeSofer, int consumMediu) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
    }

    public int getConsumMediu() {
        return consumMediu;
    }

    public String getNumeSofer() {
        return numeSofer;
    }
}


