package B.HomeTask1;

import java.util.Scanner;
//success
public class C {
    public static void main(String[] args){
        int f, s, year;
        Scanner scanner = new Scanner(System.in);
        f= scanner.nextInt();
        s= scanner.nextInt();
        year= scanner.nextInt();
//        if(f==s){
//            System.out.println(1);
//            return;
//        }
//        if(year<=2069&&year>=1970){
//            if(f>12&&f<=31&&s>12&&s<=31){
//                System.out.println(0);
//            } else if(f<=12&&s<=12){
//                System.out.println(0);
//            } else if((f>12&&s<=12)||(f<=12&&s>12)){
//                System.out.println(1);
//            }
//        } else{
//            System.out.println(0);
//        }
        if(f>12||s>12||f==s){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        scanner.close();
    }
}
