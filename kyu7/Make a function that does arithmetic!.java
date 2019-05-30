class ArithmeticFunction {
  public static int arithmetic(int a, int b, String op) {
    // your code here
    if(op.equals("add")){
        return a+b;
    }
    else if(op.equals("subtract")){
        return a-b;
    }
    else if(op.equals("multiply")){
        return a*b;
    }
    else if(op.equals("divide")){
        return a/b;
    }
    else
      return 0;
    
    
  }
}