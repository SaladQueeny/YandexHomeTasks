package B.HomeTask4;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
//success
public class A {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/resourses/input.txt");
        Scanner scanner = new Scanner(fileReader);
        int length = Integer.parseInt(scanner.nextLine());
        if(length==0){
            return;
        }
        Map<Long,Long> map = new TreeMap<>();
        for(int i=0;i<length;i++){
            String[] nums = scanner.nextLine().split(" ");
            long a = Long.parseLong(nums[0]);
            long b = Long.parseLong(nums[1]);

            if(map.containsKey(a)){
                map.replace(a, map.get(a)+b);
            }else{
                map.put(a,b);
            }
        }
        scanner.close();
        fileReader.close();

        for (Map.Entry entry: map.entrySet()) {
            //System.out.println(numberFormat.format(entry.getKey())+" "+numberFormat.format(entry.getValue()));
            System.out.println((entry.getKey())+" "+(entry.getValue()));

        }
    }
}
