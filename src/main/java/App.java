// import java.io.Console;

// public class App {
//   public static void main(String[] args) {
  	  // Console myConsole = System.console();
//     System.out.println("Enter the sentence to encrypt:");
    // String encryptFile = myConsole.readLine();

//     System.out.println("Enter the key:");
//     String encryptkey = myConsole.readLine();
//   }
// }
import java.io.Console;


public class App {
    public static void main(String[] args) {
    	Console myConsole = System.console();
        Encoding encoding = new Encoding("","",5,"");



        System.out.println("Enter the text you want to encrypt:");
         String userString = myConsole.readLine();
        encoding.setMinput(userString);
        encoding.encrypt(userString,5);
        System.out.println("Input: " + encoding.getMinput() );
        System.out.println("Encoded text is: " + encoding.getResult());
	      }
	  }