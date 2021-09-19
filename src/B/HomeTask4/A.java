package B.HomeTask4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.NumberFormat;
import java.util.*;

public class A {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("src/resourses/input.txt");
        Scanner scanner = new Scanner(fileReader);
        //String stgrg = scanner.nextLine();
        int length = Integer.parseInt(scanner.nextLine());
        //System.out.println(length);
        if(length==0){
            return;
        }
        Map<Double,Double> map = new TreeMap<>();
        for(int i=0;i<length;i++){
//            String str = scanner.nextLine();
//            String[] st = str.split(" ");
//            double a = Double.parseDouble(st[0]);
//            double b = Double.parseDouble(st[1]);
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            //System.out.println(a+" "+b);
            if(map.containsKey(a)){
                map.replace(a, map.get(a)+b);
            }else{
                map.put(a,b);
            }
        }
        for (Map.Entry entry: map.entrySet()) {
            NumberFormat numberFormat = NumberFormat.getNumberInstance();
            numberFormat.setMaximumFractionDigits(0);
            numberFormat.setGroupingUsed(false);
            System.out.println(numberFormat.format(entry.getKey())+" "+numberFormat.format(entry.getValue()));
        }
    }
}
