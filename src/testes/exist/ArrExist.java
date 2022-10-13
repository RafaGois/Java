package testes.exist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrExist {

    private static String[] maquinasArr = {"Pama","Hass","D840","Zocca","Nardini","Corte Laser"};

    private static String maquinasFromServer = "Zocca;Hass;Corte Laser";

    public static void main(String[] args) {
        trataMaquinasFromServer(maquinasFromServer);
    }

    private static ArrayList<Integer> trataMaquinasFromServer (String input) {
        String [] maquinas = input.split(";");
        System.out.println(Arrays.toString(maquinas));

        ArrayList<Integer> vet = new ArrayList<Integer>();

        for (int i = 0; i < maquinasArr.length; i++) {
            for (int j = 0; j < maquinas.length; j++) {
                if (maquinas[j].equals(maquinasArr[i])) {
                    vet.add(i);
                }
            }
        }
        return vet;
    }
}
