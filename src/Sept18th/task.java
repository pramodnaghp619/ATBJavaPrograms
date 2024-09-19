package Sept18th;

public class task {
    public static void main(String[] args) {
       // Widening
        int a= 15;
        float b=a;
        System.out.println(b);

        int q = 23;
        float mn=q;
        System.out.println(mn);

        //narrowing
        int val= 200;
        byte d = (byte)val;
        System.out.println(d);

        float c = 17.88f;
        int e= (int)c;
        System.out.println(e);

        long m = 9876l;
        int n =(int)m;
        System.out.println(n);

    }
}
