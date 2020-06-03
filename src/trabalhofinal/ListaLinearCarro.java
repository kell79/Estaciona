package trabalhofinal;

public class ListaLinearCarro {

    private ElementoCarro primeiro;
    private ElementoCarro ultimo;

    public ListaLinearCarro() {
        primeiro = new ElementoCarro();
        ultimo = primeiro;
    }

    public Boolean vazia() {
        if (this.primeiro == this.ultimo)
            return true;
        else
            return false;
    }

    public void inserir(ElementoCarro produtoNovo) {
        this.ultimo.prox = produtoNovo;
        this.ultimo = produtoNovo;
    }

    public ElementoCarro pesquisar(String placa) {
        int comparacoes = 0;

        if (this.vazia())
            return null;
        else {
            ElementoCarro aux = this.primeiro.prox;

            while (aux != null) {
                comparacoes++;

                if (aux.elemento.placa == placa) {
                    System.out.println("Número de comparações realizadas pelo método de pesquisa: " + comparacoes);
                    return aux;
                } else
                    aux = aux.prox;
            }
            System.out.println("Número de comparações realizadas pelo método de pesquisa: " + comparacoes);
            return aux;
        }
    }

    public void imprimir() {
        if (this.vazia())
            System.out.println("A lista está vazia.");
        else {
            ElementoCarro aux = this.primeiro.prox;
            while (aux != null) {
                //System.out.println("Nome do produto: " + aux.nome + " - Código de barras do produto: "
                        //+ aux.codigoBarras + " - Preço unitário do produto: " + aux.precoUnitario);
                aux = aux.prox;
            }
        }
    }
}