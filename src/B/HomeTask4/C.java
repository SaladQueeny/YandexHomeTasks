package B.HomeTask4;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
//success
public class C {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src\\resourses\\input.txt");
        Scanner scanner = new Scanner(fileReader);
        Map<String, Integer> map = new TreeMap<>();
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] words = line.split(" ");
            for(String word : words){
                if(map.containsKey(word)){
                    map.replace(word, map.get(word)+1);
                } else{
                    map.put(word, 1);
                }
            }
        }
        scanner.close();
        fileReader.close();
//        //сортировка map для вывода
//        map.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .forEach(System.out::println);
//        //если нужно записать отсортированную мапу в новую
//        Map<String, Integer> orderedMap = map.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue())
//                .collect(LinkedHashMap::new,
//                        (m, c) -> m.put(c.getKey(), c.getValue()),
//                        LinkedHashMap::putAll);
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(e -> System.out.println(e.getKey()));
    }
}
