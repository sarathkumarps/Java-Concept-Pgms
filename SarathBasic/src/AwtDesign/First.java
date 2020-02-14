package AwtDesign;

import java.awt.*;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class First extends JFrame {
	
	
	
	
	public static void main(String[] args) {
		
		
		JTextField name,addr,email,mob,pw;
		JCheckBox c1=new JCheckBox("Yes");
		
		JCheckBox c2=new JCheckBox("No");
		
		First f=new First ();
		f.setBounds(10, 10, 600, 800);
		f.setVisible(true);
		f.setLayout(null);

		

		JLabel l1=new JLabel("Name	:");
		l1.setBounds(50, 100, 100, 30);
		f.add(l1);
		name=new JTextField(50);
		name.setBounds(200,100,150,30);
		f.add(name);
		
		JLabel l2=new JLabel("Address	:");
		f.add(l2);
		l2.setBounds(50, 140, 100, 30);
		addr=new JTextField(150);
		addr.setBounds(200,140,150,30);
		f.add(addr);
		
		JLabel l3=new JLabel("Email	:");
		l3.setBounds(50, 180, 100, 30);
		f.add(l3);
		email=new JTextField(150);
		email.setBounds(200,180,150,30);
		f.add(email);
		
		JLabel l4=new JLabel("Mob	:");
		l4.setBounds(50, 220, 100, 30);
		f.add(l4);
		mob=new JTextField(150);
		mob.setBounds(200,220,150,30);
		f.add(mob);
		
		JLabel l5=new JLabel("Password	:");
		l5.setBounds(50, 260, 100, 30);
		f.add(l5);
		pw=new JTextField(150);
		pw.setBounds(200,260,150,30);
		f.add(pw);
		
		JLabel l6=new JLabel("Fresher	:");
		l6.setBounds(50, 300, 100, 30);
		f.add(l6);
		
//		Label l7=new Label("Country	:");
//		l6.setBounds(50, 340, 100, 30);
//		f.add(l7);
//		
//		TextField t1,t2;

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
