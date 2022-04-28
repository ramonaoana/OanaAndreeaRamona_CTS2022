package FlyWeight_9;

public class Linie implements AutobuzLinie {
    private int nrLinie;
    String primaStatie;
    String ultimaStatie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Linie{");
        sb.append("nrLinie=").append(nrLinie);
        sb.append(", primaStatie='").append(primaStatie).append('\'');
        sb.append(", ultimaStatie='").append(ultimaStatie).append('\'');
        sb.append('}');
        return sb.toString();
    }


    @Override
    public void afiseazaDetaliiAutobuzLinie(Autobuz autobuz) {
        System.out.println("Pe linie "+this.nrLinie +" circula autobuzul " +autobuz.toString());
    }
}
