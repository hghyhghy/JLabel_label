import javax.swing.*;

// creating a label GUI using java swing

public class Swing3 {

  public static void main(String []  args )
  {
    // creating an object f in class JFrame
    JFrame f= new JFrame("Label Example");

    // creating an object l1 in class JLabel
    JLabel l1= new JLabel("First Label");

    // creating an object l2 in class JLabel

    JLabel l2= new JLabel("Second label");

    l1.setBounds(50, 50, 100, 30);

    l2.setBounds(50, 100, 100, 30);

    f.add(l1);

    f.add(l2);

    f.setSize(300, 300);

    f.setLayout(null);

    f.setVisible(true);


  }
  
}
