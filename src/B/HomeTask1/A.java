package B.HomeTask1;

import java.util.Scanner;
//Success
public class A {
    public static void main(String[] args){
        int code, inter, checker;
        Scanner scanner = new Scanner(System.in);
        code = scanner.nextInt();
        inter = scanner.nextInt();
        checker= scanner.nextInt();
        if(inter==0&&code!=0){
            System.out.println("3");
            return ;
        } else if(inter==0&&code==0){
            System.out.println(checker);
            return ;
        } else if(inter==1){
            System.out.println(checker);
            return ;
        } else if(inter==4&&code!=0){
            System.out.println("3");
            return ;
        } else if(inter==4&&code==0){
            System.out.println("4");
            return ;
        } else if(inter==6){
            System.out.println("0");
            return ;
        } else if(inter==7){
            System.out.println("1");
            return ;
        } else{
            System.out.println(inter);
        }
        scanner.close();

    }
}
