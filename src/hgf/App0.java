package hgf;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.mismatch;

public class App0 {
    public static void main(String[] args) {
        byte []mas={4,3,0,0,0,0,6};
        ByteArrayOutputStream bs=filtr(mas,(i)->i>4);
        System.out.println(Arrays.toString( bs.toByteArray()));
           }
        static ByteArrayOutputStream filtr(byte [] bb,Ff temp){
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        int start,end;
            for (int i = 0; i <bb.length ; i++) {
                while (i<bb.length && !temp.bl(bb[i]) )
                i++;
                start=i;
                while (i<bb.length && temp.bl(bb[i])   )
                  i++;
                end=i          ;
                baos.write(bb,start,end-start);
            }

        return baos;

        }



    static ByteArrayOutputStream filtr1(byte [] bb){
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        boolean start=true,end=false;

        for (int i = 0; i <bb.length ; i++) {
            if (bb[i]==0){start=!start;

            }
//            else{if (!end) baos. }

        }





        return baos;
    }
};
interface Ff{
    boolean bl (int i);
}