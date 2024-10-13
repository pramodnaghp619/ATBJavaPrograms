package OCT11;

public class RunnerClass {
    public static void main(String[] args) {
       TestCase child = new TestCase();

       //dynamic dispatch
        BaseTest Parent = new TestCase();



       //encapsulation
        child.performDELETE();
        child.performPATCH();
        child.performPOST();
        child.performPUT();
        child.performPUT(15);
        child.performGET();
        child.setId(10);
        System.out.println(child.getId());
        child.setName("nag");
        System.out.println(child.getName());

    }
}
