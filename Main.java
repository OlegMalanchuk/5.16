import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

//        1)***

//        int a ;
//        for (int i = 0; i < 50; i++) {
//            a = (int)(Math.random()*40-21);
//            System.out.println(a);
//        }

//        ***

//        2)***

//        Scanner input = new Scanner(System.in);
//        double a , b , c;
//        System.out.print("катет а = ");
//        if (input.hasNextDouble()) {
//            a = input.nextDouble();
//            System.out.print("катет b = ");
//            if (input.hasNextDouble()) {
//                b = input.nextDouble();
//                c = Math.sqrt((Math.pow(a,2)+Math.pow(b,2)));
//                System.out.println("гіпотенуз  = "+c);
//                if(((a+b)>c)&&((a+c)>b)&&((c+b)>a)){
//                    double per , sum ;
//                    per = a+b+c;
//                    sum = 0.5*a*b;
//                    System.out.println("переметр = "+per);
//                    System.out.println("площа = "+sum);
//                }
//            } else {System.out.println("не дробове");}
//        }else {System.out.println("не дробове");}

//        ***

//        3)***

//        int numRand, res, a ,b,c;
//        numRand = (int)(Math.random()*101);
//        System.out.println(numRand);
//        if (numRand <= 9) {
//
//            res = 1;
//            System.out.println(numRand);
//            System.out.println(res);
//        }
//
//        if (numRand<=99){
//            a = numRand /10;
//            b = numRand  %10;
//            res = 2;
//            System.out.println(a);
//            System.out.println(b);
//            System.out.println(res);
//
//        }
//        else{
//            a = numRand / 100;
//            b = numRand /10%10;
//            c = numRand %10;
//            res = 3;
//            System.out.println(a);
//            System.out.println(b);
//            System.out.println(c);
//            System.out.println(res);
//        }


//        4)***

//        Scanner input = new Scanner(System.in);
//        int mine[]= new int[3];
//        int lottery[] = new int [3];
//
//        for (int i = 0; i <3; i++) {
//            lottery[i] = (int) (Math.random() * 3);
//            System.out.print("["+lottery[i]+"]");
//        }
//        System.out.println(" ");
//        int attempt = 0; //спроба
//        if (attempt <2 ){
//            for (int i = 0; i < 3; i++) {
//                System.out.print("твоє число = ");
//                int yourNum = input.nextInt();
//                mine[i]= yourNum;
//            }
//            if (Arrays.equals(lottery,mine)){
//                System.out.println("ти виграв");
//            }
//            else {
//                attempt++;
//                System.out.println("спробуй ше раз )");
//                for (int i = 0; i < 3; i++) {
//                    System.out.print("твоє число = ");
//                    int yourNum = input.nextInt();
//                    mine[i]= yourNum;
//                }
//                if (Arrays.equals(lottery,mine)){
//                    System.out.println("ти виграв");
//                }
//                else {
//                    attempt++;
//                    System.out.println("не повезло в лотереї повезе беха в бахмут");
//
//                }
//            }
//        }

//         ***






















    }
}