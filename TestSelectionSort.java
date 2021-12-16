import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class TestSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
	}

    public TestSelectionSort() { }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 2;
        arr[2] = 1;
        arr[3] = 100;
        arr[4] = 10;
        
        int[] sortedArr = new int[5];
        sortedArr[0] = 1;
        sortedArr[1] = 2;
        sortedArr[2] = 5;
        sortedArr[3] = 10;
        sortedArr[4] = 100;
        
        SelectionSort.sort(arr);
        assertArrayEquals("Failure: Actual value not equal to expected value", sortedArr, arr);
    }
    
    public void testNegative(){
        int[] arr = new int[5];
        arr[0] = -5;
        arr[1] = -2;
        arr[2] = -1;
        arr[3] = -100;
        arr[4] = -10;
        
        int[] sortedArr = new int[5];
        sortedArr[0] = -100;
        sortedArr[1] = -10;
        sortedArr[2] = -5;
        sortedArr[3] = -2;
        sortedArr[4] = -1;
        
        SelectionSort.sort(arr);
        assertArrayEquals("Failure: Actual value not equal to expected value", sortedArr, arr);
    }
    
    public void testMixed(){
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 0;
        arr[2] = -1;
        arr[3] = -100;
        arr[4] = 100;
        
        int[] sortedArr = new int[5];
        sortedArr[0] = -100;
        sortedArr[1] = -1;
        sortedArr[2] = 0;
        sortedArr[3] = 1;
        sortedArr[4] = 100;
        
        SelectionSort.sort(arr);
        assertArrayEquals("Failure: Actual value not equal to expected value", sortedArr, arr);
    }
}
