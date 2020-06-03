package trabalhofinal;

class ListaUso {
    ElementoUso primeiro; 
    ElementoUso ultimo; 

    public ListaUso() {
        primeiro = new ElementoUso();
        ultimo = primeiro;
    }

    public ElementoUso adicionaFinal(Uso novo) {
        ElementoUso elm = new ElementoUso(novo);
        ultimo.prox = elm;
        ultimo = elm;
        return ultimo;
    }
}
