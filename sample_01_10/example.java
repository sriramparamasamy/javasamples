class SinglyLinkedListImpl<T> {
  private Node<T> head;
  public void add(T element){
    Node <T> nd = new Node<T>();
    nd.setValue(element);
    System.out.println("Adding:" +element);
    Node<T> tmp = head;
    while(true){
      if(tmp == null) {
        head = nd;
        break;
      } else if(tmp.getNextRef() == null){
        tmp.setNextRef(nd);
        break;
      } else {
        tmp = tmp.getNextRef();
      }
    }
  }
  public void traverse(){
    Node <T> tmp = head;
    while(true){
      if(tmp == null){
        break;
      }
      System.out.print(tmp.getValue()+"\t");
      tmp = tmp.getNextRef();
    }
  }
  public void reverse() {
    System.out.println("\n reversing the linked list\n");
    Node<T> prev = null;
    Node<T> current = head;
    Node<T> next = null;
    while(current != null){
      next = current.getNextRef();
      current.setNextRef(prev);
      prev = current;
      current = next;
    }
    head = prev;
  }
  public static void main(String a[]){
    SinglyLinkedListImpl<Integer> s1 = new SinglyLinkedListImpl<Integer>();
    s1.add(3);
    s1.add(32);
    s1.add(54);
    s1.add(89);
    System.out.println();
    s1.traverse();
    System.out.println();
    s1.reverse();
    s1.traverse();
  }
}

class Node<T> implements Comparable<T> {
  private T value;
  private Node<T> nextRef;

  public T getValue() {
    return value;
  }
  public void setValue(T value) {
    this.value = value;
  }
  public Node<T> getNextRef() {
    return nextRef;
  }
  public void setNextRef(Node<T> ref) {
    this.nextRef = ref;
  }
  public int compareTo(T arg) {
    if(arg == this.value){
      return 0;
    } else {
      return 1;
    }
  }
}
