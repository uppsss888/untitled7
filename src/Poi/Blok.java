package Poi;

import java.util.StringJoiner;

public class Blok {
    int x=5;

    @Override
    public String toString() {
        return new StringJoiner(", ", Blok.class.getSimpleName() + "[", "]")
                .add("x=" + x)
                .toString();
    }
}
