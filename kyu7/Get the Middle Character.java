class Kata {
  public static String getMiddle(String word) {
    //Code goes here!
    if(word.length()%2==0){
      return word.charAt(word.length()/2-1)+""+word.charAt(word.length()/2);
    }else{
      return ""+word.charAt(word.length()/2);
    }
  }
}