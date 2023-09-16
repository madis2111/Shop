import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Product tomatoes = new Vegetable("Помидоры", 150, 5);
        Product cucumbers = new Product("Огурцы", 100, 4);
        Product potatoes = new Product("Картошка", 50, 5);
        store.addProducts(tomatoes,cucumbers,potatoes);


        User me = new User(1000);

        Scanner s = new Scanner(System.in);
        System.out.println("Добро пожаловать!");

        vneshniyTsikl:
        while (true) {
            System.out.println("Ваш баланс: " + me.getMoney());
            System.out.println("Список продуктов:");
            store.printProducts();
            System.out.println("Что вы хотите купить? Введите id продукты");
            System.out.println("Или введите 0 для совершения покупки");
            int id = s.nextInt();       // todo invalid input exception
            System.out.println("Введите количество");
            int amount = s.nextInt();


            switch () {
                case 0:
                    break vneshniyTsikl;
                case 1:
                    me.addToCart()      // todo
                    // todo check if store contains product
                case 2:
                case 3:
            }

            System.out.println(unknownProduct + " добавлен в корзину");
            System.out.println();
        }
        // после выбора, покуаем

        me.buy();
        System.out.println("До скорых встреч!");
        // todo КАКОЕ СООБЩЕНИЕ ПОСЛЕ ПОКУПКИ?

    }
}