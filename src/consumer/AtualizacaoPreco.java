package consumer;

import predicate.Product;

import java.util.function.Consumer;

public class AtualizacaoPreco implements Consumer<Product> {
    @Override
    public void accept(Product p) {
        p.setPreco(p.getPreco() * 1.1);
    }
}
