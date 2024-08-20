
import java.util.Scanner;

public class Convetor {
public static void main(String[] args) {
    int one = 1;
    
    do {
        System.out.println("1 == Dollar | 2 == Pound | 3 == Japanese Yen");
        Scanner Options = new Scanner(System.in);
        int OPTIONS = Options.nextInt();

        if (OPTIONS == 1){
            Dollar();
        }
        else if (OPTIONS == 2){
            Pound();
        }
        else if (OPTIONS == 3){
            Yen();
        }
        else {
            System.out.println("Unregistered Currency!");
            break;
        }
        
        } while (one <= 10);
    
}
 public static double  Dollar(){

    System.out.println("Enter Your Rand Amount!");
    Scanner Rand = new Scanner(System.in);
    double RAND = Rand.nextInt();
    System.out.println("Dollar: " + RAND / 18);
    return RAND;


 };
 public static double  Pound(){

    System.out.println("Enter Your Rand Amount!");
    Scanner Rand = new Scanner(System.in);
    double RAND = Rand.nextInt();
    System.out.println("Pound: " + RAND / 25);
    return RAND;
    

 };
 public static double Yen(){

    System.out.println("Enter Your Rand Amount!");
    Scanner Rand = new Scanner(System.in);
    int RAND = Rand.nextInt();
    System.out.println("Yen: " + RAND / 2);
    return RAND;
    

 };
}
