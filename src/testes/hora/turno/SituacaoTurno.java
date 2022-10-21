package testes.hora.turno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class SituacaoTurno {

    private static long minExtras = 0;

    public static void main(String[] args) {
        SituacaoTurno call = new SituacaoTurno();

        String horas [] = {"06:30:00","07:40:00","11:50:00","11:50:00","12:23:00","15:10:00","17:01:00","17:00:00","05:30:00"};

        for (String hora : horas) {
            if (call.getSituacao(Turno.stringToDate(hora)).equals("Hora Extra")) {
                System.out.println(hora + " - " + call.getSituacao(Turno.stringToDate(hora)) +" - " + minExtras);
            } else {
                System.out.println(hora + " - " + call.getSituacao(Turno.stringToDate(hora)));
            }
        }
    }

    public String getSituacao (Date horaAtual) {

        Turno turno = new Turno("07:12:00","11:30:00","12:30:00", "17:00:00");
        minExtras = 0;

        if (horaAtual.before(turno.getIt2())) {//turno 1
            if (horaAtual.before(turno.getIt1())) { //se antes do inicio manha

                long elapsedms = horaAtual.getTime() - turno.getIt1().getTime();
                long diff = TimeUnit.MINUTES.convert(elapsedms, TimeUnit.MILLISECONDS);
                minExtras = diff * - 1;
                return "Hora Extra";
            } else if (horaAtual.after(turno.getFt1())) { // se depois do fim manha

                long elapsedms = horaAtual.getTime() - turno.getFt1().getTime();
                long diff = TimeUnit.MINUTES.convert(elapsedms, TimeUnit.MILLISECONDS);
                minExtras = diff;

                return "Hora Extra";
            } else {
                return "Hora Normal";
            }
        } else {//turno 2

            if (horaAtual.before(turno.getIt2()) ) { //se antes do inicio tarde

                long elapsedms = horaAtual.getTime() - turno.getIt2().getTime();
                long diff = TimeUnit.MINUTES.convert(elapsedms, TimeUnit.MILLISECONDS);
                minExtras = diff;

                return "Hora Extra";
            } else if (horaAtual.after(turno.getFt2())) { // se depois do fim tarde

                long elapsedms = horaAtual.getTime() - turno.getFt2().getTime();
                long diff = TimeUnit.MINUTES.convert(elapsedms, TimeUnit.MILLISECONDS);
                minExtras = diff;

                return "Hora Extra";
            } else {
                return "Hora Normal";
            }
        }
    }
}
