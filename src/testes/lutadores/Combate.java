package testes.lutadores;

public class Combate {

    //todo implementar isso na lista de ofs
    public static void main(String[] args) {

        Lutador objLutadores [] = new Lutador[4];

        objLutadores[0] = new Lutador("Guerreuro","Cubano",25,100.5,1.90,0,4,1);
        objLutadores[1] = new Lutador("Ports","Holandes",25,60.7,1.87,2,3,2);
        objLutadores[2] = new Lutador("Alexandre","Paraguaio",24,60.7,1.80,1,1,4);
        objLutadores[3] = new Lutador("Rafael","Brasileiro",20,80,1.75,5,1,0);

        objLutadores[0].status();

    }

}
