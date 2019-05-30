public class Kata{
  public static double find_average(int[] array){
      double n = 0.0;
      for(int i=0;i<array.length;i++)
        n+=array[i];
      return n/array.length;
  }
}