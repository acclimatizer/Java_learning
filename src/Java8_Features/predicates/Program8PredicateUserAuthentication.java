import java.util.Scanner;
import java.util.function.Predicate;

class User {
    String username;
    String password;

    User(String u, String p) {
        username = u;
        password = p;
    }
}

public class Program8PredicateUserAuthentication {
    public static void main(String[] args) {
        Predicate<User> p = user ->
                user.username.equals("admin") && user.password.equals("1234");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String u = sc.next();

        System.out.print("Enter password: ");
        String pw = sc.next();

        User user = new User(u, pw);

        if (p.test(user)) {
            System.out.println("Valid user");
        } else {
            System.out.println("Invalid user");
        }
    }
}