package Poi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pmpm {
    public static void main(String[] args) {
        List li=null;
        try {
            try {
                try {
                    li= (List) Class.forName(new Scanner(new File("C:\\tt\\rr.txt")).nextLine()).newInstance();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        Class cv=Blok.class;
        Blok o=null;
        try {
              o = (Blok) cv.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(li.getClass().getName());
    }
}
