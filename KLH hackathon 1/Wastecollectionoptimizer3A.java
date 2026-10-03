//3A
import java.util.Scanner;
public class Wastecollectionoptimizer3A{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter vehical number - ");
        int vehno = sc.nextInt();
        System.out.println("Enter Amount of Waste Collected - ");
        float collecwaste = sc.nextFloat();
        System.out.println("Enter Number of collection Points - ");
        int collpoint = sc.nextInt();
        System.out.println("If above vehicle is On-Duty, enter 'O' ");
        System.out.println("If above vehicle is Free, enter 'F' ");
        char status = sc.next().charAt(0);

        //DISPLAYING
        System.out.println("Vehicle number - "+vehno);
        System.out.println("Amount of Waste collected - "+collecwaste);
        System.out.println("Collection points - "+collpoint);
        System.out.println("Status of vehicle - "+status);
        sc.close();
    }
}