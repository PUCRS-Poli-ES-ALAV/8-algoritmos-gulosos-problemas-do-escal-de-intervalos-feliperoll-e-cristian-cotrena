  
import java.util.Arrays;

public class Main {



    public static int[] guloso(int[] s, int[] f, int n) {

        int[] x = new int[n];
        int i = 0;
        f[0] = 0;

        for (int k = 0; k < n; k++) {
            if (s[k] > f[i]) {
                x[k] = 1;
                i = k;
            }
        }

        return x;
    }




    public static void main(String[] args) {

        int[] s = { 5, 5, 6, 6, 7, 8, 8, 8, 9, 9, 10 };
        int[] f = {2, 3, 4, 5, 6, 7, 9, 10, 12, 14, 16};
        int n = s.length;
 

        System.out.println(Arrays.toString(guloso(s, f, n)));
    }

}