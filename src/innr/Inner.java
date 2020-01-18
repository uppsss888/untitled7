package innr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class Inner {
    class Inner2 {
    }

    int x = 1;

    void a() {
        class Out {
            int x = 2;
        }
        Out rr = new Out();
        int x = rr.x;
        System.out.println(x);
    }

    public static void main(String[] args) {
        System.out.println(bbyu());
    }
    static int bbyu(){
        try {

        throw new IOException();

        }catch (IOException r){}
        return 0 ;
    }
}
class Box{
    @Override
    public String toString() {
        return new StringJoiner(", ", Box.class.getSimpleName() + "[", "]")
                .add("x=" + x)
                .toString();
    }

    public Box(int x) {
        this.x = x;
    }

    int x;
}