package Sollers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args)
    {
        int[] arr = {1,1,1,1,0};
        int[] dieces = {2,1,4};
        coins(arr);
        dice(dieces);
    }

    public static int dice(int[] A)
    {
        int dieceCounter = A.length;
        int rotate = 0;

        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;

        List list = new ArrayList<Integer>();

        for (int i = 1; i < dieceCounter ; i++)
        {
            list.add(A[i]);
        }
        if(list.contains(1) )

        return dieceCounter;


    }

        public int Shoe(String S)
        {
            int numberR = 0 ;
            int numberL = 0 ;

            int workers = 0 ;

            for (int i = 0; i <S.length() ; i++) {
                if (S.charAt(i) == 'L') {
                    numberL++;
                } else {
                    numberR++;
                }

                if (numberL == numberR)
                {
                    workers++;
                    numberL=0;
                    numberR=0;
                }
            }

            return workers;
        }

    static int coins(int[] A) {
        int n = A.length;
        int result = 0;

        for (int i = 0; i < n - 1; i++)
        {
            if (A[i] == A[i + 1]) {
                System.out.println("result");
                result = result + 1;
            }
        }
        int r = 0;

        for (int i = 0; i < n; i++)
        {
            int count = 0;
            if (i > 0)
            {
                if (A[i - 1] != A[i]) {
                    count = count + 1;
                    System.out.println("i>0");
                }
                else
                    count = count - 1;
            }
            if (i < n - 1)
            {
                if (A[i + 1] != A[i]) {
                    count = count + 1;
                    System.out.println("i<n-1");
                }
                else
                    count = count - 1;
            }
            System.out.println(count);
            r = Math.max(r, count);
        }
        System.out.println(result + r);
        return result + r;
    }
}