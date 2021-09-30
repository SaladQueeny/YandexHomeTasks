package B.HomeTask4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("src/resourses/input.txt");
        Scanner scanner = new Scanner(fileReader);
        Map<String, Integer> inp = new HashMap<>();
        double sum=0;
        while(scanner.hasNextLine()){
            String[] vals = scanner.nextLine().split(" ");
            inp.put(vals[0], Integer.parseInt(vals[1]));
            sum+=Integer.parseInt(vals[1]);
        }
        sum/=450.0;
        System.out.println(sum);
        int reserved =0;
        for(Map.Entry entry: inp.entrySet()){
//            double check = Double.parseDouble(String.valueOf(entry.getValue()))/sum;
            reserved += (int)entry.getValue()/(double)sum;
            //inp.replace((String) entry.getKey(), (Integer) entry.getValue()/sum);
            int c= (int) entry.getValue();
            System.out.println(c/sum);
        }
        System.out.println(inp);

    }
}
