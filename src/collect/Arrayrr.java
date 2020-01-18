package collect;

import java.util.*;

public class Arrayrr <T>implements Iterable <T>, List<T> {
    int capasity;
    T [] value;
    int lenghtM;
    static final int UVELMAS=2;





    public Arrayrr(int capasity) {
        this.capasity = capasity;
        this.value=(T[])new Object[capasity];
        lenghtM =0;

    }
    public Arrayrr() {
        this(16);
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
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(T o) {

try{
    uvel();
    value[lenghtM++]=o;

}
   catch (Throwable e)    {return false;}
return false;

    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i <value.length ; i++) {
            if ((value[i]!=null&&value[i].equals(o))||(value[i]==null&&o==null)) System.arraycopy(value,i+1,value,i, lenghtM -i);
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection <? extends T>c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
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
    public void clear() {
value=null;
    }

    @Override
    public T get(int index) {
        return value[index];
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, T element) {
        uvel();
System.arraycopy(value,index,value,index+1, lenghtM -index);
try {
    value[index]=(T)element;
}
catch (IllegalArgumentException e){}
lenghtM++;
    }

    @Override
    public T remove(int index) {
        T temp=value[index];
        System.arraycopy(value,index+1,value,index,lenghtM-index);
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
    public int lastIndexOf(Object o) {
        int temp=-1;
        for (int i = 0; i <lenghtM ; i++) {
            if (sravn(value[i],o)) temp=i;
        }
return temp;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }
    private void uvel() {
        T[] temp;
        if (lenghtM / capasity >0.8){
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
            this.ukaz = 0;
        }

        @Override
        public boolean hasNext() {
             return ukaz< lenghtM;
        }

        @Override
        public T next() {
            return (T) value[++ukaz];
        }
    }
}
