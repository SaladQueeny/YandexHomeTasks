package B.HomeTask2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int a=0, max=-10000, summ=0;
        for(int i=0; i<length;i++){
            a=scanner.nextInt();
            summ+=a;
            if(a>max){
                max=a;
            }
        }
        System.out.println(summ-max);
        scanner.close();
    }
}
