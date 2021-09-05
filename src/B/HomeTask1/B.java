package B.HomeTask1;

import java.util.Scanner;
//Success
public class B {
    public static void main(String[] args){
        int length, f, l;
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        f= scanner.nextInt();
        l= scanner.nextInt();
        int check1 = Math.abs(l-f);
        int check2 = length - check1 - 1;
        System.out.println(Math.min(check1-1,check2));
        scanner.close();
    }
}
