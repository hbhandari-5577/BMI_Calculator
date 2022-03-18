import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;

public class bmi extends JFrame
{
	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					bmi frame = new bmi();
					frame.setVisible(true);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public bmi()
	{
		setTitle("BMI Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 130, 440, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Height");
		l1.setFont(new Font("Tahoma", Font.BOLD, 16));
		l1.setBounds(10, 44, 71, 24);
		contentPane.add(l1);
		
		t1 = new JTextField();
		t1.setBounds(84, 41, 96, 35);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(289, 41, 96, 35);
		contentPane.add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(158, 239, 96, 40);
		contentPane.add(t3);
		t3.setColumns(10);		
		
		JLabel l2 = new JLabel("(in m)");
		l2.setFont(new Font("Arial", Font.PLAIN, 10));
		l2.setBounds(10, 55, 37, 35);
		contentPane.add(l2);
		
		JLabel l4 = new JLabel("(in kgs)");
		l4.setFont(new Font("Arial", Font.PLAIN, 10));
		l4.setBounds(209, 54, 61, 36);
		contentPane.add(l4);
		
		JLabel l14 = new JLabel("");
		l14.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		l14.setBounds(289, 239, 96, 40);
		contentPane.add(l14);
		
		JButton b1 = new JButton("Calculate Your BMI");
		b1.setFont(new Font("Tahoma", Font.BOLD, 15));
		b1.setForeground(new Color(255, 255, 255));
		b1.setBackground(new Color(51, 51, 153));
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				double height, weight, bmi;
				try
				{
					height=Double.parseDouble(t1.getText());
					weight=Double.parseDouble(t2.getText());
					bmi=weight/(height*height);
					
					t3.setText(new DecimalFormat("##.##").format(bmi));
					
					if(bmi<18.5)
					{
						l14.setText("Underweight");
						l14.setForeground(new Color(0, 153, 204));
					}
					else if(bmi>=18.5 && bmi<=24.9)
					{
						l14.setText("Normal");
						l14.setForeground(new Color(0, 153, 102));
					}
					else if(bmi>=25.0 && bmi<=29.9)
					{
						l14.setText("Overweight");
						l14.setForeground(new Color(102, 102, 102));
					}
					else if(bmi>30.0)
					{
						l14.setText("Obese");
						l14.setForeground(new Color(204, 51, 51));
					}
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, "Please enter the required information");
				}
			}
		});
		b1.setBounds(118, 126, 195, 58);
		contentPane.add(b1);
		
		JLabel l5 = new JLabel("Your BMI");
		l5.setFont(new Font("Tahoma", Font.BOLD, 16));
		l5.setBounds(34, 241, 85, 35);
		contentPane.add(l5);
		
		JButton b2 = new JButton("Clear");
		b2.setBackground(new Color(153, 51, 153));
		b2.setForeground(new Color(255, 255, 255));
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				t1.setText("");
				t2.setText("");
				t3.setText("");
				l14.setText("");
			}
		});
		b2.setBounds(95, 418, 85, 35);
		contentPane.add(b2);
		
		JButton b3 = new JButton("Exit");
		b3.setBackground(new Color(255, 0, 0));
		b3.setForeground(new Color(255, 255, 255));
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				System.exit(0);
			}
		});
		b3.setBounds(245, 418, 85, 35);
		contentPane.add(b3);
		
		JLabel l3 = new JLabel("Weight");
		l3.setFont(new Font("Tahoma", Font.BOLD, 16));
		l3.setBounds(209, 41, 61, 24);
		contentPane.add(l3);
		
		JLabel l8 = new JLabel("BMI");
		l8.setBounds(185, 340, 37, 13);
		contentPane.add(l8);
		
		JLabel l9 = new JLabel("=");
		l9.setBounds(232, 340, 22, 13);
		contentPane.add(l9);
		
		JLabel l10 = new JLabel("Weight");
		l10.setBounds(268, 317, 45, 13);
		contentPane.add(l10);
		
		JLabel l11 = new JLabel("-----------");
		l11.setBounds(268, 340, 45, 13);
		contentPane.add(l11);
		
		JLabel l12 = new JLabel("Height");
		l12.setBounds(268, 363, 45, 13);
		contentPane.add(l12);
		
		JLabel l13 = new JLabel("2");
		l13.setBounds(308, 350, 30, 13);
		contentPane.add(l13);
		
		JLabel l6 = new JLabel("Formula");
		l6.setBounds(106, 340, 53, 13);
		contentPane.add(l6);
		
		JLabel l7 = new JLabel("for");
		l7.setBounds(158, 340, 22, 13);
		contentPane.add(l7);
	}
}
