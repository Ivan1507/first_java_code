
/**
 * Класс продукции со свойствами <b>maker</b> и <b>price</b>.
 * @autor 123
 * @version 2.1
 */
import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;

public class animal extends IOException {
    public String Name;

    public static void main(String[] args){
        int left=1;
        int right=100;

        int[] mas={45,678,123,89,1,107};
        Properties pr=new Properties();
        pr.setProperty("Hello","Privet");
        Arrays.sort(mas);
        animal an=new animal();
        an.Name="Vasya";
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        double m=0;
        double sm=0;
        boolean f=false;
        while(!f) {
            System.out.println("Введите длину в метрах");
            m=sc.nextInt();
            System.out.println("Введите длину в сантиметрах");
            sm=sc.nextInt();
            try {
                if (m < 0 || sm < 0)
                    throw new IOException("Длина не может быть отрицательной!");
                f = true;
            } catch (IOException exc) {
                System.out.println(exc.getMessage());
            }
        }
        double feet=0;
        double dm=0;
        sm+=m*100;
        sm=sm/2.54;
        dm=sm;
        feet=(int)(dm/12);
        dm-=feet*12;
        System.out.println("Высота составляет "+feet+" фут и "+dm+" инчей");

    }
    static boolean check(String s){
        try{
            Integer.parseInt(s);
        }
        catch (Exception ex){
            return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void reverse(int[] mas, int l){
        for(int i=0;i<l/2;i++){
            int t=mas[l-i-1];
            mas[l-i-1]=mas[i];
            mas[i]=t;
        }
    }
}
