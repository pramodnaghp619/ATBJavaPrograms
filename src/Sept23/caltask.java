package Sept23;

import java.util.Scanner;

public class caltask {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("num 1 is equal to ");
        int num1 = sc.nextInt();
        System.out.println("num 2 is equal to ");
        int num2 = sc.nextInt();
        int choice = 0;

        switch(choice){
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                    System.out.println(num1*num2);
                    break;
            case 4:
                System.out.println(num1/num2);
                break;
            case 5:
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("invalid operators");
                break;

        }

    }
}
