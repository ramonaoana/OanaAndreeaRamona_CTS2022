package strategy.classes;

public class CardSTB implements ModPlata{
    @Override
    public void plateste(float pret) {
        System.out.println("Am platit " +pret+ " lei cu cardul stb");
    }
}
