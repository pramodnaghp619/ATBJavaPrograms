package OCT08;

public class Labperson {
    public static void main(String[] args) {
        persontask obj = new persontask();


        persontask obj1 = new persontask("Nag");
        System.out.println(obj1.name);

        persontask obj2 =new persontask("nag1",2,1);
        System.out.println(obj2.name);
        System.out.println(obj2.legs);
        System.out.println(obj2.hands);
    }
}
