
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
    String School_Name, Adjective, Color, Clothing, Animal, Teacher_Name, Adjective0, Place, Number, FoodItems, Beverage, Friend_Name, Verb, Verbing, Adverb, Object, Verb0, Adjective1, Student_Name, Verbing0, Noun, Adjective2;
   
    //creating images
    ImageIcon Smart = new ImageIcon("Smart.jpg");

    ImageIcon FoodPic = new ImageIcon("food.png");

    ImageIcon bev = new ImageIcon("bev.jpg");

    //prombting inputs
    School_Name = JOptionPane.showInputDialog(null,"Enter a name of a school", "School name", 2);
    Adjective = (String) JOptionPane.showInputDialog(null,"Enter a Adjective", "Adjective", 2,null,null, "big, small, kind, etc");

    Color = (String)JOptionPane.showInputDialog(null,"Enter a color", "Color",1);
    

    Clothing = (String)JOptionPane.showInputDialog(null,"Enter a piece of clothing", "clothing",-1,Smart,null,null);

    Animal = JOptionPane.showInputDialog(null,"Enter in an animal");

    Teacher_Name = JOptionPane.showInputDialog(null,"enter in a techer name", "Mr wheels");

    Adjective0 = JOptionPane.showInputDialog(null,"Enter a Adjective", "Adjective", 2);

    Place = JOptionPane.showInputDialog(null,"Enter a place", "Place", 1);

    Number = JOptionPane.showInputDialog(null,"Enter a Number", "Number", 2);


    FoodItems = (String)JOptionPane.showInputDialog(null,"Enter a Food item(s)", "Food",-1,FoodPic,null,null);
    
    ImageIcon bev = new ImageIcon("bev.jpg");

    Beverage = (String)JOptionPane.showInputDialog(null,"Enter a Beverage/Drink", "Beverage",-1,bev,null,null);

    Friend_Name = JOptionPane.showInputDialog(null,"enter in a name", "Doug");

    Verb = JOptionPane.showInputDialog(null,"Enter a Verb", "Verb", 2);

    Verbing = JOptionPane.showInputDialog(null,"Enter a Verb ending with -ing", "Verb-ing", 3);

    Adverb = JOptionPane.showInputDialog(null,"Enter a adverb", "Adverb", 1);

    Object = JOptionPane.showInputDialog(null,"enter in a object", "apple");

    Verb0 = JOptionPane.showInputDialog(null,"Enter a Verb", "Verb", 2);

    Adjective1 = JOptionPane.showInputDialog(null,"Enter a Adjective", "Adjective", 2);

    Student_Name = JOptionPane.showInputDialog(null,"enter in a name", "josh");

    Verbing0 = JOptionPane.showInputDialog(null,"Enter a Verb ending with -ing", "Verb-ing", 3);

    Noun = JOptionPane.showInputDialog(null,"Enter a noun", "Noun", 2);

    Adjective2 = JOptionPane.showInputDialog(null,"Enter a Adjective", "Adjective", 2);

    JOptionPane.showMessageDialog(null,"Title: The Silly School Day Today at " + School_Name +",\n it was "+Adjective+" day! Everyone was excited to wear their "+Color+" "+Clothing+" and bring their favorite "+Animal+" to class.\n  In the morning, the teacher, "+Teacher_Name+", announced a surprise field trip to the "+Adjective0+" "+Place+"\n Everyone had to pack a lunch with "+Number+" "+ FoodItems+" and a drink of "+Beverage+". On the bus, "+Friend_Name+" told a joke that made everyone "+Verb+". Even "+Teacher_Name+" couldn't stop "+Verbing+" with laughter!\n When they arrived at the "+Place+", "+Student_Name+" found a mysterious "+Object+" that granted the ability to "+Verb0+" "+Adverb+".  It was so "+Adjective1+" that "+Student_Name+" started "+Verbing0+" all over the place. \n At the end of the day, everyone received a special "+Noun+" as a reward. It was a day filled with "+Adjective2+" memories.");
   }
}
