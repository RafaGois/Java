package testes.data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DiaAtual {

    public static void main(String[] args) {
        Date x = new Date();
        x.getDate();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(dateFormat.format(x));
    }

}
