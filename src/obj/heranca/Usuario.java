package obj.heranca;

public class Usuario {

    public static void main(String[] args) {
        Programador programador = new Programador();

        programador.setNome("José");
        System.out.println(programador.getNome());


        Agricultor agricultor = new Agricultor();
        agricultor.fazerAniversario();

    }

}
