package B.HomeTask3;

import java.util.*;

public class C {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> map = new LinkedHashMap<>();
        String str = scanner.nextLine();
        scanner = new Scanner(str);
        while(scanner.hasNextInt()){
            int a = scanner.nextInt();
            if(map.containsKey(a)){
                map.replace(a,map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }

        for(int a: map.keySet()){
            if(map.get(a)==1) {
                System.out.println(a);
            }
        }
    }
}
