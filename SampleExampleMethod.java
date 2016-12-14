class Test{
  void m1(){  //instance method
    System.out.println("method m1");
  }
  void m2(){
    System.out.println("method m2");
  }
  public static void main(String[] args){
    Test t = new Test();
    t.m1();
    t.m2();
  }
}
