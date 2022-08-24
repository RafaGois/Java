package obj.produto;

import obj.produto.entidades.Produto;

import java.util.Scanner;

public class CallProduto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeProduto;
        double precoProduto;
        int quantidadeProduto;

        System.out.print("Informe o nome do produto: ");
        nomeProduto = scanner.nextLine();

        System.out.print("Informe o valor do produto: ");
        precoProduto = scanner.nextDouble();

        System.out.print("Informe a quantidade do produto: ");
        quantidadeProduto = scanner.nextInt();

        Produto produto = new Produto(nomeProduto,precoProduto,quantidadeProduto);

        produto.status();

        System.out.println("Informe um numero de quantidade para ser adicionado: ");
        produto.addProducts(scanner.nextInt());
        produto.status();

        System.out.print("Informe um numero de quantidade para ser removido: ");
        produto.removeProdutos(scanner.nextInt());
        produto.status();
    }
}
