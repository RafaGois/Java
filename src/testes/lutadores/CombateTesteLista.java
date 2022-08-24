package testes.lutadores;

public class CombateTesteLista {

    private String nomes[] = {"Guerreiro","Ports","Alexandre","Rafael"};
    private String nacionalidades [] = {"Cubano","Holandes","Paraguaio","Brasileiro"};
    private int idades [] = {25,25,24,20};
    private double pesos [] = {100.5,60.7,90.2,80};
    private double alturas [] = {1.90,1.85,1.80,1.75};
    private int vitorias [] = {0,2,1,5};
    private int derrotas [] = {4,3,1,1};
    private int empates [] = {1,2,4,0};

    //todo implementar isso na lista de ofs
    public static void main(String[] args) {

        CombateTesteLista call = new CombateTesteLista();
        call.metodoAtribuiValoresEmVetorObjetos();
    }

    public void metodoAtribuiValoresEmVetorObjetos () {
        Lutador objLutadores [] = new Lutador[4];


        for (int i = 0; i < objLutadores.length; i++) {
            objLutadores[i] = new Lutador(this.nomes[i],this.nacionalidades[i],this.idades[i],this.pesos[i],this.alturas[i],this.vitorias[i],this.derrotas[i],this.empates[i]);
        }

        objLutadores[0].ganharLuta();
        objLutadores[0].ganharLuta();
        objLutadores[0].ganharLuta();

        for (int i = 0; i < objLutadores.length; i++) {
            objLutadores[i].status();
        }
    }

}
