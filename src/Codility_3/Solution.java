package Codility_3;

public class Solution
{
    public static void main(String[] args)
    {
        int[] arr = {8,3,1,0,2,7,9};
        solution(arr);

    }

    public static int solution(int[] A)
    {
        sort(A);
        int next = 1;
        for (int i = 0; i < A.length; i++)
        {
            if(next==A[i])
            {
                next++;
            }
        }
        return next++;
    }

    public static void sort(int[] A)
    {
        int temp = 0;
        for (int i = 0; i <A.length ; i++)
        {
            for (int j = 1; j<A.length - i; j++)
            {
                if(A[j-1] > A[j])
                {
                    temp = A[j-1];
                    A[j-1] = A[j];
                    A[j] = temp;
                }
            }
        }
    }

}
