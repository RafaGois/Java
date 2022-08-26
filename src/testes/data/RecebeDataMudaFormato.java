package testes.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class RecebeDataMudaFormato {

    public static void main(String[] args) {

        //fazer logica que recebe uma hora do banco de dados no seguinte formato
        // yyyy-MM-dd hh:mm:ss.sss
        //converter no app mostra mendes para
        // dd-MM-yyyy hh:mm:ss.sss
        //forma de melhor visualizacao para o usuario
        //obs, a hora é retornada do banco como String

        RecebeDataMudaFormato call = new RecebeDataMudaFormato();
        call.retornaHoraFormatada();
    }

    private void retornaHoraFormatada () {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse("23/11/2015", formato);
        System.out.println(data);
    }

}
