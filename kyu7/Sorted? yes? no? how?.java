class Solution {
  
  static boolean ascending(int[] n){
    
    for(int i=0;i<n.length-1;i++)
    {
        if(n[i]>n[i+1])
          return false;
    }
    return true;
  }
  
  static boolean descending(int[] n){
    for(int i=0;i<n.length-1;i++)
    {
        if(n[i]<n[i+1])
          return false;
    }
    return true;
  }
  
  public static String isSortedAndHow(int[] array) {
      return ascending(array)?"yes, ascending":descending(array)?"yes, descending":"no";
  }
  
}
