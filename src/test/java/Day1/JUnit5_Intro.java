package Day1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//setting displayName()
@DisplayName("Day 1 of JUnit 5")

public class JUnit5_Intro {

    @DisplayName("Testing numbers")
    @Test
    public void test(){
        System.out.println("Hello");
        assertEquals(1,1);
        assertEquals(1,2, "Something is wrong");
    }

    @DisplayName("Testing my name")
    @Test
    public void test2(){
        String name = "Aatrin Si";
        //assertEquals("Ekaterina Simakina", name, "Name does not match");
        //assertEquals("Katrin Si", name, "Name does not match");

        assertEquals('A', name.charAt(0));

        //assertTrue(name.startsWith("A"));

    }
}
