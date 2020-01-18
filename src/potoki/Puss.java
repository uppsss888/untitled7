package potoki;

import java.util.Scanner;

public class Puss {
    public static void main(String[] args) throws InterruptedException {
Thread mai=Thread.currentThread();
Thread th1=new Rt(9,mai);
Thread th2=new Rt(6,mai);

        th1.start();
        th2.start();
        while (true) System.out.println("main");

    }




}
    class uu implements Runnable{
    String name;
private boolean temp=false;
        public uu(String name) {
            this.name = name;
        }
public void stop1(){temp=true;}
        @Override
        public void run() {
            while (true) {
                if (temp) {
                    try {
                        Thread.sleep(1000);
                        temp=false;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            System.out.println(name);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    class Rt extends Thread{
Thread thr;

        public Rt(int prioritet,Thread thr) {
            this.setPriority(prioritet);
this.thr=thr;
        }
        public Rt(int prioritet) {
            this.setPriority(prioritet);
            
        }

        int temp=0;
        @Override
        public void run() {
            while (true) {
                temp++;
                if (temp % 100000 == 0) {
                    System.out.println(this.getName() + " " +Thread.currentThread().getName());
                    thr.stop();

                }
            }
        }}
        class A extends Thread{
    A temp;

            public A() {
                super("nn");
                temp = new A();

            }
        }