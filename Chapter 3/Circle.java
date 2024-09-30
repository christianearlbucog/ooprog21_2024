public class Circle{
   private static double radius; 
   private static double diameter; 
   private static double area; 


public Circle(){
   radius = 1;
   diameter = 2 * radius;
   area = Math.PI* radius * radius;
}

public static void setRadius(double r){
   radius = r;
   diameter = 2 * r;
   area = Math.PI * r * r;
 
}

public static double getRadius(){
   return radius;
}
public static double getDiameter(){
   return diameter;
}
public static double getArea(){
   return area;
}
}