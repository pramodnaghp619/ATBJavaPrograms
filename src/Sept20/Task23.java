package Sept20;

public class Task23 {
    public static void main(String[] args) {
        //```
        //condition ? expression_if_true : expression_if_false
        //```
        //score >= 90 → A
        ////  score >= 80 → B
        ////  score >= 70 → C
        int score =73;
        if( score>=90){
            System.out.println("Grade =A");
        }else if ( score>=80 && score>=89) {
            System.out.println("Grade =B");
        }else if (score>=70 && score<=79){
            System.out.println("Grade =C");
        }
    }
}
