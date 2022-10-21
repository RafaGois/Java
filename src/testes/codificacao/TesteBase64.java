package testes.codificacao;

import java.util.Base64;

public class TesteBase64 {

    public static void main(String[] args) {

        String nome = "Rafael Fontana Becker Gois";

        String codigo = Base64.getEncoder().encodeToString(nome.getBytes());

        System.out.println("Codificado -");
        System.out.println(codigo);

        System.out.println("Decodificado");

        byte [] decodificado = Base64.getDecoder().decode(codigo.getBytes());
        String txtDecodificado = new String(decodificado);
        System.out.println(txtDecodificado);
    }
}
