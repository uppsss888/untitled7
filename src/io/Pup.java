package io;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Pup {
    public static void main(String[] args) throws FileNotFoundException {
        File fil=new File("C:\\Новая папка\\yyy1.txt");
        FileInputStream fis= null;
        try {
            fis = new FileInputStream(fil);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Reader wr= null;

        try {
            wr = new InputStreamReader(fis,"cp1251");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        int x=0;
while (x!=-1){
            try {
                x=wr.read();
                char h=(char)x;
               // System.out.print(h);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        BufferedReader brr=new BufferedReader(wr);
String str=" ";
do{
        try {

            str= brr.readLine();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
} while (str!=null);

        Scanner sc = new Scanner(fil);
        String rr;
        while ((rr=sc.nextLine())!="") System.out.println(rr);



        try {
            fis.close();
            wr.close();
            brr.close();
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
