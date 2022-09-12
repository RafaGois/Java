package testes.String;

public class cortandoParte {



    public static void main(String[] args) {

    }

    private String corta(String input) {
        String vet [] = input.split("");
        String result = "";
        if (input.length() >= 15) {
            for (int i=0;i< 15;i++) {
                result += vet[i];
            }
            return result;
        } else {
            return input;
        }
    }
}
