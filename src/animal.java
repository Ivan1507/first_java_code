import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class animal {
    public static void main(String[] args){
        int left=1;
        int right=100;
        while(left<right) {
            int middle=(left+right)/2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Your number > "+middle+"?"+"(1/0)");
            int q = sc.nextInt();
            if(q==1)
                left=middle+1;
            else if(q==0)
                right=middle;
            else System.out.println("Enter 1 or 0");
        }
        System.out.println("Your number is "+right);
    }
    public static String arr(){
        return "xuy v rot";
    }
}
