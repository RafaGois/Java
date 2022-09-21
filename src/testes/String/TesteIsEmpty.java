package testes.String;

public class TesteIsEmpty {

    public static void main(String[] args) {
        String nome = "";
        String sobrenome;

        if (nome.isEmpty()) {
            System.out.println("Var nome eh vazia -> isEmpty()");
        }

        if (nome.isBlank()) {
            System.out.println("Var nome eh vazia -> isBlank()");
        }
    }
}
