package StreamsPgms;

import java.awt.*;
import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class New1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New1 frame = new New1();
					
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public New1() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		contentPane.setLayout(new BorderLayout(0, 0));
//		setContentPane(contentPane);
//		
		
		
		
		
		
		
		setBounds(30, 50, 500, 500);
		
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(182, 54, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNisha = new JLabel("nisha");
		lblNisha.setBounds(65, 57, 46, 14);
		getContentPane().add(lblNisha);
		setVisible(true);
		
		
		
		
		
	}
}
