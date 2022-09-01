package checkdemo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class GUI {
	
	Double firstnum,secondnum,Result;
	String Operator;

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 404, 292);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton B1 = new JButton("1");
		B1.setBounds(10, 71, 61, 34);
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String number=textField.getText() + B1.getText();
				textField.setText(number);
				//JOptionPane.showMessageDialog(null, "1");
				
			}
		});
		frame.getContentPane().setLayout(null);
		B1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(B1);
		
		JButton B2 = new JButton("2");
		B2.setBounds(10, 117, 61, 34);
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText() + B2.getText();
				textField.setText(number);
			}
		});
		B2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(B2);
		
		JButton B3 = new JButton("3");
		B3.setBounds(10, 161, 61, 34);
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText() + B3.getText();
				textField.setText(number);
			}
		});
		B3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(B3);
		
		JButton B4 = new JButton("4");
		B4.setBounds(10, 203, 61, 34);
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText() + B4.getText();
				textField.setText(number);
			}
		});
		B4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(B4);
		
		JButton B5 = new JButton("5");
		B5.setBounds(87, 72, 61, 34);
		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText() + B5.getText();
				textField.setText(number);
			}
		});
		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		B5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(B5);
		
		JButton B6 = new JButton("6");
		B6.setBounds(87, 117, 61, 34);
		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText() + B6.getText();
				textField.setText(number);
			}
		});
		B6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(B6);
		
		JButton B7 = new JButton("7");
		B7.setBounds(87, 161, 61, 34);
		B7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText() + B7.getText();
				textField.setText(number);
			}
		});
		B7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(B7);
		
		JButton B8 = new JButton("8");
		B8.setBounds(87, 203, 61, 34);
		B8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText() + B8.getText();
				textField.setText(number);
			}
		});
		B8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(B8);
		
		JButton B9 = new JButton("9");
		B9.setBounds(160, 71, 61, 34);
		B9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText() + B9.getText();
				textField.setText(number);
			}
		});
		B9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(B9);
		
		JButton B10 = new JButton("0");
		B10.setBounds(158, 117, 61, 34);
		B10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText() + B10.getText();
				textField.setText(number);
			}
		});
		B10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(B10);
		
		JButton B11 = new JButton("+");
		B11.setBounds(160, 161, 61, 34);
		B11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				firstnum=Double.parseDouble(textField.getText());
				Operator="+";
				textField.setText("");
			
			}
		});
		B11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(B11);
		
		JButton B12 = new JButton("-");
		B12.setBounds(160, 203, 61, 34);
		B12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				firstnum=Double.parseDouble(textField.getText());
				Operator="-";
				textField.setText("");
			
			}
		});
		B12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(B12);
		
		JButton B13 = new JButton("*");
		B13.setBounds(231, 71, 61, 34);
		B13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				firstnum=Double.parseDouble(textField.getText());
				Operator="*";
				textField.setText("");
			
			}
		});
		B13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(B13);
		
		JButton B14 = new JButton("/");
		B14.setBounds(229, 117, 61, 34);
		B14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				firstnum=Double.parseDouble(textField.getText());
				Operator="/";
				textField.setText("");
			
			}
		});
		B14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(B14);
		
		JButton B15 = new JButton(".");
		B15.setBounds(231, 161, 61, 34);
		B15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String number=textField.getText() + B15.getText();
				textField.setText(number);
			
			}
		});
		B15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(B15);
		
		JButton B16 = new JButton("CLR");
		B16.setBounds(231, 203, 61, 34);
		B16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		B16.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(B16);
		
		JButton B17 = new JButton("=");
		B17.setBounds(300, 71, 80, 163);
		B17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String answer;
				secondnum=Double.parseDouble(textField.getText());
				switch(Operator)
				{
				case"+":
					Result=firstnum+secondnum;
					answer=String.format("%.0f",Result);
					textField.setText(answer);
					break;
				case"-":
					Result=firstnum-secondnum;
					answer=String.format("%.0f",Result);
					textField.setText(answer);
					break;
				case"*":
					Result=firstnum*secondnum;
					answer=String.format("%.0f",Result);
					textField.setText(answer);
					break;
				case"/":
					Result=firstnum/secondnum;
					answer=String.format("%.2f",Result);
					textField.setText(answer);
					break;
				}
				
			}
		});
		B17.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(B17);
		
		textField = new JTextField();
		textField.setBounds(10, 10, 370, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
