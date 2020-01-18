package inp;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;

public class Inp {
    void pech(String str) throws IOException {
        File file=new File(str);
        int size=1024*8;
        int razm;
//        Charset charset=new Charset()
        Reader reader=new BufferedReader(new FileReader(file,Charset.forName("cp1251")),size);
        char [] b1=new char[size];
        while (   (razm=reader.read(b1)  )!=-1   ){
String yy=new String(b1).substring(0,razm);
            System.out.println(yy.length());
            System.out.println(yy);}

    }

       void pech1(String str) throws IOException {
        File file=new File(str);

        int razm;
//        Charset charset=new Charset()

        Reader reader= new FileReader(file, Charset.forName("cp1251"));

        int ch;
        while (   (ch=reader.read()  )!=-1   ){
            System.out.print((char)ch);
        }

    }
    void pech2(String str) throws IOException {
        File file=new File(str);

int razmer=1024*8;
InputStream is=new BufferedInputStream(System.in,razmer);
is.read();
byte [] br=new byte[razmer];
int size;
while ((size=is.read(br))!=-1) {
    String str1=new String(br).substring(0,size);
    System.out.println(str1);
}
}



//        Scanner sc=new Scanner(new FileReader(file,Charset.forName("cp1251")));
//        while (sc.hasNextLine()) {
//            System.out.println(sc.nextLine());
        }


class Pp{
    public static void main(String[] args) throws IOException {
        new Inp().pech2("C:\\Новая папка\\yyy.txt");
    }
}
