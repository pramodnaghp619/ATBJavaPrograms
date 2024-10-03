package Sept25;

public class vowconstask {
    public static void main(String[] args) {
        String name= "ParichayParidhiPramod";
        int v=0;
        int c=0;

        for(int i=0;i<name.length();i++){
            char qa = name.charAt(i);
            if(qa=='a' || qa=='e'||qa=='i'||qa=='o'|| qa=='u'){
                v++;
            }else{
                c++;
            }
            System.out.println("number of Vlowles are " + v);
            System.out.println("number of const are " + c);
        }

    }
}
