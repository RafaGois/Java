package obj.heranca;

public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniversario() {
        System.out.println("Feliz aniversuário");
        System.out.println("Você está de parabuáins");
        System.out.println("Ain minha vuaida");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


}
