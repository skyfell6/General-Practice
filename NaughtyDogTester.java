public class NaughtyDogTester{
   public static void main(String[] args){
   
   NaughtyDog bob = new NaughtyDog();
   bob.setName("Bob");
   bob.setSize(45);
   
   NaughtyDog rob = new NaughtyDog();
   rob.setName("Rob");
   rob.setSize(14);

   NaughtyDog peg = new NaughtyDog();
   peg.setName("Peg");
   peg.setSize(61);
   
   System.out.println("First dog's name: "+bob.getName()); 
   System.out.println("Second dog's name: "+rob.getName());
   System.out.println("Third dog's name: "+peg.getName());  
   System.out.println("First dog's weight: "+bob.getSize()); 
   System.out.println("Second dog's weight: "+rob.getSize()); 
   System.out.println("Third dog's weight: "+peg.getSize());
   bob.bark();
   rob.bark();
   peg.bark();
   }
}