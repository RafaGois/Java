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

        for (int i = 0; i < main.retoraArr().size(); i++) {

            File file = new File("C:\\Users\\Rafael.Gois\\Pictures\\testeExclui\\"+main.retoraArr().get(i));

            boolean result = file.delete();
            if (result) {
                System.out.println("File "+main.retoraArr().get(i)+" is successfully deleted.");
            }
            else {
                System.out.println("File "+main.retoraArr().get(i)+" deletion failed.");
            }
        }
    }

    public ArrayList<String> retoraArr () {
        File file = new File("C:\\Users\\Rafael.Gois\\Pictures\\nome_arquivos_a_excluir.txt");
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