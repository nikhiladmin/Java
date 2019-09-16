import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class prg extends JApplet implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JButton b1,b2;
	JTextField t1;
	JFrame jf;

prg(){
	l4 =new JLabel("Check no is Even or Odd ? ");
	l1 =new JLabel("Enter Any Number ");
	l2 =new JLabel("Even of Odd ?");
	l3 =new JLabel();
	b1=new JButton("Check");
	b2=new JButton("Exit");
	t1=new JTextField();
	jf=new JFrame("Program");
	jf.setLayout(null);


	l4.setBounds(40,10,200,25);
	l1.setBounds(40,34,125,25);t1.setBounds(220,35,75,25);
	b1.setBounds(40,65,75,25);b2.setBounds(220,65,75,25);
	l2.setBounds(40,125,300,25);l3.setBounds(220,95,75,25);

	jf.add(l4);
	jf.add(l1);jf.add(t1);
	jf.add(b1);jf.add(b2);
	jf.add(l2);jf.add(l3);

	jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	b1.addActionListener(this);
	b2.addActionListener(this);
	jf.setSize(400,600);
	jf.setVisible(true);

}
public void actionPerformed(ActionEvent ae){
if(ae.getSource()==b1){
	int input1=Integer.parseInt(t1.getText());
	if(input1%2==0)
	      l3.setText("Even");
	       else
	l3.setText("Odd");
}else{
	System.exit(0);
	}
}
public static void main(String ar[]){
prg o=new prg();
}
}