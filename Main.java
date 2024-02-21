
import javax.swing.*;

public class Main {
   public static void main(String[] args){

    //creating strings
    String name,adj0,color;

    //prombting inputs
    name = JOptionPane.showInputDialog(null,"Enter a name", "title", 2);
    color = JOptionPane.showInputDialog(null,"Enter a color", "title", 2);
    adj0 = (String)JOptionPane.showInputDialog(null,"Enter a adjective", "adjective",1,null,null, "big, small, kind, etc");

   }
}
