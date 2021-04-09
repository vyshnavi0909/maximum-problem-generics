import com.generics.MaximumNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class JunitTestCase {

    @Test
    void intArray_TestCase1(){
        MaximumNumber maxNum = new MaximumNumber();
        int max = maxNum.maxOfIntegers(10, 2, 4);
        Assertions.assertEquals( 10, max );
    }
    @Test
    void intArray_TestCase2(){
        MaximumNumber maxNum = new MaximumNumber();
        int max = maxNum.maxOfIntegers(4, 10, 3);
        Assertions.assertEquals( 10, max);
    }
    @Test
    void intArray_TestCase3(){
        MaximumNumber maxNum = new MaximumNumber();
        int indexOfMaxNum = maxNum.maxOfIntegers(4, 3, 10);
        Assertions.assertEquals( 10, indexOfMaxNum );
    }
}
