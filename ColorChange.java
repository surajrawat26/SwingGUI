import java.awt.*;
import java.awt.event.*;
class ColorChange 
{
Frame f;
TextField t;

Label red,blue,green;
Scrollbar sred,sgreen,sblue;
Button clear,exit;
Color c;
public ColorChange()
{
f = new Frame ("C The Change");
f.setVisible(true);
f.setSize(300,300);
f.setLayout(null);
f.setLocation(250,300);
t = new TextField();
red = new Label("RED");
blue = new Label("BLUE");
green = new Label("GREEN");
sred = new Scrollbar (Scrollbar.HORIZONTAL,0,1,0,255);
sblue = new Scrollbar (Scrollbar.HORIZONTAL,0,1,0,255);
sgreen = new Scrollbar (Scrollbar.HORIZONTAL,0,1,0,255);
/*sred.setMaximum(255); sred.setMinimum(0);
sgreen.setMaximum(255); sgreen.setMinimum(0);
sblue.setMaximum(255); sblue.setMinimum(0);*/
clear = new Button ("CLEAR");
exit = new Button ("EXIT");
t.setBounds(60,50,200,50);
red.setBounds(40,120,50,20);
green.setBounds(40,150,50,20);
blue.setBounds(40,180,50,20);
sred.setBounds(110,120,150,20);
sblue.setBounds(110,150,150,20);
sgreen.setBounds(110,180,150,20);
clear.setBounds(50,230,70,40);
exit.setBounds(200,230,70,40);

f.add(t);      f.add(red);    f.add(blue);    f.add(green);
f.add(sred);   f.add(sblue);  f.add(sgreen);
f.add(clear);  f.add(exit);
Aevent obj=new Aevent();
clear.addActionListener(obj);
exit.addActionListener(obj);
sred.addAdjustmentListener(obj);
sblue.addAdjustmentListener(obj);
sgreen.addAdjustmentListener(obj);
}

class Aevent implements  AdjustmentListener , ActionListener{
	public void actionPerformed(ActionEvent e)
{
if(e.getSource()==exit)
{
System.exit(0);
}
if(e.getSource()==clear)
{
sred.setValue(0);
sblue.setValue(0);
sgreen.setValue(0);
t.setText(null);
t.setBackground(Color.WHITE);
}
}
public void adjustmentValueChanged(AdjustmentEvent e)
{
int i=0,j=0,k=0;
if(e.getSource()==sred || e.getSource()==sgreen || e.getSource()==sblue)
{
i=sred.getValue();
j=sblue.getValue();
k=sgreen.getValue();
t.setText("RED: " +i +" GREEN: " +j +" BLUE: " +k);

c=new Color(i,j,k);
t.setBackground(c);
}
}

}}

class gui{
	public static void main(String[] args)
{
ColorChange obj=new ColorChange();
}
}
