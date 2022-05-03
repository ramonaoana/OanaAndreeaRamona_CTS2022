package memento_classes;

public class Autobuz {
    String model;
    int anFabricatie;
    int nrLocuri;
    String numeSofer;
    int consumMediu;

    public Autobuz(String model, int anFabricatie, int nrLocuri, String numeSofer, int consumMediu) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
    }


    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setConsumMediu(int consumMediu) {
        this.consumMediu = consumMediu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }

    public MementoAutobuz creeazaMemento()
    {
        return new MementoAutobuz(numeSofer,consumMediu);
    }

    public void restaurare(MementoAutobuz mementoAutobuz){
        this.numeSofer=mementoAutobuz.numeSofer;
        this.consumMediu=mementoAutobuz.consumMediu;
    }
}
