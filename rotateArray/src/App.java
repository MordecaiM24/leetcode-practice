import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotate(nums,3);
        System.out.println(Arrays.toString(nums));
    }

    static void rotate(int[] input, int rotate) {
        int len = input.length;
        int[] output = new int[len];
        int realRotation = Math.abs((len-rotate));
        realRotation %= len;
        for(int i = 0; i < len; i++){
            output[i] = input[(i+realRotation)%len];
        }
        System.arraycopy(output, 0, input, 0, input.length);
    }
}