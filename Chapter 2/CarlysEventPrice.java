import java.util.Scanner;

public class CarlysEventPrice2{
public static void main(String[] args){
   Scanner reader = new Scanner (System.in);
      System.out.println("************************************");
      System.out.println("* Carly's makes the food that makes * ");
      System.out.println("*           it a party.              *");
      System.out.println("*************************************");
      System.out.print("");
         int PRICE_PER_GUEST = 35;
         int LARGE_EVENT = 50;
     
     System.out.println("Enter the number of Guests:");
         int numberOfGuest = reader.nextInt();
         int isTotalPrice = numberOfGuest * PRICE_PER_GUEST;
         boolean isLargeEvent = numberOfGuest >= LARGE_EVENT;
         
     System.out.println("*Carlys catering*");
     System.out.println("Number of Guests:" + numberOfGuest);
     System.out.println("The Price per Guests: $" + PRICE_PER_GUEST);
     System.out.println("The Total price: $" + isTotalPrice);
     System.out.println("The Lagre Event: " + isLargeEvent);
     
     reader.close();
   } 
}  
