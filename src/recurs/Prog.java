package recurs;

import java.util.Arrays;

public class Prog {
    void variant (int []mas){
        variant(mas, mas.length);
    }
    void variant (int []mas,int dlina){
        if (dlina<2)
        {
            System.out.println(Arrays.toString(mas));
            swap(mas);
        }
        else {

        }


    }
    void swap(int[]mas){
        int temp=mas[0];
        mas[0]=mas[1];
        mas[1]=temp;
    }

}
