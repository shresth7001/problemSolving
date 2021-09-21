
public class Main { 
  
    private static int Jump(int[] num) 
    { 
        int i=0;
        int a = num[0];
        int b = num[0];
        int jump = 1;
  
        for (i = 1; i < num.length; i++) 
        { 
           if(i == num.length - 1)
            return jump;
            a--;
            b--;
            if(num[i] > b)
            {
                b = num[i];
            }
            if(a == 0)
            {
                jump++;
                a=b;
            }
            
            if (b == 0)
               return 0;
            
        } 
        return jump;
    } 
  
    public static void main(String[] args) 
    { 
        int num[] = { 2,3,1,1,4 }; 
  
        System.out.println("Minimum number of jumps to reach end is : "
                           + Jump(num)); 
    } 
} 

/* Try more Inputs
case 1: 
actual = Jump([1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9])
expected = 3

case2: 
 actual = Jump([1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1])
 expected = 10
 
case3: 
actual = Jump([3,2,1,0,4])
expected = -1
Jump not possible
*/