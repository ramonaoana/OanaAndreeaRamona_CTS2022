package chain_classes;

public abstract class Handler {
    protected Handler handler;
    protected int limita;

    public Handler(Handler handler, int limita) {
        this.handler = handler;
        this.limita = limita;
    }

    public Handler(int limita) {
        handler=null;
        this.limita = limita;
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public int getLimita() {
        return limita;
    }

    public void setLimita(int limita) {
        this.limita = limita;
    }

    public abstract void afisareRecomandare(int distanta);
}
