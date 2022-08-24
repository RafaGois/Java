package testes.String;

public class TesteCortaString {

    public static void main(String[] args) {
        TesteCortaString call = new TesteCortaString();

        System.out.println(call.cortaDesc("ESTRUTURA PRINCIPAL MODULO I                                                                        "));
    }

    private String cortaDesc(String input) {
        if (input.length() > 20) {
            input = input.trim();
            String vet [] = input.split("");
            String result = "";

            for (int i=0;i< 20;i++) {
                result += vet[i];
            }
            return result.trim() + "...";
        } else {
            return input;
        }
    }

}
