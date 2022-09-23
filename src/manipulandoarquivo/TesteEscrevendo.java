package manipulandoarquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrevendo {

    public static void main(String[] args) {
        String [] lines = new String[] {"Olá","Meu","Nueme","eh","Rafael"};

        String path = "C:\\Users\\Rafael.Gois\\Documents\\testeJAVA.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
