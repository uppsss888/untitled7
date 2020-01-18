package Lambda;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Ouy {
    public static void main(String[] args) {
        List<Node> mas =new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            mas.add(new Node(i+14,i*2));
             }
      //  Oi<Integer> tr=(a,b)->a+b;
        zapoln(mas, (a,b)->0);
        System.out.println(mas);

        System.out.println(new Integer(600).equals(new Integer(600)));
Integer s=new Integer(500);
Integer s1=new Integer(500);


        System.out.println(s==s1);
        Set<Integer> po=new HashSet<>();
        po.add(new Integer(500));
        po.add(new Integer(500));

        po.add(500);
        System.out.println(po);
    }
    static List<Node> zapoln(List <Node>lu,Oi <Integer>oi){
        //oi=(a,b)->a+b;
        for (Node yh:lu) {
            yh.c=oi.ff(yh.a,yh.b);
        }
        return lu;};

}
