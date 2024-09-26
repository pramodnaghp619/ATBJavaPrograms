package Sept25;

public class task3 {
    public static void main(String[] args) {

        String name = "pramod";
        int v=0;
        int c=0;

        for(int i=1;i<=name.length();i++){
            char qa = name.charAt(i);
            if(qa=='a' || qa=='e'||qa=='i'||qa=='o'|| qa=='u'){
                v++;
            } else{
                c++;
            }
            System.out.println("count of vowels =" +v);
            System.out.println("count of constant = " +c);
        }
    }

    }
