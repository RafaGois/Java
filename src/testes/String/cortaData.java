package testes.String;

public class cortaData {

    public static void main(String[] args) {
        String input = "12:00:00";

        String [] inputSeparado = input.split("");
        String output = "";

        for(int i = 0; i < 5; i++) {
            output += inputSeparado[i];
        }
        System.out.println(output);
    }

}
