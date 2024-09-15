package Sept9th;

import java.time.Clock;

public class lab009 {

    public static void main(String[] args) {

        int num= 4;
        System.out.println("hi");
        System.out.println("new line");
        System.out.println("3*1=3");
        System.out.printf( "value of %d, \n",num );
        System.out.printf("%d * %d = %d, \n" , num, 1, num*1);
        System.out.printf("%d * %d = %d, \n" , num, 2, num*2);
        System.out.printf("%d * %d = %d, \n" , num, 3, num*3);
        System.out.printf("%d * %d = %d, \n" , num, 4, num*4);
        System.out.printf("%d * %d = %d, \n" , num, 5, num*5);
        System.out.printf("%d * %d = %d, \n" , num, 6, num*6);
        System.out.printf("%d * %d = %d, \n" , num, 7, num*7);
        System.out.printf("%d * %d = %d" + '\n' , num, 6, num*8);
        System.out.printf("%d * %d = %d" + '\n' , num, 9, num*9);
        System.out.printf("%d * %d = %d" , num, 10, num*10);
    }
}
