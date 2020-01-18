package protect;

public class C{
    int x;

    public C(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof C)) return false;

        C c = (C) o;

        return x == c.x;
    }

    @Override
    public int hashCode() {
        return x;
    }
}
