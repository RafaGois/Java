package testes.matriz;

public class imprimindoX {

    private String matriz [][] = new String[10][10];

    public static void main(String[] args) {
        imprimindoX call = new imprimindoX();

        call.agregaMatriz();
        call.imprimeMatriz();
    }

    public void agregaMatriz () {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i != j) {
                    matriz[i][j] = "-";
                } else {
                    matriz[i][j] = "|";
                }
            }
        }
    }

    public void imprimeMatriz () {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }

}
