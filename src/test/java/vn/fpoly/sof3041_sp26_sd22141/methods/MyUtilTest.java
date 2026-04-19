package vn.fpoly.sof3041_sp26_sd22141.methods;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MyUtilTest {

    static MyUtil myUtil;
     @BeforeAll
     static void setUpBeforeClass(){
         System.out.println("Set up before class - @BeforeAll");
         myUtil = new MyUtil();
     }
     @AfterAll
     static void tearDownAfterClass(){
         System.out.println("Tear down after class - @AfterAll");
     }

     @BeforeEach
     void setUp(){
         System.out.println("Set up before each");
     }

     @AfterEach
     void tearDown(){
         System.out.println("Tear down after Each");
     }
    @Test
    void add() {
        //int result= new MyUtil().add(1,2);
        int result = myUtil.add(1,2);
        Assertions.assertEquals(4,result);
    }

    @Test
    @DisplayName("Đảo ngược ký tự")
    void revese() {
        //Assertions.assertEquals("cba",new MyUtil().revese("abc"));
        Assertions.assertEquals("cba",myUtil.revese("abc"));
     }
}