package testes.lista;

import java.util.ArrayList;
import java.util.List;

public class Mains {

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Pessoa p = new Pessoa("Rafael","Fontana");
            pessoas.add(p);

        }
    }
}
