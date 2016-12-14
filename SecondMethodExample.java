class Test{
  void m1(int a, char ch){  //instance method --------- arguments which are passed in methods are always Local to the method.
    System.out.println(a);
    System.out.println(ch);
  }
  static void m2(String str, boolean b){   //static method--------- arguments which are passed in methods are always Local to the method.
    System.out.println(str);
    System.out.println(b);
  }
  public static void main(String[] args){
    Test t = new Test();
    t.m1(10,'A');
    Test.m2("kanhaiya",true);
  }
}
/*
Taking premetives type parameters. 
Output-:
pika@pika-HP-ENVY-Notebook:~/java_kanha/Java_Programmes$ java Test
10
A
kanhaiya
true
*/
