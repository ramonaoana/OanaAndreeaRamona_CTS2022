package adapter_autobuz;

import adapter_metrou.ValidatorMetrou;

public class AdapterValidator extends ValidatorMetrou implements ValidatorAutobuz{

    @Override
    public void valideazaBilet() {
        super.valideazaCalatorie();
    }
}
