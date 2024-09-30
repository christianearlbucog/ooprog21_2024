public class testCircle {
public static void main (String [] args){
   Circle a = new Circle();   
   Circle b = new Circle();
   Circle c = new Circle(); 

   
   a.setRadius(3);
   System.out.println("radius of the circle:" + a.getRadius());
   System.out.println("diameter of the circle:" + a.getDiameter());
   System.out.println("area of the circle:" + a.getArea());

   b.setRadius(20);
      System.out.println("radius of the circle:" + b.getRadius());
      System.out.println("diameter of the circle:" + b.getDiameter());
      System.out.println("area of the circle:" + b.getArea());
      

   
   
   
   
   

}
}