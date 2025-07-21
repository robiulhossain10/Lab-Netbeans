import java.util.Scanner;

public class Email {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Email");
    String email = sc.nextLine();
    if (email.contains("@") && email.contains(".")) {
      System.out.println("Valid Email");
    } else {
      System.out.println("Invalid Email");
    }
  }
}
