// import java.io.Console;

// public class App {
//   public static void main(String[] args) {
//   	  Console myConsole = System.console();
//     System.out.println("Enter the sentence to encrypt:");
//     String encryptFile = myConsole.readLine();

//     System.out.println("Enter the key:");
//     String encryptkey = myConsole.readLine();
//   }
// }

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Encoding encoding = new Encoding("","",22,"");

// encoding

        System.out.println("Add your string");
        String userString = scanner.nextLine();
        encoding.setMinput(userString);
        encoding.encrypt(userString,22);
        System.out.println("Input: " + encoding.getMinput() );
        System.out.println("Encoded: " + encoding.getResult());
	      }
	  }