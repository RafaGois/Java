package testes.data;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RetronaDataFormatada {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.format(formatter));
    }
}
