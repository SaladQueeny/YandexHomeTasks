package B.HomeTask3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A {
    public static void main(String[] args) throws FileNotFoundException {
        //FileReader fileReader = new FileReader("input.txt");
        Set<Integer> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String[] str=new String[2];
        str[0]= scanner.nextLine();
        str[1]= scanner.nextLine();
        scanner = new Scanner(str[0]);
        while(scanner.hasNextInt()){
            set.add(scanner.nextInt());
        }
        scanner = new Scanner(str[1]);
        int check=0;
        while(scanner.hasNextInt()){
            int a = scanner.nextInt();
            if(set.contains(a)){
                check++;
            }
        }
        System.out.println(check);

    }
}
