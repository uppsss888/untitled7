package Serializ;

import java.io.File;

public class Zapusk {
    public static void main(String[] args) {
        File fi=new File("C:\\tt\\rr.txt");
        Korob kr=new Korob(5,new Korobochka(5));
        System.out.println(Serial.zapis(kr,fi));
kr.yu.u=10;
Korob kr1=(Korob) Serial.chten(fi);
        System.out.println(kr);
        System.out.println(kr1);

    }
}
