/**<h1>Project Title: </h1>
*<b>Purpose of Project:</b><br>
*<p></p>
*<b>How to start the project instructions:</b><br>
*<p></p>
*<b>User Instructions:<b/><br>
*<p></P>
*<br>
*@author
*@version 1
*@since 2017-12-11
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class food {
  /**<b>Class Description: Driver class</b><br>
  *<p></p>
  *@param
  *@return
  *@throws
  */


    //public int stringDecInt (String usernumber1){}



  /**<b>Method Description: Driver</b><br>
  *<p></p>
  *@param args unused
  *@return
  *@throws
  */


  public String printMoney (double money) {
    String pM = String.format ("$%.2f", money);
    System.out.println(pM);
    return pM;
  }

  public int stringDecInt(String userString){
    String foodString = "";
    String food2String = "";
    Double foodDouble = 0.0;
    Integer foodInt = 0;
    return item_int

    food obj = new food();

      String moneyYouHave_string1 = JOptionPane.showInputDialog("Tell me how much " +
                   "money you have.\n Please enter only dollars and cents, \n" +
                   "For Example: \'\' 14.50 \'\'");
      Double moneyYouHave_double = 0.00;
      Integer apples2 = 0;

      try{
        moneyYouHave_double = Double.parseDouble(moneyYouHave_string1);
      }
      catch (NumberFormatException ne1) {
        System.out.println("User failed first attempt " +
                           "inputting money value.");
        String moneyYouHave_string2 = JOptionPane.showInputDialog("Please "+
                "enter a dollars and cents value\n" +
                "For example: \' 14.50 \'");
        try {
          moneyYouHave_double = Double.parseDouble(moneyYouHave_string2);
        }
        catch (NumberFormatException ne2) {
          System.out.println("User failed a second attempt for " +
                             "the total money to spend.");
          JOptionPane.showMessageDialog (null, "Please restart the program" +
                      JOptionPane.ERROR_MESSAGE);
          System.exit(0);
        }
      }

      double totalMoneyIn = moneyYouHave_double;
      if ( moneyYouHave_double == Math.abs(0.0) ) {
        System.out.println("You are very broke." +
                           " Please restart the program");
        JOptionPane.showMessageDialog (null, "You have not entered a total amount of money to spend. " +
                    JOptionPane.ERROR_MESSAGE);
        System.exit(0);
      } else {
        System.out.println("User entered: " + totalMoneyIn);
        JOptionPane.showMessageDialog (null, "I understand you entered " +
                    obj.printMoney(totalMoneyIn), "money to spend", JOptionPane.INFORMATION_MESSAGE);
      }    

  }
 public static void main(String[] args)
 throws NumberFormatException
 {




// Sequence that asks about Apples, Oranges, and Chocolate
System.out.println("User eneters a number of apples. \n");
String apples_string1 = JOptionPane.showInputDialog ("Let's " +
       "fill the box.\nPlease enter how many whole apples you " +
       "would like.");
Double apples_double = 0.0; //catch user entry, decimal
Integer apples_int = 0;
String apples_string2 = "";
//Possible replies: decimal, integer, string, "0"
try {
  apples_double = Double.parseDouble (apples_string1);
  apples_double = 0.0;
}
catch (NumberFormatException ne3) {
  System.out.println("User has failed first attempt entering " +
                     "an integer for apples.");
  apples_string2 = JOptionPane.showInputDialog ("Please " +
         "enter how many whole apples you would like.\n" +
         "For example: \' 3 \' ");
  try {
    apples_double = Double.parseDouble (apples_string2);
    apples_double = 0.0;
    apples_string1 = apples_string2;
  }
  catch (NumberFormatException ne4) {
     System.out.println("User has failed the second attempt.");
     JOptionPane.showMessageDialog (null, "Please restart the " +
            "program and enter a whole number.\n" +
            "For example: \' 3 \' ", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
     System.exit(0);
  }
}
if (apples_double == 0.0) {
  try {
    System.out.println("Second attempt might be successful");
    apples_int = Integer.parseInt(apples_string2);
    apples_string1 = apples_string2;
    System.out.println("Second attempt successful " +
          "and variables reassigned.");
    apples_double = 0.0;
  }
  catch (NumberFormatException ne5) {
    System.out.println("User failed second attempt for " +
          "an integer value for apples.");
    JOptionPane.showMessageDialog(null, "Please enter a whole " +
                "number of apples, as a whole number", "ERROR " +
                "MESSAGE", JOptionPane.ERROR_MESSAGE);
    System.exit(0);
  }
  try {
    System.out.println("User entered a double or integer for " +
           "the number of apples.");
    apples_int = Integer.parseInt(apples_string1);
    System.out.println("User entered an int for the number of apples.");
  }
  catch (NumberFormatException ne6) {
    //Yes decimal and not an integer
    System.out.println("User entered a decimal value, not an int.");
    apples_string2 = JOptionPane.showInputDialog("It seems like you " +
           "have entered a decimal.\nPlease enter a whole number of " +
           "apples.\nFor example: \' 3 \' ");
    apples_string1 = apples_string2;
    try {
      //2nd attempt at entering an integer
      System.out.println("User's second attempt at entering int");
      apples_int = Integer.parseInt(apples_string1);
      // Different variable, need to equal it to first variable
      apples_double = 0.0;
    }
    catch (NumberFormatException ne7) {
      //Not an integer 2nd time, exit program
      System.out.println("User failed second attempt, exit program.");
      JOptionPane.showMessageDialog(null, "Please restart the " +
                 "the program and enter a whole number of apples." +
                 "", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
      System.exit(0);
    }
  }
}

  System.out.println("This is the end of the TryCatch for Apples");
  System.out.println(apples_int);
  System.out.println(apples_double);
  System.out.println(apples_string1);
  System.out.println(apples_string2);


}
}
