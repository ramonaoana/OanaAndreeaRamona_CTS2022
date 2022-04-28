package Observer_11;

public class Autobuz  extends Subiect{
    private int nrLinie;

    public Autobuz(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    @Override
    public void anuntaCalatori() {
        for(Observer observer:calatori){
            observer.primesteMesaj("Autobuzul "+nrLinie+" a plecat de la capat de linie");
        }
    }
}
