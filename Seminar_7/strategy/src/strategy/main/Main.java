package strategy.main;

import strategy.classes.CardVISA;
import strategy.classes.Validator;

public class Main {
    public static void main(String[] args) {
        Validator validator=new Validator(3);
        validator.platesteCalatoria();
        validator.setModPlata(new CardVISA());
        validator.platesteCalatoria();

    }
}
