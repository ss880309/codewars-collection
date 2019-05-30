public class Dinglemouse {

  public static long int123(final int a) {

    if(a>123){
        return Long.MAX_VALUE-((long)(a-124));
    }else if(a<0){
        if(a==-2147483648)
          return ((((long)Integer.MAX_VALUE)+124));
        else
          return -a+123;
    }
    else
      return 123-a;
  }

}