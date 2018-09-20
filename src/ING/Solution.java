package ING;

public class Solution
{
    public static void main(String[] args)
    {

    }
    static int sol(int[] A)

    {
        for (int i = 0; i <A.length-1; i++)
        {
            for (int j = 0; j<=i ; j++)
            {
               if( A[i] == A[i+1])
               {
                   System.out.println(0);
                   return 0;
               }
            }
        }
        return 1;
    }

     static int solution(int[] A) {
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            ans += A[i];
        }
         System.out.println(ans);
        return ans;
    }
    public static String solution(int N)
    {
       StringBuilder s = new StringBuilder();

        for (int i = 0; i <N ; i++)
        {
            if(i%2==0)
            {
                s.append("+");
            }
            else if(i%2==1)
            {
                s.append("-");
            }
        }
        return String.valueOf(s);
    }
   static int find_min(int[] A)
   {
        int ans = 0;
        for (int i = 1; i < A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        System.out.println(ans);
        return ans;
    }
    static int[] createTable(int N)
    {
        int[] tab = new int[N];

        for (int i = 0; i <N ; i++)
        {
            tab[i] = (int)(Math.random() * 101);
        }
//        for (int i = 0; i <tab.length ; i++)
//        {
//            System.out.print(tab[i] + " ");
//        }

        return tab;
    }

}

