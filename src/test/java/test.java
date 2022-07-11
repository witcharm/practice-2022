import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {
    @Test
    void addition(){
        String actual = Main.calculate("1","*","1");
        assertEquals("1",actual);
    }
    @Test
    void addition1(){
        String actual = Main.calculate("2/3","-","2/3");
        assertEquals("0",actual);
    }
    @Test
    void addition2(){
        String actual = Main.calculate("21","/","3");
        assertEquals("7",actual);
    }
    @Test
    void addition3(){
        String actual = Main.calculate("3/5","+","8");
        assertEquals("43/5",actual);
    }
    @Test
    void addition4(){
        String actual = Main.calculate("7","*","5");
        assertEquals("35",actual);
    }
    @Test
    void addition5(){
        String actual = Main.calculate("88/11","-","11/8");
        assertEquals("53/8",actual);
    }
    @Test
    void addition6(){
        String actual = Main.calculate("0","/","0");
        assertEquals(null,actual);
    }
}