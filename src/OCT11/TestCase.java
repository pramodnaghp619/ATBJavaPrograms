package OCT11;

public class TestCase extends BaseTest{

    int age;
    TestCase(int age){
        this.age =age;
    }

    public TestCase(String name, int id) {
        super(name, id);
    }

    public TestCase() {
        super();
        System.out.println("");
    }

    @Override
    public void performDELETE(){
        System.out.println("I am overriding DELETE method");
    }
    @Override
    public void performPATCH(){
        System.out.println("I am overriding PATCH method");
    }


    public void performPUT(int id) {
        System.out.println("performing overloading");
    }
}
