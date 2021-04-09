import com.generics.GenericType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class JunitTestCase {

    @Test
    void ints_TestCase1(){
        int max = GenericType.max(10, 2, 4);
        Assertions.assertEquals( 10, max );
    }
    @Test
    void ints_TestCase2(){
        int max = GenericType.max(4, 10, 3);
        Assertions.assertEquals( 10, max);
    }
    @Test
    void ints_TestCase3(){
        int max = GenericType.max(4, 3, 10);
        Assertions.assertEquals( 10, max );
    }
    @Test
    void floats_TestCase1(){
        float max = GenericType.max(20.2f, 2.3f, 10.22f);
        Assertions.assertEquals( 20.2f, max);
    }
    @Test
    void floats_TestCase2(){
        float max = GenericType.max(2.3f, 20.2f, 10.22f);
        Assertions.assertEquals( 20.2f, max );
    }
    @Test
    void floats_TestCase3(){
        float max = GenericType.max(2.3f, 10.22f, 20.2f);
        Assertions.assertEquals( 20.2f, max );
    }
    @Test
    void strings_TestCase1(){
        String max = GenericType.max( "Peach", "Banana", "Apple");
        Assertions.assertEquals( "Peach", max );
    }
    @Test
    void strings_TestCase2(){
        String max = GenericType.max( "Banana", "Peach", "Apple");
        Assertions.assertEquals( "Peach", max );
    }
    @Test
    void strings_TestCase3(){
        String max = GenericType.max( "Banana", "Apple", "Peach");
        Assertions.assertEquals( "Peach", max );
    }
}
