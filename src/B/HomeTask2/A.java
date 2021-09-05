package B.HomeTask2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//success
public class A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int a, max=-1, check=1;
        while(true){
            a = scanner.nextInt();
            if(a!=0){
                if(a>max){
                    max = a;
                    check=1;
                } else if(a==max){
                    check++;
                }
                list.add(a);
            } else{
                break;
            }
        }

        System.out.println(check);
        scanner.close();
    }
}
