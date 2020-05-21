package trabalhofinal;

public class ElementoUso {
    public Uso elemento;
    public ElementoUso prox;

    public ElementoUso(Uso elm) {
        this.elemento = elm;
        this.prox = null;
    }
}