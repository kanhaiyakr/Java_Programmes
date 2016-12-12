class InstVarExm{
  //Instance variable
  int a = 10;
  int b = 20;
  public static void main(String[] args){ //-------static method
  /*  //local variable concept
    int a= 10;
    int b= 20;
    */
    InstVarExm IVE = new InstVarExm();  //------------static area

    System.out.println(IVE.a);
    System.out.println(IVE.b);
    IVE.m1();
  }
  void m1(){  //-----------instance method
    System.out.println(a);      //--------instance area
    System.out.println(b);
  }
}
/*
Output-:
10
20
Note-: JVM call only main method ... So, we have to call user_defined method in main method.
If same area we can use var Directly.
If different area we can use var using Object.
So, If we want to call user_defined method m1() then We have to create object in main function.
Output-:
10
20
10
20
Scope Of Instance Var -:
Throught out the class.
*/
