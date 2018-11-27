package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    GHappy gHappy;

    @BeforeEach
    public void initialize() {
        this.gHappy = new GHappy();
    }

    @Test
    public void oneG() {
        Assertions.assertFalse(gHappy.gHappy("g"));
    }

    @Test
    public void oneNonG() {
        Assertions.assertTrue(gHappy.gHappy("h"));
    }

    @Test
    public void happyG() {
        Assertions.assertTrue(gHappy.gHappy("buggy"));
    }

    @Test
    public void unhappyG() {
        Assertions.assertFalse(gHappy.gHappy("google"));
    }

    @Test
    public void multipleNonG() {
        Assertions.assertTrue(gHappy.gHappy("happy"));
    }
}
