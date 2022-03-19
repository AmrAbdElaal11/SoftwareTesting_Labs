import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
    }

    @Test
    void intMax() {
        int actual= Main.intMax(7,6,8);
        int expected=8;
       assertEquals(actual,expected);

    }
}