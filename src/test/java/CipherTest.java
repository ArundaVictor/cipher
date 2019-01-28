import org.junit.*;
import static org.junit.Assert.*;

public class CipherTest {


    @Test
    public void textInput_input_is_a_string_true() {
        Encoding cipherText = new Encoding("one", "one", 1 , "pof");
        assertEquals(true,cipherText.textInput(expectedoutput, "test"));
    }

    @Test
    public void textOutput_output_is_a_string_true() {
        Encoding cipherText = new Encoding("two", "two", 1, "uxp");
        assertEquals(true,cipherText.textOutput(expectedoutput, "test"));
    }

    @Test
    public void encrypt_input_is_encrypted_String() {
        Encoding encodedText = new Encoding("three","three",1,"uisee");
        assertEquals("true",encodedText.encrypt(expectedoutput,"test",1));
    }

}