package testes.data;

import java.time.LocalDateTime;

public class RecebeDataMudaFormato {

    public static void main(String[] args) {
        LocalDateTime timeHour = LocalDateTime.parse("2022-08-18T01:30:26");

        System.out.println(timeHour);
        System.out.println(timeHour.getDayOfMonth());

        //fazer logica que recebe uma hora do banco de dados no seguinte formato
        // yyyy-MM-dd hh:mm:ss.sss
        //converter no app mostra mendes para
        // dd-MM-yyyy hh:mm:ss.sss
        //forma de melhor visualizacao para o usuario
        //obs, a hora é retornada do banco como String
    }
}
