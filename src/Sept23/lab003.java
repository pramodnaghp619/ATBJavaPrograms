package Sept23;

public class lab003 {
    public static void main(String[] args) {
        String Broswer = "opera";

        switch(Broswer){
            case "Chrome":
                System.out.println("starting the chrome broswer");
                break;
            case "edge":
                System.out.println("starting edge browser");
                break;
            case "firefox":
                System.out.println("starting firefox broswer");
                break;
            default:
                System.out.println("any");
                break;
        }
    }

}
