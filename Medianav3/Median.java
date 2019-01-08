package moje.mybox.mediana;

import java.util.Arrays;

public class Median {
    public static void getNumber(){

    }

    public double getMedian(double ... d) {
        Arrays.sort(d);
        for (double x: d){
            System.out.print(x+" ");
        }
        System.out.println();
        int size = d.length;
        if (size%2==0){
          return   (d[(size/2)-1]+d[(size/2)])/2;
        } else return d[size/2];
    }

    public static void main(String[] args) {
        Median median = new Median();
        System.out.println(median.getMedian(-1,-2,-4.9,-5.5,-8,-10));
    }
}
