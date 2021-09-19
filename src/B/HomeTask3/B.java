package B.HomeTask3;

import java.util.*;

public class B {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Set<Integer> list = new HashSet<>();
        String str = scanner.nextLine();
        scanner = new Scanner(str);
        while(scanner.hasNextInt()){
            int a = scanner.nextInt();
            if(list.contains(a)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
                list.add(a);

            }
        }
        scanner.close();
    }
}
