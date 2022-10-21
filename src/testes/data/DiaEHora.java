package testes.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DiaEHora {

    public static void main(String[] args) {
        DiaEHora vall = new DiaEHora();
        vall.getDate();

        vall.getDateForomServer();
    }

    public void getDate () {
        Date x = new Date();
        x.getDate();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        if (x.getHours() > 0 && x.getHours() < 12) {
            System.out.println("eh de manha - "+ dateFormat.format(x));
        } else if(x.getHours() >=12 && x.getHours() < 18) {
            System.out.println("eh de tarde - "+ dateFormat.format(x));
        } else if(x.getHours() >= 18) {
            System.out.println("eh de noite - "+ dateFormat.format(x));
        }
    }

    public void getDateForomServer () {

        String horaFromServer = "11:30:00";

        try {
            Date date = new SimpleDateFormat("hh:mm:ss").parse(horaFromServer);
            System.out.println(date);

            if (date.getHours() < 12) {
                System.out.println("é de manhã");
            }

        } catch (ParseException p) {
            System.out.println(p.getErrorOffset());
        }
    }
}
