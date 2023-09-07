import javax.swing.*;

 public class Swing4 extends JFrame 
 
 {

JFrame f;

    Swing4()
    {
        JLabel l1= new JLabel(" IP56345 ");

        JLabel l2= new JLabel("System  Hacked");

        l1.setBounds(50, 50, 100, 30);

        l2.setBounds(50, 100, 100, 30);

        add(l1);

        add(l2);

setSize(300,300);

setLayout(null);

setVisible(true);
    }
    public static void main(String[] args )
    {
      new Swing4();
    }

  
} 
