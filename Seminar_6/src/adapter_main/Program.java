package adapter_main;

import adapter_autobuz.AdapterValidator;
import adapter_autobuz.AdaptorValidatorObiecte;
import adapter_autobuz.Autobuz;
import adapter_metrou.ValidatorMetrou;

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz();
        ValidatorMetrou metrou=new ValidatorMetrou();

//        adapter obiecte
        AdaptorValidatorObiecte adapterObiecte=new AdaptorValidatorObiecte(metrou);
        adapterObiecte.valideazaBilet();
        adapterObiecte.valideazaAbonament();

        //        adapter clase
        AdapterValidator adapter=new AdapterValidator();
        adapter.valideazaBilet();
        adapter.valideazaAbonament();




    }
}
