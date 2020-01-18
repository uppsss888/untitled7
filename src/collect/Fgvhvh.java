package collect;

public class Fgvhvh {
    public static void main(String[] args) {


}}
 class  Node <E>{
     public Node(E value, Node<E> prev, Node<E> next) {
         this.value = value;
         this.prev = prev;
         this.next = next;
     }

     E value;
     Node<E> prev;
     Node<E> next;
 }
 class Link<E>{
     int lenght;
    Node <E> nodStart;
     Node <E> nodEnd;


     public Link() {
         this.lenght = 0;
         this.nodStart = new Node<>(null,null,nodEnd);
         this.nodEnd = new Node<>(null,nodStart,null);
     }



     void add(E temp){
//nodEnd.next=new Node(E,nodEnd,null);
nodEnd=nodEnd.next;
lenght++;
     }
 }
