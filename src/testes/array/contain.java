package testes.array;

import java.util.ArrayList;

public class contain {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("iin");
        lista.add("minha");
        lista.add("vuaida");
        lista.add("Gois");

        if (lista.contains("Gois")) {
            System.out.println("Elemento encontrado");
        } else {
            System.out.println("Elemento nao encontrado");
        }
    }
}
