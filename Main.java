
import javax.swing.*;

public class Main {
   public static void main(String[] args){

    //creating strings
    String name,adj0,color,verb0;

    //prombting inputs
    name = JOptionPane.showInputDialog(null,"Enter a name", "Name", 2);
    color = JOptionPane.showInputDialog(null,"Enter a color", "Color", 2);
    adj0 = (String)JOptionPane.showInputDialog(null,"Enter a adjective", "adjective",1,null,null, "big, small, kind, etc");
    
    ImageIcon Smart = new ImageIcon("Smart.jpg");
    verb0 = (String)JOptionPane.showInputDialog(null,"Enter a verb", "Verb",-1,Smart,null,null);
   }
}
