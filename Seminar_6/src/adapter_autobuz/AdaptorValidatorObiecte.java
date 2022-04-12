package adapter_autobuz;

import adapter_metrou.ValidatorMetrou;

public class AdaptorValidatorObiecte implements ValidatorAutobuz{
    ValidatorMetrou validatorMetrou;

    public AdaptorValidatorObiecte(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void valideazaBilet() {
        validatorMetrou.valideazaCalatorie();

    }

    @Override
    public void valideazaAbonament() {
        validatorMetrou.valideazaAbonament();

    }
}
