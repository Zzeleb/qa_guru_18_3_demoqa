import org.junit.jupiter.api.*;

public class JUnitExamples {

    @BeforeAll
    static void beforeAll() {
        System.out.println ("Here is BeforeAll()");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Here is BeforeEach()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println ("Here is AfterAll()");
    }

    @AfterEach
    void afterEach() {
        System.out.println ("Here is AfterEach()");
    }

    @Test
    void firstTest() {
        System.out.println ("Here is firstTest()");
    }

    @Test
    void secondTest() {
        System.out.println ("Here is secondTest()");
    }
}
