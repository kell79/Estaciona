package trabalhofinal;

public class ElementoCarro {
    public Carro elemento;
    public ElementoCarro prox;

    public ElementoCarro(){
        this.elemento = new Carro();
        this.prox = null;
    }

    public ElementoCarro(Carro elm) {
        this.elemento = elm;
        this.prox = null;
    }
    
}