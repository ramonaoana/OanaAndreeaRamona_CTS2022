package strategy.classes;

public class CardVISA implements ModPlata{
    @Override
    public void plateste(float pret) {
        System.out.println("Am platit " +pret+ " lei cu cardul visa");
    }
}
