package OCT11;

public class runner1 {
    public static void main(String[] args) {
        vwologin login = new vwologin("admin","newpassword");
        //System.out.println(login.Password);
       // login.Password = "hacker";
        //System.out.println(login.Password);
        System.out.println(login.getPassword());
        boolean isAdmin = true;
        login.setPassword("newpw", isAdmin);
        System.out.println(login.getPassword());
        System.out.println(login.getUsername());
        login.setUsername("UN");
        System.out.println(login.getUsername());
    }


}
