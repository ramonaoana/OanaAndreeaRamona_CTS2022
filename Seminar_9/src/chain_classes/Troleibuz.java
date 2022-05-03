package chain_classes;

public class Troleibuz extends Handler{
    public Troleibuz(int limita) {
        super(limita);
    }

    @Override
    public void afisareRecomandare(int distanta) {
        if(distanta<getLimita()){
            System.out.println("Iti recomand sa iei Troleibuzul pentru distanta de "+distanta+" m.");
        } else {
            handler.afisareRecomandare(distanta);
        }
    }
}
