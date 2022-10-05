package predicate;

import java.util.ArrayList;
import java.util.List;

public class TesteList {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv",900.00));
        products.add(new Product("Mouse",50.00));
        products.add(new Product("Tablet",350.50));
        products.add(new Product("HD Case",80.90));

        //remove da lista com uma condicao
        //vai remover p(elemento da list) se ele tiver o atributo preco maior q 100
        products.removeIf(p -> p.getPreco() >= 100);

        for (Product p : products) {
            System.out.println(p.getNome()+" - "+p.getPreco());
        }
    }
}
