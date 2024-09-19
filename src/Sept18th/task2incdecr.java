package Sept18th;

public class task2incdecr {

    public static void main(String[] args) {
        int a1 = 10;
        System.out.println(  --a1 + a1 --  + a1--);//26
        System.out.println(a1);//7

        int a2 = 10;
        System.out.println(  --a2 + a2++ + a2--);//28
        System.out.println(a2);//9

        int a3 = 10;
        System.out.println(  a3-- + a3 --  + a3 --); //27
        System.out.println(a3);//7
    }
}
