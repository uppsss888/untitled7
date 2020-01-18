package points;

import java.util.*;
 interface  Matem{
    int sum(int a,int b);
//    int uvel (int a);
}
public class Point {
    int x,y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }



    @Override
    public String toString() {
        return new StringJoiner(", ", Point.class.getSimpleName() + "[", "]")
                .add("x=" + x)
                .add("y=" + y)
                .toString();
    }
}

class P{
    public static void main(String[] args) {
        List lt=new ArrayList();
        for (int i = 0; i <20 ; i++) {
            lt.add(new Point(i*2,1000/(i+1)));
        }
        Collections.sort(lt,(o1,o2)-> ((Point)o1).y-((Point)o2).y

        );
        System.out.println(lt);




        uy(5,(q,w)->q+w);
    }
    static  int uy(int i,Matem temp){
        return  temp.sum(i,i+5);

    }
}

