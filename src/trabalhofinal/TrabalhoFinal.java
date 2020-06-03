package trabalhofinal;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TrabalhoFinal {

    public static void main(String[] args) {
        Carro c1 = new Carro("teste");
        System.out.println(c1);

        Vaga v1 = new Vaga(11, 12);
        System.out.println(v1);

        String strTime = "02/06/2020 20:15:40";
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        try {
            Date d = dateFormat.parse(strTime);
            c1.AdicionarUso(v1.idvaga, d, d);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(c1);
    }
}
