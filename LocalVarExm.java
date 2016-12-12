/*
class LocalVarExm{
  public static void main(String[] args){
    //local variable concept
    int a= 10;
    int b= 20;
    System.out.println(a);
    System.out.println(b);
  }
  void m1(){  // Checking Scope of Local Variable
    LocalVarExm LVE = new LocalVarExm();
    System.out.println(LVE.a);
    System.out.println(LVE.b);
  }
}
*/

/*
LocalVarExm.java:11: error: cannot find symbol
    System.out.println(LVE.a);
                          ^
  symbol:   variable a
  location: variable LVE of type LocalVarExm
LocalVarExm.java:12: error: cannot find symbol
    System.out.println(LVE.b);
                          ^
  symbol:   variable b
  location: variable LVE of type LocalVarExm
2 errors
*/

// This means Scope of Local variable is inside the method,constructor,blocks.
class LocalVarExm{
  public static void main(String[] args){
    //local variable concept
    int a= 10;
    int b= 20;
    System.out.println(a);
    System.out.println(b);
  }
}

/*Output -:
10
20
*/
