package testes.array;

public class separaString {

    public static void main(String[] args) {
        System.out.println(separador("000000000000323140"));
    }

    private static String separador (String input) {
        String [] vetorInput = input.split("");
        String parteInput = "";

        for (int i = 12; i < 18; i++) {
            parteInput += vetorInput[i];
        }

        return parteInput;
    }

}
