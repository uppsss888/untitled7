package Reffl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Refl {
    int x,y;

    public Refl(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static public void a(){
        System.out.println("A");
    }
    static public void b(){
        System.out.println("B");
    }
     public void c(){
        System.out.println(x+y);
    }
}
class Pusk{
    public static void main(String[] args) {
        Class cl=Refl.class;
        Method [] m=cl.getDeclaredMethods();
        System.out.println(m.length);
        Refl a1=new Refl(3,10);
        Refl a2=new Refl(100,100);
        try {

            for (Method mw: m) {mw.invoke(a1);
                System.out.println(mw.toString());
                Refl u=(Refl)mw.getDeclaringClass().newInstance();
                System.out.println("");
            }

        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
