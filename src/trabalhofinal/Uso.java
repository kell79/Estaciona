package trabalhofinal;

import java.util.Random;
import java.util.Timer;

public class Uso {

    int idUso;
    Carro carro;
    Vaga vaga;
    Timer horaEntrada;
    Timer horaSaida;

    public Uso(Carro c, Vaga v, Timer entrada, Timer saida) {

        this.idUso = Random.class.hashCode();
        this.carro = c;
        this.vaga = v;
        this.horaEntrada = entrada;
        this.horaSaida = saida;
    }
}
