import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

//@ExtendWith(MathUtilsTest.class)
public class MathUtilTest {

    @BeforeAll
    public static void setUp(){
        System.out.println("Before All");
        MathUtils mathUtils = new MathUtils();
    }

    @BeforeEach
    public void beforeMethod(){
        System.out.println("before");
    }



    @Order(2)
    @DisplayName("sum")
    @RepeatedTest(5)
    public void testSum(){
        MathUtils mathUtils = new MathUtils();
       int sum =  mathUtils.getSum(1, 2, 3,4 , 5, 6, 7);
       int sum2 = mathUtils.getSum(7, 7, 7, 7, 7);
       Assertions.assertEquals(sum, 28, "test");
       Assertions.assertEquals(sum2, 35, "no success");
    }


    @Test
    @DisplayName("name multiply")
    @Order(1)
    @Timeout(400)
    public void testMultiply() throws InterruptedException {
        MathUtils mathUtils = new MathUtils();
        int product = mathUtils.getMultiply(1, 2, 3, 4 , 5, 6, 7);

        Assertions.assertEquals(product, 5040, "test");
        Thread.sleep(500);
    }

    @AfterEach
    public void after(){
        System.out.println("    after");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After All");
    }
    // pinalurze manzanebi sichqaris mixedvit lagdeba
    // vtvat 5s sheuli 0-100
    // 10s 100-120
    // 10s 120-150
}
