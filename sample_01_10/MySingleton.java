public static class MySingleton {
private static MySingleton myObj;

static{
  myObj = new MySingleton();
}
private MySingleton(){

}
public static MySingleton getInstance() {
  return myObj;
}
public void testMe(){
  System.out.println("Hey... it is working!!!");
}
public static void main(String a[]) {
  MySingleton ms = getInstance();
  ms.testMe();
}

}
