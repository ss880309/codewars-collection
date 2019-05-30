public class Dubstep {
  public static String SongDecoder (String song)
  {
     String[] s = song.replaceAll("WUB"," ").trim().split(" +");
     StringBuilder sb = new StringBuilder("");
     for(int i=0;i<s.length;i++)
     {
         sb.append(s[i]);
         
         if(i!=s.length-1)
           sb.append(" ");
         
     }
     return sb.toString();
   }
}