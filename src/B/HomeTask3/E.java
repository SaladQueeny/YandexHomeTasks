package B.HomeTask3;

import java.util.*;

public class E {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Set<Character>> list1 = new ArrayList<>();
        //Map<String, Integer> map = new LinkedHashMap<>();
        List<String> listName = new ArrayList<>();
        List<Integer> listNum = new ArrayList<>();
        int a = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<a; i++){
            Set<Character> set1 = new HashSet<>();
            String str = scanner.nextLine();
            for(int j=0; j<str.length();j++){
                set1.add(str.charAt(j));
            }
            list1.add(set1);
        }
        int b=Integer.parseInt(scanner.nextLine());
        int max=-1000000;
        for(int i=0; i<b; i++){
            String str = scanner.nextLine();
            Set<Character> num = new HashSet<>();
            for(int j=0; j<str.length();j++){
                num.add(str.charAt(j));
            }
            //list2.add(str);
            int w=0;
            for(int j=0; j<list1.size();j++){
                Set<Character> setretain = new HashSet<>(num);
                setretain.retainAll(list1.get(j));
                if(setretain.size()== list1.get(j).size()){
                    w++;
                }
            }
            //System.out.println(str+" "+w);
            listName.add(str);
            listNum.add(w);
            //map.put(str, w);
            if(w>max){
                max=w;
            }
        }
        //System.out.println("max:"+max);
//        for(Map.Entry<String, Integer> entry : map.entrySet()){
//            if(entry.getValue()==max){
//                System.out.println(entry.getKey());
//            }
//
//        }
        for(int i=0; i< listName.size(); i++){
            if(listNum.get(i)==max){
                System.out.println(listName.get(i));
            }
        }
    }
}
