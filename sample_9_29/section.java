class section {
  private int var1 ;
  private int var2 ;
public void print(){
System.out.println("Var1:" + this.var1);
System.out.println("Var2:" + this.var2);
}
public static void main(String[] args) {
  System.out.println("sectiona No. of students");
  section a = new section();
  a.var1 = 20;a.var2 = 40;
  a.print();
  section b = new section();
  b.var1 = 50;b.var2 = 100;
  b.print();
}
}
