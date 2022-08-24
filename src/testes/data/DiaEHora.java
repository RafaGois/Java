package testes.data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DiaEHora {

    public static void main(String[] args) {
        DiaEHora vall = new DiaEHora();
        vall.getDate();
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

}
