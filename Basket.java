public class Basket 
{ 
    private Product[] products;
    private int size = 0;

    public Basket(int capacity) 
    {
        products = new Product[capacity];
    }

    public boolean addProductToBasket(Product product)
    {
        if (size < products.length) 
        {
            products[size] = product;
            size++;
            System.out.println(product.getName() + " был добавлен в корзину");
            return true;
        } 
        else 
        { 
            System.out.println(product.getName() + " не может быть добавлен в корзину"); 
            return false;
        }
    }

    public void buyProductFromBasket(Product product) 
    {
        for (int i = 0; i < size; i++) 
        {
            if (products[i].equals(product)) 
            {
                products[i] = products[size - 1];
                size--;
                System.out.println("Спасибо за Ваш выбор с " + product.getName()); 
                break;
            } 
            else 
            { 
                System.out.println("К сожалению, Ваш продукт не был найден, добавьте Ваш выбор в корзину");  
            }
        }
    }
} 