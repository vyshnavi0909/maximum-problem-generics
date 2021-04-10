import com.generics.GenericType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class JunitTestCase {

    @Test
    void ints_TestCase1(){
        Integer[] intArr = {10, 2, 4};
        int max = GenericType.max(intArr);
        Assertions.assertEquals( 10, max );
    }
    @Test
    void ints_TestCase2(){
        Integer[] intArr = { 2, 10, 4};
        int max = GenericType.max(intArr);
        Assertions.assertEquals( 10, max);
    }
    @Test
    void ints_TestCase3(){
        Integer[] intArr = {2, 4, 10};
        int max = GenericType.max(intArr);
        Assertions.assertEquals( 10, max );
    }
    @Test
    void floats_TestCase1(){
        Float[] floatArr = {10.2f, 2.2f, 4.4f};
        float max = GenericType.max(floatArr);
        Assertions.assertEquals( 10.2f, max);
    }
    @Test
    void floats_TestCase2(){
        Float[] floatArr = {2.3f, 20.2f, 10.22f};
        float max = GenericType.max(floatArr);
        Assertions.assertEquals( 20.2f, max );
    }
    @Test
    void floats_TestCase3(){
        Float[] floatArr = {2.3f, 10.22f, 20.2f};
        float max = GenericType.max(floatArr);
        Assertions.assertEquals( 20.2f, max );
    }
    @Test
    void strings_TestCase1(){
        String[] strArr = {"Banana", "Peach", "Apple"};
        String max = GenericType.maxOfString(strArr );
        Assertions.assertEquals( "Banana", max );
    }
    @Test
    void strings_TestCase2(){
        String[] strArr = {"Peach", "Banana", "Apple"};
        String max = GenericType.maxOfString(strArr);
        Assertions.assertEquals( "Banana", max );
    }
    @Test
    void strings_TestCase3(){
        String[] strArr = { "Apple", "Peach", "Banana"};
        String max = GenericType.maxOfString( strArr);
        Assertions.assertEquals( "Banana", max );
    }
}
