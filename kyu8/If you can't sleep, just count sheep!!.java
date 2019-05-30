class Kata {
  public static String countingSheep(int num) {
    //Add your code here
    String s = "";
    for(int i=1;i<=num;i++){
        s+=(i+" sheep...");
    }
    return s;
  }
}