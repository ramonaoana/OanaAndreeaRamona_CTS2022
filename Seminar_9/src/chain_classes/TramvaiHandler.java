package chain_classes;

public class TramvaiHandler extends Handler {
    public TramvaiHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareRecomandare(int distanta) {
        if(distanta<getLimita()){
            System.out.println("Iti recomand sa iei Tramvaiul pentru distanta de "+distanta+" m.");
        } else {
            handler.afisareRecomandare(distanta);
        }
    }
}
