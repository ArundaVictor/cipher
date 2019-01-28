import org.junit.*;
import static org.junit.Assert.*;

public class CipherTest {


    @Test
    public void textInput_input_is_a_string_true() {
        Encoding cipher = new Encoding("vghcghch", "vghchgchg", 1 , "njkbjk");
        assertEquals(true,cipher.textInput("test"));
    }

    @Test
    public void textOutput_output_is_a_string_true() {
        Encoding cipher = new Encoding("vghcghch", "vghchgchg", 1, "vhvh");
        assertEquals(true,cipher.textOutput("test"));
    }

    @Test
    public void encrypt_input_is_encrypted_String() {
        Encoding encoding = new Encoding("gchg","bjhbj",1,"vhgvu");
        assertEquals("true",encoding.encrypt("test",1));
    }

}