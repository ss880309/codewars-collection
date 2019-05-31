public class CaffeineBuzz {

  public static boolean isScript(int n)
  {
      return (isJava(n)||isCoffee(n)) && n%2==0;
  }

  public static boolean isCoffee(int n)
  {
      return n%3==0 && n%4==0;
  }

  public static boolean isJava(int n)
  {
      return n%3==0;
  }

  public static String caffeineBuzz(int n){
      return (isCoffee(n)?"Coffee":isJava(n)?"Java":"mocha_missing!")+(isScript(n)?"Script":"");
  }
}
