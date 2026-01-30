import java.util.*;
import java.util.regex.Pattern;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
} // throw manually creates and send an exception, throws This method might cause
  // an exception”(possible)

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);  // checked at run time unchecked exception, checked at complile checked exception
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class p3 {

    static void checkMail(String email) throws InvalidEmailException {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        if (!Pattern.compile(emailRegex).matcher(email).matches()) {
            throw new InvalidEmailException("Format Error: '" + email + "' is not a valid email.");
            //throws is used in method signature and throw is used to actually throw an exception
        }
    }

    static void checkName(String username) throws InvalidNameException {
        String nameRegex = "^[a-zA-Z0-9]{3,16}$";
        if (!Pattern.compile(nameRegex).matcher(username).matches()) {
            throw new InvalidNameException("Format Error: '" + username + "' is not valid username.");
        }
    }

    static void checkAge(int age) throws InvalidAgeException {

        if (age <= 21) {
            throw new InvalidAgeException("Format Error: '" + age + "' is not valid age.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter mail: ");

        String email = sc.next();
        System.out.println("enter age");

        int age = sc.nextInt();
        System.out.println("enter username");

        String username = sc.next();

        try {

            checkMail(email);
            System.out.println("valid email");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
        try {
            checkName(username);
            System.out.println("valid username");
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }
        try {
            checkAge(age);
            System.out.println("valid age");

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }

}
