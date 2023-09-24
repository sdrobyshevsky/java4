// Домашнее задание на закрепление:
// 1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
// 2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
// 3)Создать класс Basket, содержащий массив купленных товаров.
// 4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
// 5)Вывести на консоль каталог продуктов. (все продукты магазина)
// 6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)
// Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

public class Main
{
    public static void main(String[] args) 
    {
        Product teddy = new Product("teddy", 34.99, 5.6);
        Product barbie = new Product("barbie", 23.99, 7.4);
        Category toys = new Category("toys", new Product[]
                {new Product("teddy", 34.99, 5.6), new Product("barbie", 23.99, 7.4)}); 

        Category furniture = new Category("furniture", new Product[]
                {new Product("chair", 345, 7.5), new Product("couch", 678, 4.5)});

        Category clothes = new Category("clothes", new Product[]
                {new Product("sweater", 45, 6.7), new Product("jeans", 67, 7.4)});
                
        User user1 = new User("user1", "24643", new Basket(10));
        User user2 = new User("user2", "12345", new Basket(10));
       
        System.out.println("-----------------------------------");
       
        Category.displayProductsByCategory(toys);
        Category.displayProductsByCategory(furniture);
        Category.displayProductsByCategory(clothes);
        System.out.println("-----------------------------------");
       
        String[] categories = {toys.getName(), furniture.getName(), clothes.getName()};
        Category.displayCategories(categories);
        System.out.println("-----------------------------------");

        user1.basket.addProductToBasket(barbie);
        user2.basket.addProductToBasket(teddy);
        System.out.println("-----------------------------------");
       
        user1.basket.buyProductFromBasket(barbie);
        user2.basket.buyProductFromBasket(teddy); 
    
    }

}
