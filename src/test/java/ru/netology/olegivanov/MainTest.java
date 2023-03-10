package ru.netology.olegivanov;
import org.junit.jupiter.api.*;
public class MainTest {
    @Test
    public void testMain(){
    // Assertion
    Assertions.assertDoesNotThrow(() -> Main.main(null ));
    }
}
