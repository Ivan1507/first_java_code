

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;


import javax.sound.sampled.AudioFormat;
import javax.swing.JComponent;

/**
 * A component that displays rectangles and ellipses.
 */
class animal
{
    public static void main(String[] args) throws Exception {
        Driver Ivan=new Driver(500,"Razinkin","Ivan");
        Auto BMV=new Auto("BMV","A6",200,950,2,1000,80);
        System.out.println(BMV);
        Pricep pricep=new Pricep(51);
        System.out.println(pricep);
        BMV.add_pricep(pricep);
        BMV.Model="A7";
        BMV.check_permissible_weight();
        System.out.println(BMV);
        System.out.println(Ivan);
        BMV.add_driver(Ivan);
        BMV.setMax_speed(21);
        BMV.check_current_speed();
        System.out.println(Ivan);
        System.out.println(BMV);
        Bus bus=new Bus("Audi","123m",120,1000,20,1200,50,true);
        System.out.println(bus);
    }
    public static void quicksort(int[] a,int left,int right){
         int l=left,r=right;
         int pivot=a[l+(r-l)/2];
         while(l<=r){
             while(a[l]<pivot) l++;
             while(a[r]>pivot) r--;
             if(l<=r){
                 int t=a[l];
                 a[l]=a[r];
                 a[r]=t;
                 l++;
                 r--;
             }
         }
         if(left<r)
             quicksort(a,left,r);
         if(l<right)
             quicksort(a,l,right);
}
public static void print(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
}
}
class Person
{
    public String name;
    public int age;
    public double height;
    public boolean married;

    public Person(String n, int a, double h, boolean m)
    {
        this.name=n;
        this.height=h;
        this.age=a;
        this.married=m;
    }

    @Override
    public String toString() {
        return "Person " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", married=" + married;
    }
}