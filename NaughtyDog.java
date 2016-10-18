public class NaughtyDog{
   String name;
   int size;
   
   String getName(){
      return name;
   }   
   int getSize(){
      return size;
   }
   
   public void setName(String nm){
      name = nm;
   }
   public void setSize(int s){
      size = s;     
   }
   
   void bark(){
      if(size > 60){
         System.out.println("Ruff! Ruff!");
      } else if (size > 14) {
         System.out.println("Woof! Woof!");
      } else {
         System.out.println("Yip! Yip!");
      }
   }
}