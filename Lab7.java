import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Lab7 implements ActionListener
{
JFrame F;
JButton B1, B2 ,B3;
JTextField T;
Icon a,b,c;
//ContentPane C;
Lab7()
{
F = new JFrame("Gui");
a = new ImageIcon("morning.png");
b = new ImageIcon("Evening.jpg");
c = new ImageIcon("night.jpg");
B1 = new JButton ("Morning",a);
B2 = new JButton ("Evening",b);
B3 = new JButton ("Night",c);

T = new JTextField();


F.setLayout(null);
F.setSize(800,800);
F.setVisible(true);

F.add(B1);
F.add(B2);
F.add(B3);

F.add(T);


//C.add(B1);
//C.add(B2);
//C.add(B3);
//C.add(T);

B1.setBounds(10,20,100,100);
B2.setBounds(150,20,100,100);
B3.setBounds(300,20,100,100);
T.setBounds(460,20,300,30);

B1.addActionListener(this);
B2.addActionListener(this);
B3.addActionListener(this);




}
public void actionPerformed(ActionEvent e)
{
T.setText("It is a good " + ((JButton)e.getSource()).getText());
}
public static void main(String args[])
{
new Lab7();
}
} 
