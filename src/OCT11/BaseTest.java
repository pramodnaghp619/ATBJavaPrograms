package OCT11;

public class BaseTest {
    private String name;
    private int id;

    public BaseTest() {
        System.out.println("base class");
    }

    public BaseTest(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void performGET(){

    }

    public void performPOST(){

    }

    public void performPATCH(){

    }

    public void performDELETE(){

    }

    public void performPUT(){

    }
}
