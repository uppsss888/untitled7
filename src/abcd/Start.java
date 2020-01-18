package abcd;


import java.lang.reflect.Array;
import java.util.*;

public class Start {
    public static void main(String[] args) {
        Box1 box=new Box1(1,1);
       new Thread(()->box.slogX(10,5,100)).start();
       new Thread(()->box.slogY(10,3,100)).start();
       new Thread(()->box.umnogX(10,1,100)).start();
       new Thread(()->box.umnogY(10,-1,100)).start();




    }
}




class Box1 {
    int x;
    int y;
Object obX =new Object();
Object obY =new Object();
    public Box1(int x,int y) {
        this.x = x;
        this.y = y;
    }
    void slogX(int kol,int value,int time){
        synchronized (obX){for (int i = 0; i <kol ; i++) {
            x=x+value;
            System.out.println(x+"  "+"slogX");
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }}
    }
       void slogY(int kol,int value,int time){
           synchronized (obY){for (int i = 0; i <kol ; i++) {
            y=y+value;
            System.out.println(y+"  "+"slogY");
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }}
    }
   void umnogX (int kol,int value,int time){
       synchronized (obX){for (int i = 0; i <kol ; i++) {
           x=x*value;
           System.out.println(x+"  "+"umnogX");
           try {
               Thread.sleep(time);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }}
   }
     void umnogY (int kol,int value,int time){
         synchronized (obY){ for (int i = 0; i <kol ; i++) {
            y=y*value;
            System.out.println(x+"  "+"umnogY");
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }}
}
