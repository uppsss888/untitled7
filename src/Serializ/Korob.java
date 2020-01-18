package Serializ;

import java.io.Serializable;
import java.util.StringJoiner;

public class Korob implements Serializable {int i;Korobochka yu;

    public Korob(int i, Korobochka yu) {
        this.i = i;
        this.yu = yu;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Korob kor=(Korob) super.clone();
        kor.yu=(Korobochka) kor.clone();
        return kor;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Korob.class.getSimpleName() + "[", "]")
                .add("i=" + i)
                .add("yu=" + yu.u)
                .toString();
    }
}
