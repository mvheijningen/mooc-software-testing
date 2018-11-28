package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    private CaesarShiftCipher cipher;

    @BeforeEach
    public void initialize() {
        this.cipher = new CaesarShiftCipher();
    }

    @ParameterizedTest(name="Message={0}, Shift={1}, Expected={2}")
    @CsvSource({"a,0,a", "a,1,b", "a,25,z", "a,26,a"})
    public void singleLetter(String message, int shift, String expectedResult) {
        Assertions.assertEquals(expectedResult, this.cipher.CaesarShiftCipher(message, shift));
    }

    @ParameterizedTest(name="Message={0}, Shift={1}, Expected={2}")
    @CsvSource({"abc,0,abc", "abc,1,bcd", "abc,25,zab", "abc,26,abc"})
    public void abc(String message, int shift, String expectedResult) {
        Assertions.assertEquals(expectedResult, this.cipher.CaesarShiftCipher(message, shift));
    }
}
