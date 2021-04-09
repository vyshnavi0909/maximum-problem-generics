import com.generics.MaximumNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class JunitTestCase {

    @Test
    void ints_TestCase1(){
        MaximumNumber maxNum = new MaximumNumber();
        int max = maxNum.maxOfIntegers(10, 2, 4);
        Assertions.assertEquals( 10, max );
    }
    @Test
    void ints_TestCase2(){
        MaximumNumber maxNum = new MaximumNumber();
        int max = maxNum.maxOfIntegers(4, 10, 3);
        Assertions.assertEquals( 10, max);
    }
    @Test
    void ints_TestCase3(){
        MaximumNumber maxNum = new MaximumNumber();
        int max = maxNum.maxOfIntegers(4, 3, 10);
        Assertions.assertEquals( 10, max );
    }
    @Test
    void floats_TestCase1(){
        MaximumNumber maxNum = new MaximumNumber();
        float max = maxNum.maxOfFloats(20.2f, 2.3f, 10.22f);
        Assertions.assertEquals( 20.2f, max);
    }
    @Test
    void floats_TestCase2(){
        MaximumNumber maxNum = new MaximumNumber();
        float max = maxNum.maxOfFloats(2.3f, 20.2f, 10.22f);
        Assertions.assertEquals( 20.2f, max );
    }
    @Test
    void floats_TestCase3(){
        MaximumNumber maxNum = new MaximumNumber();
        float max = maxNum.maxOfFloats(2.3f, 10.22f, 20.2f);
        Assertions.assertEquals( 20.2f, max );
    }
    @Test
    void strings_TestCase1(){
        MaximumNumber maxString = new MaximumNumber();
        String max = maxString.maxOfStrings( "Peach", "Banana", "Apple");
        Assertions.assertEquals( "Peach", max );
    }
    @Test
    void strings_TestCase2(){
        MaximumNumber maxString = new MaximumNumber();
        String max = maxString.maxOfStrings( "Banana", "Peach", "Apple");
        Assertions.assertEquals( "Peach", max );
    }
    @Test
    void strings_TestCase3(){
        MaximumNumber maxString = new MaximumNumber();
        String max = maxString.maxOfStrings( "Banana", "Apple", "Peach");
        Assertions.assertEquals( "Peach", max );
    }
}
