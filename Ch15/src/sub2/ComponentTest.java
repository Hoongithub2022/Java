package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentTest extends JFrame {

	private JPanel ma;
	private JTextField txtf1;
	private JTextField txtf2;
	private JTextField txtf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
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
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 536);
		ma = new JPanel();
		ma.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ma);
		ma.setLayout(null);

		JLabel lblNewLabel = new JLabel("컴포넌트 실습하기");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 10, 121, 15);
		ma.add(lblNewLabel);

		JLabel lblButton = new JLabel("Button 컴포넌트");
		lblButton.setFont(new Font("굴림", Font.PLAIN, 12));
		lblButton.setBounds(22, 35, 121, 15);
		ma.add(lblButton);

		JButton btn1 = new JButton("버튼1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
			}
		});
		btn1.setBounds(33, 67, 69, 23);
		ma.add(btn1);

		JButton btn2 = new JButton("버튼2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
			}
		});
		btn2.setBounds(111, 67, 69, 23);
		ma.add(btn2);

		JButton btn3 = new JButton("버튼3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼3 클릭...", "대화상자 제묵", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btn3.setBounds(192, 67, 69, 23);
		ma.add(btn3);

		JButton btn4 = new JButton("버튼4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼4 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);

				if (answer == JOptionPane.YES_NO_OPTION) {
					System.out.println("Yes 클릭...");
				} else {
					System.out.println("No 클릭...");
				}
			}
		});
		btn4.setBounds(274, 67, 69, 23);
		ma.add(btn4);

		txtf1 = new JTextField();
		txtf1.setHorizontalAlignment(SwingConstants.LEFT);
		txtf1.setBounds(12, 124, 116, 21);
		ma.add(txtf1);
		txtf1.setColumns(10);

		txtf2 = new JTextField();
		txtf2.setHorizontalAlignment(SwingConstants.LEFT);
		txtf2.setColumns(10);
		txtf2.setBounds(12, 154, 116, 21);
		ma.add(txtf2);

		txtf3 = new JTextField();
		txtf3.setHorizontalAlignment(SwingConstants.LEFT);
		txtf3.setColumns(10);
		txtf3.setBounds(12, 185, 116, 21);
		ma.add(txtf3);

		JLabel lblButton_1 = new JLabel("TextField 컴포넌트");
		lblButton_1.setFont(new Font("굴림", Font.PLAIN, 12));
		lblButton_1.setBounds(12, 96, 121, 15);
		ma.add(lblButton_1);

		JLabel lblTxtf1Result = new JLabel("결과 : ");
		lblTxtf1Result.setBounds(214, 127, 138, 15);
		ma.add(lblTxtf1Result);

		JLabel lblTxtf2Result = new JLabel("결과 : ");
		lblTxtf2Result.setBounds(214, 157, 139, 15);
		ma.add(lblTxtf2Result);

		JLabel lblTxtf3Result = new JLabel("결과 : ");
		lblTxtf3Result.setBounds(214, 188, 138, 15);
		ma.add(lblTxtf3Result);

		JButton btnTxtf1 = new JButton("확인");
		btnTxtf1.setBounds(136, 123, 66, 23);
		ma.add(btnTxtf1);

		JButton btnTxtf2 = new JButton("확인");
		btnTxtf2.setBounds(136, 153, 66, 23);
		ma.add(btnTxtf2);

		JButton btnTxtf3 = new JButton("확인");
		btnTxtf3.setBounds(136, 184, 66, 23);
		ma.add(btnTxtf3);

		btnTxtf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf1.getText();
				lblTxtf1Result.setText("결과 : " + txt);
			}
		});

		btnTxtf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf2.getText();
				lblTxtf2Result.setText("결과 : " + txt);
			}
		});

		btnTxtf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf3.getText();
				lblTxtf3Result.setText("결과 : " + txt);
			}
		});

		JLabel lblButton_1_1 = new JLabel("CheckBox 컴포넌트");
		lblButton_1_1.setFont(new Font("굴림", Font.PLAIN, 12));
		lblButton_1_1.setBounds(12, 216, 121, 15);
		ma.add(lblButton_1_1);

		JCheckBox chk1 = new JCheckBox("등산");
		chk1.setBounds(28, 256, 57, 23);
		ma.add(chk1);

		JLabel lblButton_1_1_1 = new JLabel("취미를 고르세요.");
		lblButton_1_1_1.setFont(new Font("굴림", Font.PLAIN, 12));
		lblButton_1_1_1.setBounds(22, 234, 121, 15);
		ma.add(lblButton_1_1_1);

		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(89, 256, 57, 23);
		ma.add(chk2);

		JCheckBox chk3 = new JCheckBox("독서");
		chk3.setBounds(150, 256, 57, 23);
		ma.add(chk3);

		JCheckBox chk4 = new JCheckBox("운동");
		chk4.setBounds(214, 256, 57, 23);
		ma.add(chk4);

		JCheckBox chk5 = new JCheckBox("게임");
		chk5.setBounds(274, 256, 57, 23);
		ma.add(chk5);

		JLabel lblChkResult = new JLabel("결과 : ");
		lblChkResult.setBounds(33, 285, 368, 15);
		ma.add(lblChkResult);

		JButton btnChk = new JButton("확인");
		btnChk.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				List<String> chks = new ArrayList<>();

				if (chk1.isSelected()) {
					chks.add(chk1.getText());
				}
				if (chk2.isSelected()) {
					chks.add(chk2.getText());
				}
				if (chk3.isSelected()) {
					chks.add(chk3.getText());
				}
				if (chk4.isSelected()) {
					chks.add(chk4.getText());
				}
				if (chk5.isSelected()) {
					chks.add(chk5.getText());
				}
				lblChkResult.setText("결과 : " + chks.toString());
			}
		});
		btnChk.setBounds(325, 256, 76, 23);
		ma.add(btnChk);

		JLabel lblRadiobutton = new JLabel("RadioButton 컴포넌트");
		lblRadiobutton.setBounds(22, 320, 129, 15);
		ma.add(lblRadiobutton);

		JRadioButton rdMale = new JRadioButton("남자");
		rdMale.setBounds(22, 341, 63, 23);
		ma.add(rdMale);

		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setBounds(111, 341, 63, 23);
		ma.add(rdFemale);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdFemale);
		bg.add(rdMale);

		JLabel lblGenderResult = new JLabel("결과 : ");
		lblGenderResult.setBounds(33, 370, 138, 15);
		ma.add(lblGenderResult);

		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result = null;

				if (rdMale.isSelected()) {
					lblGenderResult.setText("결과 : 남자");
				} else {
					lblGenderResult.setText("결과 : 여자");
				}
			}
		});
		btnGender.setBounds(185, 341, 76, 23);
		ma.add(btnGender);
		
	}
}