package B.HomeTask4;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
//success
public class B {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/resourses/input.txt");
        Scanner scanner = new Scanner(fileReader);
        Map<String, Integer> map = new TreeMap<>();
        while(scanner.hasNextLine()){
            String[] values = scanner.nextLine().split(" ");
            if(map.containsKey(values[0])){
                map.replace(values[0], map.get(values[0])+Integer.parseInt(values[1]));
            }else{
                map.put(values[0], Integer.parseInt(values[1]));
            }
        }
        scanner.close();
        fileReader.close();
        //System.out.println(map);
        map.entrySet().stream().forEach(e -> System.out.println(e.getKey()+" "+e.getValue()));
    }
}
