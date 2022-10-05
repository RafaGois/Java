package consumer;

import predicate.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Porcentagem {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv",900.00));
        products.add(new Product("Mouse",50.00));
        products.add(new Product("Tablet",350.50));
        products.add(new Product("HD Case",80.90));

        //atualiza o preco de cada elemento da lista
        products.forEach(new AtualizacaoPreco());

        //imprimindo com foreach
        products.forEach(System.out::println);
    }

}
