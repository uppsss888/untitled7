package uuscf;

import java.io.*;
import java.util.StringJoiner;

public class Boxik implements Cloneable,Serializable{
    int yy;//Sun su;

    public Boxik(int yy) {
        this.yy = yy;
      //  this.su = su;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
//    public Boxik(Boxik o){
//        this(o.yy,o.su);}

    @Override
    public String toString() {
        return new StringJoiner(", ", Boxik.class.getSimpleName() + "[", "]")
                .add("yy=" + yy)

                .toString();
    }
    void zapis (String str,Object o){
        FileOutputStream fis=null;
        ObjectOutputStream ois=null;
        try {
           fis=new FileOutputStream(str);
           if (fis!=null){
            ois=new ObjectOutputStream(fis);
            ois.writeObject(o);}
        } catch (FileNotFoundException e) {
            System.out.println(1);
        } catch (IOException e) {
            System.out.println(2);
        }
        finally {
            try {
                fis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    Object chten (String str){
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        Object o=null;
        try {
            fis=new FileInputStream(str);
            ois=new ObjectInputStream(fis);
            try {
                o=ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return o;
    }

}
