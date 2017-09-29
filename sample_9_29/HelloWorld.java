class HelloWorld {
  private int var1 ;
  public void print(){
    System.out.println("Var1 : " + this.var1);
  }
  public static void main(String[] args) {
    System.out.println("HelloWorld");
    HelloWorld h = new HelloWorld();
    h.var1 = 10;
    h.print();
  }
}
