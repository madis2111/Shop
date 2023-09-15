import java.util.HashMap;

public class User {

    private HashMap<Product, Integer> cart;
    private int money;

    public User(int money) {
        cart = new HashMap<>();
        this.money = money;
    }

    public void addToCart(Product product, int amount) {        // todo negative values
        cart.put(product, amount);      // TODO
        money -= amount*product.getPrice();     // todo check negative
    }

    public void removeFromCart(Product product){

        cart.remove(product);
    }

    public void changeQuantity(Product product, int amount){

        cart.replace(product, amount);
    }

    public void buy() {
        int total = 0;
        for (Product product : cart.keySet()) {
            total += product.getPrice() * cart.get(product);       // TODO product.equals7
        }
        money -= total;     // TODO if not enough money
    }
}