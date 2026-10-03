import java.util.Scanner;
public class Wastecollectionoptimizer3B{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the amount of garbage collected in kilograms - ");
        float waste = sc.nextFloat();
        if (waste>=100.00){
            System.out.println("Collection Target Achieved.");
        }
        else {
            System.out.println("More Waste Collection Required.");
        }
        sc.close();
    }
}