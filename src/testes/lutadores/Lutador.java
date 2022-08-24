package testes.lutadores;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double peso;
    private double altura;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, double peso, double altura, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        setPeso(peso);
        this.altura = altura;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }



    public void status () {

        System.out.println("Nome: "+ getNome());
        System.out.println("Nacionalidade "+ getNacionalidade());
        System.out.println("Categoria "+getCategoria());
        System.out.println("Idade "+ getIdade());
        System.out.println("Peso "+ getPeso());
        System.out.println("Altura "+ getAltura());
        System.out.println("Vitorias "+ getVitorias());
        System.out.println("Empates "+getEmpates());
        System.out.println("Derrotas "+getDerrotas());
        System.out.println("---------------------------------------------");
    }

    public void ganharLuta () {
        this.setVitorias(getVitorias() + 1);
    }

    public void perderLuta () {
        this.setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta () {
        this.setEmpates(getEmpates() + 1);
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if ((this.peso < 52.2)) {
            this.categoria = "Inválido";
        } else if(this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
}
