package trabalhofinal;

import java.util.Random;
import java.util.Date;

public class Uso {
    int idUso;
    String placa;
    int idVaga;
    Date horaEntrada;
    Date horaSaida;

    public Uso(){
        this.idUso = 0;
        this.placa = "XXXX";
        this.idVaga = 0;
        this.horaEntrada = new Date();
        this.horaSaida = new Date();
    }

    public Uso(String p, int v, Date entrada, Date saida) {
        this.idUso = Random.class.hashCode();
        this.placa = p;
        this.idVaga = v;
        this.horaEntrada = entrada;
        this.horaSaida = saida;
    }
}
