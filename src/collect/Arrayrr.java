package collect;



import java.util.*;

public class Arrayrr <T>implements Iterable <T>, List<T> {
    int capasity;
    T [] value;
    int lenghtM;
     final int UVELMAS=2;
final double zaolnCapas=0.8;


public Arrayrr(T [] temp){

    value= temp;

    lenghtM=temp.length;
    if (lenghtM*2<16) capasity=16; else capasity=lenghtM*2 ;
}
public Arrayrr(Collection <T> e){
    T [] value= (T[])e.toArray();
    lenghtM=e.size();
    capasity=lenghtM*2;
}
    public Arrayrr(int capasity) {
        this.capasity = capasity;
        this.value=(T[])new Object[capasity];
        lenghtM =0;

    }
    public Arrayrr() {
        this(16);
    }

    private void uvel(int dlina) {
        T[] temp;
        if (dlina / capasity >zaolnCapas){
            capasity = capasity *UVELMAS;
            temp= (T[])new Object[capasity];
            System.arraycopy(value,0,temp,0, lenghtM);
            value=temp;
        }
    }
    private boolean sravn(T t,Object o){
        return ((t!=null&&t.equals(o))||(t==null&&o==null));
    }
    @Override
    public Iterator<T> iterator() {
        return new Iteratorr<T>();
    }
    @Override
    public int size() {
        return lenghtM;
    }
    @Override
    public boolean isEmpty() {
        return (lenghtM ==0);
    }
    @Override
    public boolean contains(Object o) {
        for (T pereb:value){

            if (sravn(pereb,o)) return true;


        }
        return false;
    }
    @Override
    public T[] toArray() {
        T [] temp=(T[])new Object [lenghtM];
        System.arraycopy(value,0,temp,0, lenghtM);
        return temp;
    }
    @Override
    public T remove(int index) {
        T temp=value[index];
        System.arraycopy(value,index+1,value,index,(lenghtM--) -index);
        return temp;
    }
    @Override
    public boolean add(T o) {


        uvel(lenghtM);
        value[lenghtM++] = o;
        return true;
    }
    @Override
    public T set(int index, T element) {
        T temp=value[index];
        value[index]=element;
        return temp;
    }
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("[");

        for (int i = 0; i <lenghtM-1 ; i++) {

            sb.append(value[i]).append(", ");
        }
        sb.append(value[lenghtM-1]+"]");
        return new String(sb);
    }
    public class Iteratorr <T>implements Iterator {
        int ukaz;

        public Iteratorr() {
            this.ukaz = -1;
        }

        @Override
        public boolean hasNext() {
            return ukaz< lenghtM-1;
        }

        @Override
        public T next() {
            return (T) value[++ukaz];
        }
    }
    @Override
    public void clear() {
        value=null;
        lenghtM=0;
    }
    @Override
    public T get(int index) {
        return value[index];
    }
    @Override
    public int lastIndexOf(Object o) {
        int temp=-1;
        for (int i = 0; i <lenghtM ; i++) {
            if (sravn(value[i],o)) temp=i;
        }
        return temp;
    }
    @Override
    public int indexOf(Object o) {
        for (int i = 0; i <lenghtM ; i++) {
            try {
                if (sravn(value[i],o)) return i;
            } catch (IllegalArgumentException e) {
                return -2;
            }
        }
        return -1;
    }
    @Override
    public void add(int index, T element) {
        uvel(lenghtM);
        System.arraycopy(value,index,value,index+1, lenghtM -index);

        value[index]=(T)element;

        lenghtM++;
    }
    @Override
    public boolean remove(Object o) {

        for (int i = 0; i <value.length ; i++) {
            if (sravn(value[i],(T)o)) {
                System.arraycopy(value,i+1,value,i, lenghtM -i);

                lenghtM--;
                return true;
            }}
        return false;
    }
    @Override
    public boolean addAll(Collection <? extends T>c) {
        try{
            addAll(lenghtM,c);
        }
        catch (Throwable e){return false;}

        return true;
    }
    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        try{
            uvel(lenghtM+c.size());
            System.out.println(Arrays.toString(value));
            System.arraycopy(value,index,value,index+c.size(),lenghtM-index);

            System.out.println(Arrays.toString(value));
            for (T t: c) {
                value[index++]=t;
            }
            //System.arraycopy(c,0,value,index,c.size()-1);
            lenghtM=lenghtM+c.size();
            return true;}
        catch (Throwable e){
            return false;}
    }
    @Override
    public Arrayrr<T> subList(int fromIndex, int toIndex) {
        T [] temp=(T[])new Object[toIndex+1-fromIndex];
        System.arraycopy(value,fromIndex,temp,0,toIndex+1-fromIndex);

        Arrayrr tempArr=new Arrayrr(temp);

        return tempArr;
    }





    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }





    @Override
    public boolean containsAll(Collection c) {
        return false;
    }



    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }















    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }







}
