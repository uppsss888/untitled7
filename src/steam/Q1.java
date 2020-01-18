package steam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Q1 {
    public static void main(String[] args) {
        List<Zarpl> tr = new ArrayList<>();
        tr.add(new Zarpl(100, 200));
        tr.add(new Zarpl(1200, 2600));
        tr.add(new Zarpl(4100, 27700));
//        for (Zarpl rt : tr) {
//           rt.summ=new Vi4() {
//                @Override
//                public int f(int a, int b) {
//                    return a + b * 100;
//                }
//            }.f(rt.x, rt.y);
//
//
//        }
//        for (Zarpl frtr:
//            tr ) {
//            System.out.println(frtr.summ);
//
//        }

        System.out.println(f(tr,(q, w)->q-w));

    }
   static List<Zarpl>  f (List<Zarpl> y,Vi4 x){
        for (Zarpl t:y) {
            t.summ=x.f(t.x,t.y);
        }
        return y;
    }
}
interface Vi4{
    int f (int a,int b);
}
class Zarpl{
    int x,y,summ;

    public Zarpl(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getSumm() {
        return summ;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Zarpl.class.getSimpleName() + "[", "]")
                .add("x=" + x)
                .add("y=" + y)
                .add("summ=" + summ)
                .toString();
    }
}
