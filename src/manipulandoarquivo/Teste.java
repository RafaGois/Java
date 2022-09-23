package manipulandoarquivo;

import java.io.File;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a pasta ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File [] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files ) {
            System.out.println(file);
        }

        //criado subpasta
        boolean sucess = new File(strPath + "\\subpasta").mkdir();
        System.out.println("Diretorio criado com sucesso "+ sucess);

        sc.close();
    }

}
