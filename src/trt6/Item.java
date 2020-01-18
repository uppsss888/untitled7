package trt6;

import java.util.Iterator;

public class Item   {
    public static void main(String[] args) {
Tem<String> mas=new Tem<>();

        for (int i = 0; i <10 ; i++) {
            mas.addd("de"+i);
        }
        for (int i = 0; i <10 ; i++) {
            System.out.println(mas.get(i));
        }
//        for (int i = 0; i <10 ; i++) {
//            System.out.println(mas.temp[i]);
//        }


    }

}
class Tem<T>{
     int ukaz;
     int capas;
  public    T [] temp;
    Tem(){this(10);}
    Tem(int capas){
        this.capas=capas;
     temp=(T[])new Object[capas];
        ukaz=0;
    }
    void vivod(){
        for (T tt: temp) {
            System.out.println(tt);
        }

    }
    void addd(T zz){
        temp[ukaz++]=zz;
    }
    T get(int i){
        return temp[i];
    }




}

