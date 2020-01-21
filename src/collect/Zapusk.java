package collect;

import abcd.A;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.*;

public class Zapusk {
    public static void main(String[] args) {
        Map yy = fff(1000, 6);


    }
    static Map<String, Rez> fff(int slov, int bukvMax) {
        int razm=(int) (slov * 1.2);
        Set <String>stt = new HashSet<>(razm);
        Random rnd = new Random();

        for (int i = 0; i < slov; i++) {
            int bukva=rnd.nextInt(bukvMax);
            if (bukva<4) bukva=(bukva+4)*2;
            char [] ch=new char[bukva];
            for (int j = 0; j <bukva ; j++) {
                ch[j]=(char) rnd.nextInt(20);
            }
            stt.add(new String(ch));
        }
        Map <String,Rez> mp=new HashMap<>(razm);
      for (String slovo:stt){

          Set <String> spisRezult=new HashSet<>();
          int s4et4ik=0;

          for (String slovosr:stt){

              if ( anagr(slovo)  .equals(anagr(slovosr))) {spisRezult.add(slovosr);s4et4ik++;}
          }
          Rez temp=new Rez(spisRezult,s4et4ik);
          mp.put(slovo,temp);
          System.out.print(slov+"слово  ");
          temp.spisok.stream().forEach((x)-> System.out.print(x));
          System.out.print("   количество"+temp.kolichestvo);
          System.out.println();

      }
        return mp;
    }
    static String anagr(String str){
        char [] ch=str.toCharArray();
       Arrays.sort(ch);
        return new String(ch);
}

}

class Box {
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

class Rez <T> {
    Set<T> spisok;
    int kolichestvo;

    public Rez(Set<T> spisok, int kolichestvo) {
        this.spisok = spisok;
        this.kolichestvo = kolichestvo;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Rez.class.getSimpleName() + "[", "]")
                .add("spisok=" + spisok)
                .add("kolichestvo=" + kolichestvo)
                .toString();
    }
}







