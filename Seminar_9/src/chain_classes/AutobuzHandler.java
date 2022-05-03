package chain_classes;

public class AutobuzHandler extends Handler{

    public AutobuzHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareRecomandare(int distanta) {
        if(distanta<getLimita()){
            System.out.println("Iti recomand sa iei Autobuzul pentru distanta de "+distanta+" m.");
        } else {
            handler.afisareRecomandare(distanta);
        }


    }
}
