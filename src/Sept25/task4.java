package Sept25;

public class task4 {
    public static void main(String[] args) {

        //int i=0;
        int n=0;
        String prime_number= " ";

        for( int i=1;i<=100;i++){
            int counter=0;
            for(n=i;n>=1;n--){

                if(i%n==0){
                    counter =counter + 1;
                }
            }
            if (counter==2){
                prime_number = prime_number + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(prime_number);
    }
}
