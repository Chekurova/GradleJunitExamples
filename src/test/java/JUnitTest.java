import org.junit.jupiter.api.*;

public class JUnitTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Отработал перед всеми тестами");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Отработал после всеми тестами");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Отработал перед каждым тестом");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Отработал после каждого теста");
    }

    @Test
    void sussessTest() {
        Assertions.assertTrue(3 > 2);
        System.out.println("First Test");
    }

    @Test
    void sussessTestTwo() {
        Assertions.assertTrue(3 > 2);
        System.out.println("Second Test");
    }
}
