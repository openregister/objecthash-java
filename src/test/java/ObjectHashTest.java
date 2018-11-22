/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class ObjectHashTest {
    @Test
    public void hashesStrings() throws NoSuchAlgorithmException {
        ObjectHash objectHash = new ObjectHash();
        assertEquals(objectHash.hexDigest("Hello, Ruby!"), "c92765c1350e6df6800dbadedb3420f398d5f3c7e38a3da48aadb3332280f85f");
    }

    @Test
    public void normalisesStrings() throws NoSuchAlgorithmException {
        ObjectHash classUnderTest = new ObjectHash();
        assertEquals(classUnderTest.hexDigest("\u03d3"), "f72826713a01881404f34975447bd6edcb8de40b191dc57097ebf4f5417a554d" );
        assertEquals(classUnderTest.hexDigest("\u03d2\u0301"), "f72826713a01881404f34975447bd6edcb8de40b191dc57097ebf4f5417a554d" );
    }


}