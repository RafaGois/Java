package testes.hora.turno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Turno {

    private Date it1;
    private Date ft1;
    private Date it2;
    private Date ft2;

    public Turno(String it1, String ft1, String it2, String ft2) {
        this.it1 = stringToDate(it1);
        this.ft1 = stringToDate(ft1);
        this.it2 = stringToDate(it2);
        this.ft2 = stringToDate(ft2);
    }

    public Date getIt1() {
        return it1;
    }

    public Date getFt1() {
        return ft1;
    }

    public Date getIt2() {
        return it2;
    }

    public Date getFt2() {
        return ft2;
    }

    public static Date stringToDate (String input) {

        Date date = null;

        try {
            date = new SimpleDateFormat("HH:mm:ss").parse(input);

        } catch (ParseException p) {
            System.out.println(p.getErrorOffset());
        }
        return date;
    }
}

