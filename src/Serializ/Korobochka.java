package Serializ;

import java.io.Serializable;

public class Korobochka implements Serializable {
    int u;

    public Korobochka(int u) {
        this.u = u;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
