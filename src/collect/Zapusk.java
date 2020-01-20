package collect;

import abcd.A;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Zapusk {
    public static void main(String[] args) {


      List <Integer> yy=new Arrayrr<>();

        yy.add(6);yy.add(6);yy.add(6);yy.add(6);yy.add(6);yy.add(6);yy.add(6);yy.add(6);
        List <Integer> yy1=new Arrayrr<>();

        yy1.add(6);yy1.add(6);
        System.out.println(yy+"do");
        yy.removeAll(yy1);


        System.out.println(yy1);
    }}
      class Box{
  int x;

        @Override
        public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;

          Box box = (Box) o;

          return x == box.x;
        }

        @Override
        public int hashCode() {
          return x;
        }

        public Box(int x) {

          this.x = x;
        }

        @Override
        public String toString() {
          return "Box{" +
                  "x=" + x +
                  '}';
        }
      }







