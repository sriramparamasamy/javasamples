      public class MyDeadLock {
        
      String str1 = "java";
      String str1 = "unix";

      Thread thrd1 = new Thread("My Thread 1") {
      public void run(){
      while (true){
      synchronized(str1) {
      synchronized(str2) {
      System.out.println(str1 + str2);
      }
      }
      }
      }
      };

      Thread thrd2 = new Thread("My Thread 2") {
      public void run(){
      while (true){
      synchronized(str1) {
      synchronized(str2) {
      System.out.println(str2 + str1);
      }
      }
      }
      }
      };

      public static void main(String a[]){
      MyDeadlock md1 = new MyDeadlock();
      mdl.trd1.start();
      mdl.trd2.start();
      }

}
