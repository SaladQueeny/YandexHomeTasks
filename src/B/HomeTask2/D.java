package B.HomeTask2;

import java.util.*;
//success
public class D {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length, count;
        List<Integer> blocks = new ArrayList<>();
        length = scanner.nextInt();
        count = scanner.nextInt();
        for(int i=0; i<count;i++){
            blocks.add(scanner.nextInt());
        }
        if(length%2==1&& blocks.contains(length/2)){
            System.out.println(length/2);
            return;
        }
        List<Integer> list = new ArrayList<>(count);
        for(int i=0; i<count;i++){
            list.add(length/2- blocks.get(i));
        }

        int min11 = 111111111, min22 = -100000;
        for(int i=0 ; i<count;i++){
            //System.out.println(list.get(i));
            if(list.get(i)>0&&list.get(i)<min11){
                min11=list.get(i);
            }
            if(list.get(i)<=0&&list.get(i)>min22){
                min22=list.get(i);
            }
        }
        //System.out.println(min11+" "+min22);
        System.out.println(blocks.get(list.indexOf(min11))+" "+blocks.get(list.indexOf(min22)));


        scanner.close();
    }
}
