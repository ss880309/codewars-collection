import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String s = new String("");
        for(int i=0;i<binary.size();i++)
          s+=binary.get(i);
        return Integer.parseInt(s,2);
    }
}