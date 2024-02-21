
import javax.swing.*;

public class Main {
   public static void main(String[] args){

    /*Title: The Silly School Day

Today at [School Name], it was [Adjective] day! Everyone was excited to wear their [Color] [Clothing] and bring their favorite [Animal] to class.

In the morning, the teacher, [Teacher's Name], announced a surprise field trip to the [Adjective] [Place]. Everyone had to pack a lunch with [Number] [Food Item(s)] and a drink of [Beverage].

On the bus, [Friend's Name] told a joke that made everyone [Verb]. Even [Teacher's Name] couldn't stop [Verb-ing] with laughter!

When they arrived at the [Place], [Student's Name] found a mysterious [Object] that granted the ability to [Verb] [Adverb]. It was so [Adjective] that [Student's Name] started [Verb-ing] all over the place.

At the end of the day, everyone received a special [Noun] as a reward. It was a day filled with [Adjective] memories.
*/




    //creating strings
    String School_Name, Adjective, Color, Clothing, Animal, Teacher_Name, Adjective0, Place, Number, FoodItems, Beverage, Friend_Name, Verb, Verbing, Adverb, Object, Verb0, Adjective1, Student_Name, Verb_ing, Noun, Adjective2;
   

    //prombting inputs
    School_Name = JOptionPane.showInputDialog(null,"Enter a name of a school", "School name", 2);
    Adjective = JOptionPane.showInputDialog(null,"Enter a Adjective", "Adjective", 2);
    Color = (String)JOptionPane.showInputDialog(null,"Enter a color", "Color",1,null,null, "big, small, kind, etc");
    
    ImageIcon Smart = new ImageIcon("Smart.jpg");
    Clothing = (String)JOptionPane.showInputDialog(null,"Enter a piece of clothing", "clothing",-1,Smart,null,null);

    Animal = JOptionPane.showInputDialog(null,"Enter in an animal");
    Teacher_Name = JOptionPane.showInputDialog(null,"enter in a techer name", "Mr wheels");
    Adjective0 = JOptionPane.showInputDialog(null,"Enter a Adjective", "Adjective", 2);
    Place = JOptionPane.showInputDialog(null,"Enter a place", "Place", 1);
    Number = JOptionPane.showInputDialog(null,"Enter a Number", "Number", 2);

    ImageIcon FoodPic = new ImageIcon("food.png");
    FoodItems = (String)JOptionPane.showInputDialog(null,"Enter a Food item(s)", "Food",-1,FoodPic,null,null);
    
    ImageIcon bev = new ImageIcon("bev.jpg");
    Beverage = (String)JOptionPane.showInputDialog(null,"Enter a Beverage/Drink", "Beverage",-1,bev,null,null);









   }
}
