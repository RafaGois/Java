package manipulandoarquivo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteLeitor {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Rafael.Gois\\Documents\\testeJAVA.txt");
        Scanner sc = null;

        if (file.exists()) {
            try {
                sc = new Scanner(file);
                while (sc.hasNext()) {
                    System.out.println(sc.nextLine());
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
    }
}
