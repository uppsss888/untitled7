import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Boy {
    public static void main(String[] args) {
        List<Porson> uu = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            uu.add(new Porson(i, "ttt" + i));
        }
        int [] mas={4,5,6,76,7,87,34};
        for (int tt: mas) {
            int i=0;
            mas[i++]=tt*i;
        }
        for (Porson ok: uu) {
            ok.y=ok.x+5555;
        }

         System.out.println( ff(uu,p->p.x>5));
         System.out.println( uu);

    }

    static <T extends Porson,Y> List<T> ff(List<T> jiji, Predicate<T> pr){
         return jiji.stream().filter(pr).collect(Collectors.toList());

    }
}


class Porson{

    int x,y;
   String s;

    public Porson(int x, String s) {
        this.x = x;
        this.s = s;

    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Porson.class.getSimpleName() + "[", "]")
                .add("x=" + x)
                .add("y=" + y)
                .add("s='" + s + "'")
                .toString();
    }
}
