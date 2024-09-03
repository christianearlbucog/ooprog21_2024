import java.util.Scanner;

public class sammyseashoresupplies{
public static void main(String [] args){
   Scanner reader = new Scanner (System.in);
   System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
   System.out.println("S Sammy's makes it fun in the sun. S");
   System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
   System.out.print("");
   
      double RENTAL_COST_PER_HOUR = 40.00;
      double RENTAL_COST_PER_MINUTE = 1.00;
   
   System.out.println("Enter the of minutes rentes a piece of sports equipment: ");
      int minutesRented = reader.nextInt();
      
      int hours = minutesRented / 60;
      int minutes = minutesRented % 60;
      double isTotalPrice = (hours * RENTAL_COST_PER_HOUR) + (minutes * RENTAL_COST_PER_HOUR);
      
    System.out.println("* The total cost of sports equipment: *");
    System.out.println("The Hours Rented: " + hours);
    System.out.println("The Minutes Rented: " + minutes);
    System.out.println("The Total Price: " + isTotalPrice);
    
    reader.close();  
 }
}
