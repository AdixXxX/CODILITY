import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {
        int[] a = new int[5];
        a[0] = 3;
        a[1] = 8;
        a[2] = 9;
        a[3] = 7;
        a[4] = 6;
        System.out.println(solution(a, 3));



    }

    public static int[] solution(int[] A, int K)
    {
        int a;
        int b;

        for (int i = 0; i <K ; i++)
        {
            int A_Length = A.length;
            a = A[A.length-1];

            for (int j = 0; j <A.length-1; j++)
            {
               b = A[A_Length-2];
               A[A_Length -1] = b;
               --A_Length;
            }
            A[0] = a;
        }
        return A;
    }
}
