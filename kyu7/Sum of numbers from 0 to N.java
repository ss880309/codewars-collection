public class SequenceSum{

  public static String showSequence(int value){
    if(value==0)  return "0=0";
    else if(value<0)  return value+"<0";
    int sum = 0;
    String s = "0";
    for(int i=1;i<=value;i++)
    {
      s+=("+"+i);
      sum+=i;
    }
    s+=(" = "+sum);
    return s;
  }

}