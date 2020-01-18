package protect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Vh {


    public static void main(String[] args)  {
B b=new B(4,new C(56));
  Class c1=b.getClass();
  Field [] fl=c1.getFields();
       Method [] m=c1.getMethods();
        for (Method med:
            m ) {
            System.out.println(med);
            System.out.println( m[2].getParameterCount());
            try {
               B c2=(B) c1.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }

        System.out.println(Arrays.toString(fl));
    }
}
