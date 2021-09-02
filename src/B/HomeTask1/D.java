package B.HomeTask1;

import java.util.ArrayList;
import java.util.Scanner;
//Success
public class D {
    public static void main(String[] args){
        int length, a;
        ArrayList<Integer> pupils = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        for(int i=0; i<length;i++){
            a = scanner.nextInt();
            pupils.add(a);
        }


        System.out.println(pupils.get(length/2));


    }
}
