package complete;

import java.util.Arrays;

public class NumberHelper {
   static int[] numbers = {1, 5, 3, 1, 9, 2, 5};
   static int[] numbers1 = {1,2 , 3, 4, 9, 12, 15};

    public static boolean isSortedArray(int[] furchtzucker) {
        for (int i = 1; i < 7; i++) {
            if (furchtzucker[i - 1] > furchtzucker[i]) {
                    return false;
            }
        }
        return true;
    }


    public static int[] removeDuplicates(int[] numbers) {
        for (int i = 0; i < 7; i++) {
            for (int j = i+1; j<7 ; j++){
                if (numbers [i] > 0 && numbers [i] == numbers [j])
                   numbers [j]= -1;
            }
        }
        return numbers;
    }


    public static void main(String[] args) {
        System.out.println(isSortedArray(numbers));
        System.out.println(isSortedArray(numbers1));
        System.out.println(Arrays.toString(removeDuplicates(numbers)));
    }
}
