package z1312;

import java.io.*;
import java.util.*;
class A{
    void a(){
        System.out.println("A");
    }
}
class B extends A{

    void b(){}
}
class B1 extends B{
    void b1(){}
}
class B2 extends B{
    void b2(){}
}
public class Z1312 {
    public static void main(String[] args) {
        List <B> bb=new ArrayList<>();
        bb.add(new B());


  yyy(bb);
    }
static void yyy(List <? extends A> tt){
        for (A aa:tt){

        }
}












    static Map ta(String str) {

        File f = new File(str);
        if (f.isDirectory()) {


            File[] mas = f.listFiles();
            Map<File, Set<File>> mp = new HashMap<>();

            for (int i = 0; i < mas.length; i++) {
                mp.put(mas[i], new HashSet<>());

            }


            for (int i = 0; i < mas.length - 1; i++) {

                for (int j = i + 1; j < mas.length; j++) {

                    if (sravn(mas[i], mas[j])) {
                        mp.get(mas[i]).add(mas[j]);
                        mp.get(mas[j]).add(mas[i]);
                    }
                }
            }
            return mp;
        }
        return null;
    }
static List <RRR> sravn(List <File> ff){
        List <RRR> rrr=new ArrayList<>();
    for (int i = 0; i <ff.size() ; i++) {
        rrr.add(new RRR(ff.get(i),0));
    }

    for (int i = 0; i <ff.size()-1 ; i++) {
        for (int j = i+1; j <ff.size(); j++) {
            if (sravn(ff.get(i),ff.get(j))){
                rrr.get(i).x++;
                rrr.get(j).x++;
            }
        }
    }
    return rrr;
}
    static boolean sravn(File a1, File a2) {
        if (a1.length() == a2.length()) {

            try (InputStream fis_a1 = new BufferedInputStream(new FileInputStream(a1));
                 InputStream fis_a2 = new BufferedInputStream(new FileInputStream(a2));) {
                byte[] mas_a1 = fis_a1.readAllBytes();
                byte[] mas_a2 = fis_a2.readAllBytes();
                int sum_mas_a1 = 0;
                int sum_mas_a2 = 0;
                for (int i = 0; i < mas_a1.length; i++) {
                    sum_mas_a1 = +mas_a1[i];
                    sum_mas_a2 = +mas_a2[i];
                }

                if (sum_mas_a1 == sum_mas_a2) {
                    for (int i = 0; i < mas_a1.length; i++) {
                        if (mas_a1[i] != mas_a2[i]) return false;

                    }
                    return true;
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    static List allFiles(String str) {
        return allFiles(new File(str));
    }
    static List allFiles(File ff) {
        return allFiles( new ArrayList<>((Arrays.asList(ff.listFiles()))));
    }
    static List allFiles( List<File> qq) {



        for (int i = 0; i < qq.size(); i++) {


            if (qq.get(i).isDirectory()) {
                List <File> temp=allFiles(qq.get(i));
                qq.remove(i);
                qq.addAll(temp);
            }

        }

        return qq;
    }
    static List ffiles (String str){
        return ffiles(new File(str));
    }
    static List ffiles (File fff){
        List <File> itog=new ArrayList<>();
        List <File> direct=Arrays.asList(fff.listFiles((f)->f.isDirectory()));
        for (int i = 0; i <direct.size() ; i++) {
            ffiles(direct.get(i));
        }
        List <File> failiki =Arrays.asList(fff.listFiles((f)->f.isFile()));
        itog.addAll(failiki);
        return itog;
    }


}
class Pusk {
    static void stack() {
        Stack<Integer> stc = new Stack<>();
        Scanner sc = new Scanner(System.in);
        Map <String,Exec> mpp =new HashMap<>();
        mpp.put("push",new Push());
        mpp.put("summ",new Summ());
        mpp.put("print",new Print());


        while (true) {
            System.out.println("Введи строку ");
            String[] str = sc.nextLine().toLowerCase().split(" ");
            mpp.get(str[0]).exec(stc,str);

        }
    }
}
class RRR{
    public RRR(File f, int x) {
        this.f = f;
        this.x = x;
    }

    @Override
    public String toString() {
        return "file"+f+" вхождений"+x;
    }

    File f;
    int x;
}



