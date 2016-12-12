class StaticVarExm{
  //Static variable
  static int a = 10;
  static int b = 20;
  public static void main(String[] args){ //-------static method
    System.out.println(StaticVarExm.a);  //------------static area
    System.out.println(StaticVarExm.b);
    StaticVarExm SVE = new StaticVarExm();
    SVE.m1();
  }
  void m1(){  //-----------instance method
    System.out.println(StaticVarExm.a);      //--------instance area
    System.out.println(StaticVarExm.b);
  }
}
/*
Output-:
10
20
10
20
*/
