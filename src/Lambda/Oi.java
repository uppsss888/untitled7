package Lambda;

import java.util.StringJoiner;

public interface Oi <T>{
    T ff(T per1,T per2);
}
class Node {
     Integer a,b,c;

    public Node(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Node.class.getSimpleName() + "[", "]")
                .add("a=" + a)
                .add("b=" + b)
                .add("c=" + c)
                .toString();
    }
}
