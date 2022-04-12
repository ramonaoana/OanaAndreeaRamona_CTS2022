package adapter_autobuz;

public class Autobuz implements ValidatorAutobuz{
    @Override
    public void valideazaBilet() {
        System.out.println("Am validat bilet autobuz");

    }

    @Override
    public void valideazaAbonament() {
        System.out.println("Am validat abonament autobuz");
    }
}
