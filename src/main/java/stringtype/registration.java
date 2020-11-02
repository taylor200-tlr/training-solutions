package stringtype;

import java.util.Scanner;

public class registration {
    public static void main(String[] args) {
        String username, password1, password2, email;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a felhasználóneved:");
        username = scanner.nextLine();

        System.out.println("Add meg a jelszavad:");
        password1 = scanner.nextLine();
        System.out.println("Add meg a jelszavad újra:");
        password2 = scanner.nextLine();

        System.out.println("Add meg az email címed:");
        email = scanner.nextLine();

        class Uservalidator {
            public boolean isValidUserName(String username) {
                return username != null && !"".equals(username);
            }

            public boolean isValidPassword(String password1, String password2) {
                return password1 != null
                        && password1.length() >= 8
                        && password1.equals(password2);
            }

        }

    }
}