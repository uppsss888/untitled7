package protect;

import Lambda.A1a;

import java.lang.reflect.Array;
import java.util.Objects;

public class B  {
static int cklm=9;
int b1=7;
C c1;
public int sum(int a,int b,int hju){
    return a+b;
}

    public B(int b1, C c1) {
        this.b1 = b1;
        this.c1 = c1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof B)) return false;

        B b = (B) o;

        return c1.equals(b.c1);
    }

    @Override
    public int hashCode() {
        return c1.hashCode();
    }
}
