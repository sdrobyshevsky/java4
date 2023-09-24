import java.util.Scanner;

public class User 
{
    private String login;
    private String password;
    Basket basket;

    public User(String login, String password, Basket basket) 
    {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public boolean checkLogin() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин, пожалуйста");
        String userLogin = scanner.nextLine();
        scanner.close(); 
        if (userLogin.equalsIgnoreCase(login)) 
            {
            System.out.println("Логин правильный");
            return true;
            } 
        else 
            {
            System.out.println("Ваш логин неправильный");
            scanner.close();
            return false;
            }
    }

    public boolean checkPassword() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль, пожалуйста"); 
        String userPassword = scanner.nextLine();
        scanner.close();
        if (userPassword.equalsIgnoreCase(password)) 
            {
            System.out.println("Пароль правильный"); 
            return true;
            } 
        else 
            {
            System.out.println("Ваш пароль неправильный");
            return false;
        }
    } 
}