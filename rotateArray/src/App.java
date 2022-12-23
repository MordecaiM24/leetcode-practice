import java.util.*;
import java.lang.*;


public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotateArray(nums, 3)));
    }


    static int[] rotateArray(int[] input, int rotate){
        int len = input.length;
        int[] output = new int[len];
        int realRotation = (len-rotate);

        for(int i = 0; i < len; i++){
            output[i] = input[(i+realRotation)%len];
        }
        return output;
    }
}