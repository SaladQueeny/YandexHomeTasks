package B.HomeTask3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        int max =Integer.parseInt(scanner.nextLine());
        for(int i=1;i<=max;i++){
            set.add(i);
        }
        while(true){
            String str = scanner.nextLine();
            if(str.equals("HELP")){
                break;
            }
            String[] nums = str.split(" ");
            String answer = scanner.nextLine();
            set1.clear();
            for(int i=0;i< nums.length;i++){
                set1.add(Integer.parseInt(nums[i]));
            }
            if(answer.equals("YES")){

                set.retainAll(set1);
            }
            if(answer.equals("NO")){

                set.removeAll(set1);
            }
        }
        for(int a :set){
            System.out.print(a+" ");
        }

    }
}
