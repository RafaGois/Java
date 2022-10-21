package testes.hora.localtime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TesteLocalTime {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:mm:ss");
        LocalTime localTime = LocalTime.now();

        LocalTime horaAtual = LocalTime.parse("08:30:00");

        LocalTime horaInicioT1 = LocalTime.parse("07:30:00");
        LocalTime horaFimT1 = LocalTime.parse("11:30:00");

        if (horaAtual.isBefore(horaInicioT1) || horaAtual.isAfter(horaFimT1)) {
            System.out.println("Hora extra");
        } else {
            System.out.println("Hora normal");
        }
    }
}
