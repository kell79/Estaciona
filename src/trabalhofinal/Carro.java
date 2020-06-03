package trabalhofinal;

import java.util.Date;

public class Carro {

    public String placa;
    public ListaUso paradas;

    public Carro(){
        this.placa = "SENTINELA";
        this.paradas = new ListaUso();
    }

    public Carro(String placa) {
        this.placa = placa;
        this.paradas = new ListaUso();
    }

    public Uso AdicionarUso(int idVaga, Date horaEntrada, Date HoraSaida){
        Uso uso = new Uso(this.placa, idVaga, horaEntrada, HoraSaida);
        ElementoUso inserido = this.paradas.adicionaFinal(uso);
        return inserido.elemento;
    }
}
