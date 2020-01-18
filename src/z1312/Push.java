package z1312;

import java.util.Stack;

public class Push implements Exec {
    @Override
    public void exec(Stack tt,String [] str) {
        tt.push(Integer.parseInt(str[1]));



    }
}
