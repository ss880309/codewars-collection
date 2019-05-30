import java.util.*;
public class Solution {

  public int solution(int number) {
        int sum = 0;
        List<Integer> list = new ArrayList();
        int mul3 = 3;
        int mul5 = 5;
        //list.add(mul3);
        //list.add(mul5);
        for(int i=1;mul3<number;i++) //
        {
            if(i%5==0)
            {
              mul3+=3;
              continue;
            }
            //System.out.println(i+" "+mul3);
            list.add(mul3);
            mul3+=3;
            
        }
        
        for(int i=1;mul5<number;i++)
        {
            list.add(mul5);
            mul5+=5;
            
        }
        
        for(int i=0;i<list.size();i++)
          sum+=list.get(i);
        
        //System.out.println(list);
        return sum;
        
    }
}