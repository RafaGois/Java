package testes.teste;

public class chama {

    public static void main(String[] args) {
        Pessoa call = new Pessoa();

        call.setNome("Jose");
        call.setIdade(50);
        call.setPeso(90);

        System.out.println("Nome: "+ call.getNome() +" tem " + call.getIdade() + " anos e "+ call.getPeso()+ " kgs");
    }

}
