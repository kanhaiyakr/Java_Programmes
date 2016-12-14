//In real appliaction development methods are expecting  object as parameter.
class X{}
class Y{}
class Student{}
class Emp{}
class Test{
  void m1(X x, Emp e){                    // x & e are object of X & Emp class
    System.out.println("m1 method");
  }
  static void m2(Y y, Student s){         // y & s are object of Y & Student class
    System.out.println("m2 method");
  }
  public static void main(String[] args){
    Test t = new Test();
    X x1 = new X();
    Emp e1 = new Emp();
    t.m1(x1,e1);// we can also pass object directly like  t.m1(new X(),new Emp());
    Y y1 = new Y();
    Student s1 = new Student();
    Test.m2(y1,s1); // we can also pass object like Test.m2(new Y(), new Student());
  }
}
/*
Output-:
Taking object type parameters.
pika@pika-HP-ENVY-Notebook:~/java_kanha/Java_Programmes$ java Test
m1 method
m2 method

*/
