package Day1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

@DisplayName("Learning Life Cycle Annotations")

public class TestLifeCycleAnnotations {

    @BeforeAll
    public static void before(){
        System.out.println("Hello!");
    }

    @AfterAll
    public static void after(){
        System.out.println("Bye!");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Hello each!");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("Bye each!");
    }

    @Test
    public void test1() {
        System.out.println("Test 1 is running");
    }

    @Test
    public void test2() {
        System.out.println("Test 2 is running");
    }



}
