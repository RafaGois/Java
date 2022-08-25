package testes.data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RetronaDataFormatada {

    public static void main(String[] args) {
        //esta opcão só é disponível no android a partir da api 26
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.format(formatter));
    }
}
