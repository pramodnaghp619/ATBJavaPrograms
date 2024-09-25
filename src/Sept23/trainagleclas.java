package Sept23;

public class trainagleclas {
    public static void main(String[] args) {
        int side1 =5;
        int side2=6;
        int side3 =5;

        if(side1==side2 && side2==side3 && side3==side1){
            System.out.println("Euqilateral trainagle");
        } else if (side1==side2 || side2==side3 || side3==side1) {
            System.out.println("Isosceles triangle");
        }else{
            System.out.println("Scalene triangle");
        }
    }
}
