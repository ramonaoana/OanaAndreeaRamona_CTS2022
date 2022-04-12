package proxy.classes;

public class AutobuzNoapte implements MijlocTransport{
    Autobuz autobuz;

    public AutobuzNoapte(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opreste() {
        if(autobuz.getNrCalatori()>=1){
            autobuz.opreste();
        } else {
            System.out.println("Autobuzul se intoarce in autogara");
        }
    }
}
