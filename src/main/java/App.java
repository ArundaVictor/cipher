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

          boolean programRunning = true;

            
        System.out.println("Welcome to Ceaser Cipher applicatin. What would you like to do? Decrypt or Exit");
        String navigationChoice = myConsole.readLine();


          if (navigationChoice.equals("Decrypt")){

        System.out.println("Enter the text you want to encrypt:");
         String userString = myConsole.readLine();
        encoding.setMinput(userString);
        encoding.encrypt(userString,5);
        System.out.println("Encoded string: " + encoding.getResult());
         System.out.println("Decrypted string: " + encoding.getMinput() );

	      }else if (navigationChoice.equals("Exit")) {
	      	  programRunning = false;
	      }
	  }
	}