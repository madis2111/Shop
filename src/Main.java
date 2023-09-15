import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Product tomatoes = new Product("Помидоры", 150, 5);
        Product cucumbers = new Product("Огурцы", 100, 4);
        Product potatoes = new Product("Картошка", 50, 5);
        store.addProducts(tomatoes,cucumbers,potatoes);


        Scanner s = new Scanner(System.in);
        System.out.println("Добро пожаловать! Вот список продуктов:");
        store.printProducts();
        System.out.println("Что вы хотите купить? Введите id");
        int input = s.nextInt();


        User me = new User(1000);
        me.addToCart(tomatoes,2);                  // todo check if store contains product
        me.addToCart(cucumbers,3);

        // после выбора, покуаем

        me.buy();
        // todo КАКОЕ СООБЩЕНИЕ ПОСЛЕ ПОКУПКИ?

    }
}