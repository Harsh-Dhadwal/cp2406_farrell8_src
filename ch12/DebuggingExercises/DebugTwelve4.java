package DebuggingExercises;// An employee ID can't be more than 999
// Keep executing until user enters four valid employee IDs
// This program throws a DebugEmployeeIDException
import javax.swing.*;
class DebugTwelve4
{
   public static void main(String[] args) throws DebugEmployeeIDException {
      String inStr, outString = "";
      final int MAX = 999;
      int[] emp = new int[4];
      for(int x = 0; x < emp.length; ++x)
      {
         inStr = JOptionPane.showInputDialog(null, "Enter employee ID number");

         try
         {
             emp[x] = Integer.parseInt(inStr);
            if(emp[x] > MAX)
            {
               throw(new DebugEmployeeIDException("Number too high " + emp[x]));
            }
         }
         catch(NumberFormatException error)
         {	
            --x;
            JOptionPane.showMessageDialog(null, inStr + "\nNon-numeric ID");
         }
         catch(DebugEmployeeIDException error)
         {	
	        --x;
            JOptionPane.showMessageDialog(null, inStr + "\nID can't be more than 999" );
         }
      }
      for (int anEmp : emp) {
         outString = outString + anEmp + " ";
      }
      JOptionPane.showMessageDialog(null, "Four valid IDS are: " + outString);
   }
}
