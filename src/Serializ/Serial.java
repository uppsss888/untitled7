package Serializ;

import java.io.*;

public class Serial {
   static boolean zapis(Object o, File f){
        boolean flag=false;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
            fos=new FileOutputStream(f);
            if (fos!=null) {
                    oos=new ObjectOutputStream(fos);
                    oos.writeObject(o);
                    flag=true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
return flag;
    }
    static Object chten(File f) {
       FileInputStream fis=null;
       ObjectInputStream ois=null;
       Object o=null;
        try {
            fis =new FileInputStream(f);
            if (fis!=null){
                ois=new ObjectInputStream(fis);
                try {
                    o=ois.readObject();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return o;
    }
}
