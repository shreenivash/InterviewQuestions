package numbers;

import java.util.Arrays;

public class MultiplyArrays {

    static int[] multiplyArrayValues(int[] values) {
        int product = 1;
        for(int i = 0; i < values.length; i++){
            product *= values[i];
        }
        int[] result = new int[values.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = product / values[i];
        }
        return result;
    }

    static void testMultiplyArrayValues(int[] values)
    {
        System.out.println(Arrays.toString(values) + " => " + Arrays.toString(multiplyArrayValues(values)));
    }


    public static void main(String[] args) {
        testMultiplyArrayValues(new int[] {1,1,2,3});
        testMultiplyArrayValues(new int[] {4,3,5,7});
        testMultiplyArrayValues(new int[] {9,9,9,9});
        testMultiplyArrayValues(new int[] {1,1,1,1});
        testMultiplyArrayValues(new int[] {1,2,3,4});
    }

}