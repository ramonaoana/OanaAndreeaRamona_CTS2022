package adapter_metrou;

public class ValidatorMetrou implements Subteran {

    @Override
    public void valideazaCalatorie() {
        System.out.println("Am validat bilet metrou");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("Am validat abonament metrou");

    }
}
