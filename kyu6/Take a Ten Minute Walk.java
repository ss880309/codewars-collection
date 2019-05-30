public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    // Insert brilliant code here
    if(walk.length!=10)  return false;    
    int x=0;    int y=0;
    
    for(int i=0;i<walk.length;i++){
        if(walk[i]=='n')
          y++;
        else if(walk[i]=='s')
          y--;
        else if(walk[i]=='e')
          x++;
        else if(walk[i]=='w')
          x--;   
    }   

    return ((x==0)&&(y==0))?true:false;
    
  }
}