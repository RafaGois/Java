package testes.data;

import java.time.Instant;

public class InstantTeste {

    public static void main(String[] args) {
        Instant instant = Instant.now();

        //retorna a data e hora atual com fuzo horario
        System.out.println(instant);
    }

}
