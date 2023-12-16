package io;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class MathUtilsTest {
    MathUtils mathUtils;

    @BeforeAll
    static void beforeAllInit(){
        System.out.println("This needs to run before all ...");
    }

    @BeforeEach
    void init(){
        mathUtils = new MathUtils();
        System.out.println("Before each....");
    }



    @AfterEach
    void cleanUp(){
        System.out.println("Cleaning up....");
    }

    @Test
    void addTest() {
        //System.out.println("This is test ran");
        //MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.add(1,1);
        assertEquals(expected,actual);

    }

    @Test
    void multiplyTest() {
        assertAll(
                ()->assertEquals(4,mathUtils.multiply(2,2)),
                ()->assertEquals(0,mathUtils.multiply(2,0)),
                ()->assertEquals(-2,mathUtils.multiply(2,-1))
        );

    }

    @Test
     //@RepeatedTest(3)  //this test execute 3 times
    //@Disabled  //Skips this test
    void computeCircleAreaTest() {
        //MathUtils mathUtils = new MathUtils();
        assertEquals(314.1592653589793,mathUtils.computeCircleArea(10),"Should return right circle area");
    }

    @Test
    @DisplayName("Test method for Divide")
    void testDivide() {
        //MathUtils mathUtils = new MathUtils();
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1,0),"Divide by zero should throw");

    }

    @Nested
    class AddTest{
        @Test
        void testAddPositive(){
            assertEquals(2, mathUtils.add(1, 1),"");
        }

        @Test
        void testAddNegative(){
            assertEquals(-2, mathUtils.add(-1, -1),"");
        }
    }
}


//update userName set from user where userId = 2;