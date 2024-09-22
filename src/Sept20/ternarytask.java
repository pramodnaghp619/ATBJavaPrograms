package Sept20;

public class ternarytask {
    public static void main(String[] args) {
        //```
        //condition ? expression_if_true : expression_if_false
        //```
        int a = 10;
        int b = 60;
        int c = 45;
        int max= (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(max);
    }
}
