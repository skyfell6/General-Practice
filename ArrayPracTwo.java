public class ArrayPracTwo {
   String firstName;
   public static void main(String[] args) {
   
   ArrayPracTwo cat1 = new ArrayPracTwo();
   // cat1.firstName = "Retro";
   
   ArrayPracTwo myCats[] = new ArrayPracTwo[3];
   myCats[0] = new ArrayPracTwo();
   myCats[1] = new ArrayPracTwo();
   myCats[2] = cat1;  
   
   cat1.firstName = "Retro";
   myCats[0].firstName = "Bing"; 
   myCats[1].firstName = "Guzzy";
   
   System.out.println("#1 cat's name: "+cat1.firstName);
   System.out.println("#2 cat's name: "+myCats[0].firstName);
   System.out.println("#3 cat's name: "+myCats[1].firstName);
   }
}