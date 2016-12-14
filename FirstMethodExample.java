class Test{
  // instance variable
  int a = 10;
  int b = 20;
  void m1(){  //instance method
    System.out.println(a+b);
  }
  static void m2(){   //static method
    Test t = new Test();
    System.out.println(t.a + t.b);
  }
  public static void main(String[] args){
    Test t = new Test();
    t.m1();
    Test.m2();
  }
}
/*
Calling Instance Method m1 by using Object t & Static Method m2 by using class name Test in Static Main Method.
pika@pika-HP-ENVY-Notebook:~/java_kanha/Java_Programmes$ java Test
30
30
*/
