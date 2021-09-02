package B.HomeTask1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Success
public class E {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> vectors = new HashMap<>();
        int d, x0,y0, x1,x2,x3,y1,y2,y3,z1,z2,z3;
        d = scanner.nextInt();
        x0 = scanner.nextInt();
        y0 = scanner.nextInt();
        x1=0; y1=0; x2=d; y2=0; x3=0; y3=d;
        z1 = (x1 - x0)*(y2 - y1) - (x2-x1)*(y1-y0);
        z2 = (x2 - x0)*(y3 - y2) - (x3-x2)*(y2-y0);
        z3 = (x3 - x0)*(y1 - y3) - (x1-x3)*(y3-y0);
        vectors.put(z1,"A");
        vectors.put(z2,"B");
        vectors.put(z3,"C");
        //System.out.println(z1+" "+z2+" "+z3);
        if (((x0 == x1) && (y0 == y1))||((x0 == x2) && (y0 == y2))||((x0 == x2) && (y0 == y2))||(((z1 >= 0) && (z2 >= 0) && (z3 >= 0)) || ((z1 <= 0) && (z2 <= 0) && (z3 <= 0)))) {
            System.out.println("0");
            return;
        }
        else {
            double r1 = Math.sqrt(Math.pow(x1-x0,2)+Math.pow(y1-y0,2)),r2= Math.sqrt(Math.pow(x2-x0,2)+Math.pow(y2-y0,2)),r3= Math.sqrt(Math.pow(x3-x0,2)+Math.pow(y3-y0,2));
            //System.out.println(r1+" "+r2+" "+r3);
            double min = Math.min(Math.abs(r1),Math.abs(r2));
            min = Math.min(min, Math.abs(r3));
            //System.out.println(min);
            if(min==r1&&(r1==r2||r1==r3)){
                System.out.println("1");
                return;
            }
            if(min==r2&&(r2==r3)){
                System.out.println("2");
                return;
            }
            if(min==r1&&(r1!=r2||r1!=r3)){
                System.out.println("1");
                return;
            }
            if(min==r2&&(r1!=r2||r2!=r3)){
                System.out.println("2");
                return;
            }
            if(min ==r3&&(r3!=r2||r1!=r3)){
                System.out.println("3");
                return;
            }

        }
    }
}
