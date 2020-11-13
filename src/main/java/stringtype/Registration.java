package stringtype;

import java.util.Scanner;

public class Registration {
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
            public boolean isValidEmail(String email){
                boolean isNotFirst = email.indexOf("@") > 0;
                boolean isDotAfterAt = email.indexOf(".") > (email.indexOf("@") + 1);
                boolean isDotNotLast = email.indexOf(".") < email.length();
                return isNotFirst && isDotAfterAt && isDotNotLast;
            }

        }

    }
}