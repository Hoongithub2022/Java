package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorTest frame = new CalculatorTest();
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
	public CalculatorTest() {
		setTitle("나의 계산기 v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("굴림", Font.BOLD, 16));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setBounds(12, 10, 265, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(12, 63, 60, 60);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setBounds(80, 63, 60, 60);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setBounds(148, 63, 60, 60);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(217, 63, 60, 60);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("X");
		btnNewButton_3_1.setBounds(217, 133, 60, 60);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_2_1 = new JButton("6");
		btnNewButton_2_1.setBounds(148, 133, 60, 60);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_1_1 = new JButton("5");
		btnNewButton_1_1.setBounds(80, 133, 60, 60);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBounds(12, 133, 60, 60);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_3_2 = new JButton("-");
		btnNewButton_3_2.setBounds(217, 203, 60, 60);
		contentPane.add(btnNewButton_3_2);
		
		JButton btnNewButton_2_2 = new JButton("3");
		btnNewButton_2_2.setBounds(148, 203, 60, 60);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_1_2 = new JButton("2");
		btnNewButton_1_2.setBounds(80, 203, 60, 60);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_5 = new JButton("1");
		btnNewButton_5.setBounds(12, 203, 60, 60);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_3_3 = new JButton("+");
		btnNewButton_3_3.setBounds(148, 273, 60, 60);
		contentPane.add(btnNewButton_3_3);
		
		JButton btnNewButton_2_3 = new JButton("=");
		btnNewButton_2_3.setBounds(217, 273, 60, 60);
		contentPane.add(btnNewButton_2_3);
		
		JButton btnNewButton_1_3 = new JButton("C");
		btnNewButton_1_3.setBounds(80, 273, 60, 60);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_6 = new JButton("0");
		btnNewButton_6.setBounds(12, 273, 60, 60);
		contentPane.add(btnNewButton_6);
	}

}
