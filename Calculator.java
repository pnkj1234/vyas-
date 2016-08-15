import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
public class Calculator extends JFrame {
	
	private static final long serialVersionUID = 1L;
	Container c;
	JButton b1,b2,b3,b4,b5,b6,b7;
	JTextField txt;
	double x,y,ans;
	JLabel lbl;
	int count=0;
	String todo;
	
	Calculator(){
		c=getContentPane();
		c.setLayout(new FlowLayout());
		txt= new JTextField(10);
		b1=new JButton("+");
		b2=new JButton("-");
		b3=new JButton("*");
		b4=new JButton("/");
		b5=new JButton("X");
		b6=new JButton("=");
		b7=new JButton("Repeat");
		
		lbl=new JLabel(); 
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		c.add(b6);
		c.add(b7);
		c.add(txt);
		c.add(lbl);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				todo="add";
				if(count==0)
				{
				x=Double.parseDouble(txt.getText());
				txt.setText("");
				txt.requestFocus();		
				count=1;
				}
				else 
				y=Double.parseDouble(txt.getText());
			}
		});
		b2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent ae){
				todo="sub";
				if(count==0)
				{
				x=Double.parseDouble(txt.getText());
				txt.setText("");
				txt.requestFocus();		
				count=1;
				}
				else 
				y=Double.parseDouble(txt.getText());
			}
		});
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				todo="mul";
				if(count==0)
				{
				x=Double.parseDouble(txt.getText());
				txt.setText("");
				txt.requestFocus();		
				count=1;
				}
				else 
				y=Double.parseDouble(txt.getText());
			}
		});
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				todo="div";
				if(count==0)
				{
				x=Double.parseDouble(txt.getText());
				txt.setText("");
				txt.requestFocus();		
				count=1;
				}
				else 
				y=Double.parseDouble(txt.getText());
			}
		});
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				txt.setText("");
				txt.requestFocus();
			}
		});
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				y=Double.parseDouble(txt.getText());
				try{
				switch(todo){
				case "add":
				{ans=x+y;
				lbl.setText("Answer="+ans);
				}
				break;
				case "sub":
				{ans=x-y;
					lbl.setText("Answer="+ans);
				}
					break;
				case "mul":
				{ans=x*y;
					lbl.setText("Answer="+ans);
				}	break;
				case "div":
				{ans=x/y;	lbl.setText("Answer="+ans);}
					break;
				}
				}
				catch(ArithmeticException e)
				{
					System.out.println(" ");
				}
			}
		});
		b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				x=0;
				y=0;
				ans=0;
				count=0;
				txt.setText("");
				txt.requestFocus();
				lbl.setText("");
				lbl.requestFocus();
			}
		});
	}
	
public static void main(String args[]){
	Calculator d=new Calculator();
	d.setSize(500,500);
	d.setVisible(true);
	d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
}
