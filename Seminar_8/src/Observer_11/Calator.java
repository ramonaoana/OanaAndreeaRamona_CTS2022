package Observer_11;

public class Calator implements Observer{
    String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
          System.out.println("Clientul "+nume+" a primit mesajul: "+mesaj);
    }
}
