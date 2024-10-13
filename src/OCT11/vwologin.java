package OCT11;

public class vwologin {
    private String username;
    private String Password;

    public vwologin() {
        System.out.println("calling baseclass");
    }

    public vwologin(String username, String password) {
        this.username = username;
        this.Password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password, boolean isAdmin) {

        if(isAdmin){
            this.Password = password;
        }else{
            System.out.println("not allowed");
        }
    }
}
