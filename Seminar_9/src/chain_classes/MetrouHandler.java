package chain_classes;

public class MetrouHandler extends Handler{
    public MetrouHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareRecomandare(int distanta) {
        if(distanta<getLimita()){
            System.out.println("Iti recomand sa iei Metroul pentru distanta de "+distanta+" m.");
        } else {
            handler.afisareRecomandare(distanta);
        }
    }
}
