package Debugging;

import javax.swing.*;
public class DebugPhoneBook extends DebugBook
{
   private String area;
   private String size;

    public DebugPhoneBook(int pages, String city)
   {
      super(pages);
      area = city;
       int CUTOFF = 30;
       if(pages > CUTOFF) {
           size = "big";
       } else {
           size = "small";
       }
   }
   public void display()
   {
      JOptionPane.showMessageDialog(null,"The phone book for " + area +
         " has " + pages + " pages.\nThat is a " +
         size + " phone book."); 
   }
}