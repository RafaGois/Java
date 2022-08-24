package testes.data;

import java.util.Calendar;

public class Calendario {

    public static void main(String[] args) {
        Calendario calendario = new Calendario();
        calendario.getDataFromCalendar();
    }


    private void getDataFromCalendar () {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime().getHours() + ":" + calendar.getTime().getMinutes());
    }
}
