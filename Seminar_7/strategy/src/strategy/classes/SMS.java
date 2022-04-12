package strategy.classes;

public class SMS implements ModPlata{
    @Override
    public void plateste(float pret) {
        System.out.println("Am platit " +pret+ " lei prin sms");
    }
}
