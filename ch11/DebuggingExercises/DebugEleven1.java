package DebuggingExercises;

// Instantiates Rowboat
// Rowboat is child of Boat
public class DebugEleven1
{
   public static void main(String[] args)
   {
      DebugRowboat myBoat = new DebugRowboat();
      myBoat.setPassengers();
      myBoat.setPower();
      System.out.println(myBoat.toString());
   }
}
