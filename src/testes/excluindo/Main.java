package testes.excluindo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main
{
    /*
    ****** OBSERVACOES ******

    * Precisa excluir a primeira linha deste arquivo para rodar no .pat (package ...)
    * é preciso linkar o .bar com o jdk dentro da máquina que vai executar o arquivo
    * Arquivo bat:
    *
        set path="C:\Users\Rafael.Gois\.jdks\corretto-16.0.2\bin";
        javac ClasseApagadora.java
        java ClasseApagadora
        pause

    * Tanto o arquivo .bat, quanto a classe java e o arquivo txt onde são postos os nomes devem estar na mesma pasta


     */


    public static void main(String[] args) {

        Main main = new Main();

        int sucessCount = 0;
        int failCount = 0;

        System.out.println("");

        for (int i = 0; i < main.retoraArr().size(); i++) {

            File file = new File("C:\\Users\\Rafael.Gois\\Pictures\\testeExclui\\"+main.retoraArr().get(i));

            boolean result = file.delete();
            if (result) {
                System.out.println("Arquivo :"+main.retoraArr().get(i)+" apagado com sucesso!");
                sucessCount++;
            }
            else {
                System.out.println("Falha ao apagar arquivo: "+main.retoraArr().get(i));
                failCount++;
            }
        }

        System.out.println("");
        System.out.println("Total de arquivos a serem apagados: " + main.retoraArr().size());
        System.out.println("Total de arquivos apagados com sucesso: " + sucessCount);
        System.out.println("Total de arquivos não apagados: " + failCount);

    }

    public ArrayList<String> retoraArr () {
        File file = new File("C:\\Users\\Rafael.Gois\\Music\\Java\\nome_arquivos_a_excluir.txt");
        Scanner sc = null;

        ArrayList<String> planos = new ArrayList<>();

        if (file.exists()) {
            try {
                sc = new Scanner(file);
                while (sc.hasNext()) {
                    planos.add(sc.nextLine().trim());
                }
            } catch (IOException e) {
                System.out.println("Error: "+e.getMessage());
            }
            finally {
                if (sc != null) {
                    sc.close();
                }
            }
        }
        return planos;
    }
}