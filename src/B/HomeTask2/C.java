package B.HomeTask2;

import java.util.Scanner;
//success
public class C {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str;
        str = scanner.next();
        int check=0;
        for(int i=0; i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                check++;
            }
        }
        System.out.println(check);
        scanner.close();
    }
}
