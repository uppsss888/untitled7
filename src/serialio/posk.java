package serialio;

import java.io.*;
import java.util.Arrays;

public class posk {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        byte [] bt=new byte[1000000];
        for (int i = 0; i <bt.length ; i++) {
            bt[i]=(byte) i;

        }
        copys(new ByteArrayInputStream(bt),new FileOutputStream("C:\\tt\\z.txt"));


    }

    static void copys (InputStream is,OutputStream os) throws IOException {
byte [] temp=new byte[8000];
        int b;long start,end;
        start =System.nanoTime();
//        while ((b=is.read())!=-1);
//        os.write(b);

        is.read(temp);
        os.write(temp);

        end=System.nanoTime();
        System.out.println(end-start);
}
}
