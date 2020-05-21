package trabalhofinal;

public class Carro {

    public String placa;
    public ListaUso paradas;

    public Carro(String placa) {
        this.placa = placa;
        this.paradas = new ListaUso();
    }
}
