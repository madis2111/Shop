import java.util.HashSet;
import java.util.Set;

public class Store {
    private Set<Product> productsSet;       // todo hashmap for id?

    public Store() {

        productsSet = new HashSet<>();
    }

    public void addProducts(Product... products) {
        for (Product product : products) {
            productsSet.add(product);
        }
    }

    public void printProducts() {
        int i = 1;
        for (Product product : productsSet) {
            System.out.println(i + ". " + product.getName());
            i++;
        }
    }

//    public void removeProduct(Product product) {
//        productsSet.remove(product);
//    }



}
