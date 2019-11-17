package Output;
import java.util.Scanner;
public class Output {

  public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   double withdrawal = input.nextDouble(); 
   double amount = 760380.18;
   
   System.out.println("Previous Balance Na N" + amount);
   System.out.println();
   System.out.println("Omo You Cash Out N" + withdrawal);
   System.out.println();
   System.out.println("Cartel Your Current Balance Is N" + (amount - withdrawal));
   System.out.println();
   System.out.println("Abeg Go Hustle Make U No Ballin Red Bar For Ur Aza!!!");
  }
}
