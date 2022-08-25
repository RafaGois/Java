package testes.data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDate {

    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy hh:mm.sss");

        System.out.println(simpleDateFormat.format(date));
    }

}
