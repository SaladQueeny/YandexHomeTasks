package B.HomeTask2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//success
public class B {
    public static void main(String[] args){
        List<Integer> houses = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<10; i++){
            houses.add(scanner.nextInt());
        }
        int max_distance=-100000, dist=0;
        for(int i=0; i<10;i++){
            if(houses.get(i)==1){
                int min_for_current=1000;
                for(int j=0; j<10;j++){
                    if(houses.get(j)==2){
                        dist=Math.abs(i-j);

                        if(min_for_current>dist){
                            min_for_current=dist;
                        }
                    }
                }

                if(min_for_current>max_distance){
                    max_distance=min_for_current;
                }
            }
        }
        System.out.println(max_distance);

        scanner.close();
    }
}
