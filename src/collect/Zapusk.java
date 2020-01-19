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
      List <Integer> yy=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            yy.add(i);
        }
        List <Integer> yy1=new ArrayList<>();
        for (int i = 16; i <17 ; i++) {
            yy.add(i);
        }
        System.out.println(yy.removeAll(yy1));
        System.out.println(yy);
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







