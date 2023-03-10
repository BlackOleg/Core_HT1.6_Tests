package ru.netology.olegivanov;

import org.junit.jupiter.api.*;

public class BookTests {
    Book book;

    @BeforeAll
    public static void before() {
        System.out.println("Book class tests started..");
    }

    @AfterAll
    public static void after() {
        System.out.println("Book class tests completed");
    }

    @BeforeEach
    public void beforeEach() {
        book = new Book("A. Tolstoy", "Hyperboloid", 400);
        System.out.println("Book example unit created");
    }

    @AfterEach
    public void afterEach() {
        book = null;
        System.out.println("Book example unit terminated");
    }

    @Test
    public void testIsBig() {
        System.out.println("Test for Big Book");
        // given:
        boolean expected = true;
        // when:
        boolean result = book.isBig();
        // then:
        //Assertions.assertEquals(expected, result);
        Assertions.assertTrue(result);
    }

    @Test
    public void testCheckInUse() {
        // given:
        book.setInUse(true);
        String expected = "Книга недоступна";
        // when:
        String result = book.checkInUse();
        // then:
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void testToString() {
        // given:
        String expected = "Автор: A. Tolstoy, Название: Hyperboloid, Кол-во страниц: 400 \n" +
                           "Вы можете взять эту книгу\n";
        // when:
        String result = book.toString();
        // then:
        Assertions.assertEquals(expected, result);
    }

}
