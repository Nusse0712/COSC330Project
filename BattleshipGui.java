import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.FlowLayout;
import java.awt.Panel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
//NOTE: THIS IS NOT THE FINAL GUI. JUST A DESIGN OF OUR GUI 
//DID NOT HAVE TIME TO FINALIZE THE GUI 
public class BattleshipGui extends JFrame {

	private JPanel contentPane;
	private JTextField labeltop;
	private JTextField labelbottom;
	private JTextField txtBattleship;
	private JTextField txtGameByCole;
	private JTextField LogWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BattleshipGui frame = new BattleshipGui();
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
	public BattleshipGui() {
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 964, 656);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GREEN));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel_1 = new Panel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.GREEN);
		panel_1.setBounds(65, 69, 240, 243);
		contentPane.add(panel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		rdbtnNewRadioButton.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton.setBounds(6, 5, 21, 21);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
		rdbtnNewRadioButton_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1.setBounds(29, 5, 21, 21);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("");
		rdbtnNewRadioButton_1_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1_1.setBounds(52, 5, 21, 21);
		panel_1.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("");
		rdbtnNewRadioButton_1_2.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1_2.setBounds(75, 5, 21, 21);
		panel_1.add(rdbtnNewRadioButton_1_2);
		
		JRadioButton rdbtnNewRadioButton_1_3 = new JRadioButton("");
		rdbtnNewRadioButton_1_3.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1_3.setBounds(98, 5, 21, 21);
		panel_1.add(rdbtnNewRadioButton_1_3);
		
		JRadioButton rdbtnNewRadioButton_1_4 = new JRadioButton("");
		rdbtnNewRadioButton_1_4.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1_4.setBounds(121, 5, 21, 21);
		panel_1.add(rdbtnNewRadioButton_1_4);
		
		JRadioButton rdbtnNewRadioButton_1_5 = new JRadioButton("");
		rdbtnNewRadioButton_1_5.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1_5.setBounds(144, 5, 21, 21);
		panel_1.add(rdbtnNewRadioButton_1_5);
		
		JRadioButton rdbtnNewRadioButton_1_6 = new JRadioButton("");
		rdbtnNewRadioButton_1_6.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1_6.setBounds(167, 5, 21, 21);
		panel_1.add(rdbtnNewRadioButton_1_6);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("");
		rdbtnNewRadioButton_2.setForeground(Color.WHITE);
		rdbtnNewRadioButton_2.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_2.setBounds(190, 5, 21, 21);
		panel_1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("");
		rdbtnNewRadioButton_3.setForeground(Color.WHITE);
		rdbtnNewRadioButton_3.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_3.setBounds(213, 5, 21, 21);
		panel_1.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("");
		rdbtnNewRadioButton_4.setForeground(Color.WHITE);
		rdbtnNewRadioButton_4.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_4.setBounds(6, 28, 21, 21);
		panel_1.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("");
		rdbtnNewRadioButton_5.setForeground(Color.WHITE);
		rdbtnNewRadioButton_5.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_5.setBounds(29, 28, 21, 21);
		panel_1.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("");
		rdbtnNewRadioButton_6.setForeground(Color.WHITE);
		rdbtnNewRadioButton_6.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_6.setBounds(52, 28, 21, 21);
		panel_1.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("");
		rdbtnNewRadioButton_7.setForeground(Color.WHITE);
		rdbtnNewRadioButton_7.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_7.setBounds(75, 28, 21, 21);
		panel_1.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("");
		rdbtnNewRadioButton_8.setForeground(Color.WHITE);
		rdbtnNewRadioButton_8.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_8.setBounds(98, 28, 21, 21);
		panel_1.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("");
		rdbtnNewRadioButton_9.setForeground(Color.WHITE);
		rdbtnNewRadioButton_9.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_9.setBounds(121, 28, 21, 21);
		panel_1.add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("");
		rdbtnNewRadioButton_10.setForeground(Color.WHITE);
		rdbtnNewRadioButton_10.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_10.setBounds(144, 28, 21, 21);
		panel_1.add(rdbtnNewRadioButton_10);
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("");
		rdbtnNewRadioButton_11.setForeground(Color.WHITE);
		rdbtnNewRadioButton_11.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_11.setBounds(167, 28, 21, 21);
		panel_1.add(rdbtnNewRadioButton_11);
		
		JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("");
		rdbtnNewRadioButton_12.setForeground(Color.WHITE);
		rdbtnNewRadioButton_12.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_12.setBounds(190, 28, 21, 21);
		panel_1.add(rdbtnNewRadioButton_12);
		
		JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("");
		rdbtnNewRadioButton_13.setForeground(Color.WHITE);
		rdbtnNewRadioButton_13.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_13.setBounds(213, 28, 21, 21);
		panel_1.add(rdbtnNewRadioButton_13);
		
		JRadioButton rdbtnNewRadioButton_14 = new JRadioButton("");
		rdbtnNewRadioButton_14.setForeground(Color.WHITE);
		rdbtnNewRadioButton_14.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_14.setBounds(6, 51, 21, 21);
		panel_1.add(rdbtnNewRadioButton_14);
		
		JRadioButton rdbtnNewRadioButton_15 = new JRadioButton("");
		rdbtnNewRadioButton_15.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15.setBounds(29, 51, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15);
		
		JRadioButton rdbtnNewRadioButton_15_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_1.setBounds(52, 51, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_1);
		
		JRadioButton rdbtnNewRadioButton_15_2 = new JRadioButton("");
		rdbtnNewRadioButton_15_2.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_2.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_2.setBounds(75, 51, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_2);
		
		JRadioButton rdbtnNewRadioButton_15_3 = new JRadioButton("");
		rdbtnNewRadioButton_15_3.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_3.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_3.setBounds(98, 51, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_3);
		
		JRadioButton rdbtnNewRadioButton_15_4 = new JRadioButton("");
		rdbtnNewRadioButton_15_4.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_4.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_4.setBounds(121, 51, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_4);
		
		JRadioButton rdbtnNewRadioButton_15_5 = new JRadioButton("");
		rdbtnNewRadioButton_15_5.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_5.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_5.setBounds(144, 51, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_5);
		
		JRadioButton rdbtnNewRadioButton_15_6 = new JRadioButton("");
		rdbtnNewRadioButton_15_6.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_6.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_6.setBounds(167, 51, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_6);
		
		JRadioButton rdbtnNewRadioButton_15_7 = new JRadioButton("");
		rdbtnNewRadioButton_15_7.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_7.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_7.setBounds(190, 51, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_7);
		
		JRadioButton rdbtnNewRadioButton_15_8 = new JRadioButton("");
		rdbtnNewRadioButton_15_8.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_8.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_8.setBounds(213, 51, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_8);
		
		JRadioButton rdbtnNewRadioButton_15_9 = new JRadioButton("");
		rdbtnNewRadioButton_15_9.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_9.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_9.setBounds(6, 74, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_9);
		
		JRadioButton rdbtnNewRadioButton_15_10 = new JRadioButton("");
		rdbtnNewRadioButton_15_10.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_10.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_10.setBounds(29, 74, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_10);
		
		JRadioButton rdbtnNewRadioButton_15_11 = new JRadioButton("");
		rdbtnNewRadioButton_15_11.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_11.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_11.setBounds(52, 74, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_11);
		
		JRadioButton rdbtnNewRadioButton_15_12 = new JRadioButton("");
		rdbtnNewRadioButton_15_12.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_12.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_12.setBounds(75, 74, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_12);
		
		JRadioButton rdbtnNewRadioButton_15_13 = new JRadioButton("");
		rdbtnNewRadioButton_15_13.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_13.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_13.setBounds(98, 74, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_13);
		
		JRadioButton rdbtnNewRadioButton_15_14 = new JRadioButton("");
		rdbtnNewRadioButton_15_14.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_14.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_14.setBounds(121, 74, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_14);
		
		JRadioButton rdbtnNewRadioButton_15_15 = new JRadioButton("");
		rdbtnNewRadioButton_15_15.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_15.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_15.setBounds(144, 74, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_15);
		
		JRadioButton rdbtnNewRadioButton_15_16 = new JRadioButton("");
		rdbtnNewRadioButton_15_16.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_16.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_16.setBounds(167, 74, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_16);
		
		JRadioButton rdbtnNewRadioButton_15_17 = new JRadioButton("");
		rdbtnNewRadioButton_15_17.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_17.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_17.setBounds(190, 74, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_17);
		
		JRadioButton rdbtnNewRadioButton_15_18 = new JRadioButton("");
		rdbtnNewRadioButton_15_18.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_18.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_18.setBounds(213, 74, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_18);
		
		JRadioButton rdbtnNewRadioButton_15_19 = new JRadioButton("");
		rdbtnNewRadioButton_15_19.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_19.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_19.setBounds(6, 97, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_19);
		
		JRadioButton rdbtnNewRadioButton_15_20 = new JRadioButton("");
		rdbtnNewRadioButton_15_20.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_20.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_20.setBounds(29, 97, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_20);
		
		JRadioButton rdbtnNewRadioButton_15_21 = new JRadioButton("");
		rdbtnNewRadioButton_15_21.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_21.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_21.setBounds(52, 97, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_21);
		
		JRadioButton rdbtnNewRadioButton_15_22 = new JRadioButton("");
		rdbtnNewRadioButton_15_22.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_22.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_22.setBounds(75, 97, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_22);
		
		JRadioButton rdbtnNewRadioButton_15_23 = new JRadioButton("");
		rdbtnNewRadioButton_15_23.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_23.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_23.setBounds(98, 97, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_23);
		
		JRadioButton rdbtnNewRadioButton_15_24 = new JRadioButton("");
		rdbtnNewRadioButton_15_24.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_24.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_24.setBounds(121, 97, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_24);
		
		JRadioButton rdbtnNewRadioButton_15_25 = new JRadioButton("");
		rdbtnNewRadioButton_15_25.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_25.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_25.setBounds(144, 97, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_25);
		
		JRadioButton rdbtnNewRadioButton_15_26 = new JRadioButton("");
		rdbtnNewRadioButton_15_26.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_26.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_26.setBounds(167, 97, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_26);
		
		JRadioButton rdbtnNewRadioButton_15_27 = new JRadioButton("");
		rdbtnNewRadioButton_15_27.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_27.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_27.setBounds(190, 97, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_27);
		
		JRadioButton rdbtnNewRadioButton_15_28 = new JRadioButton("");
		rdbtnNewRadioButton_15_28.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_28.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_28.setBounds(213, 97, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_28);
		
		JRadioButton rdbtnNewRadioButton_15_29 = new JRadioButton("");
		rdbtnNewRadioButton_15_29.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_29.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_29.setBounds(213, 120, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_29);
		
		JRadioButton rdbtnNewRadioButton_15_30 = new JRadioButton("");
		rdbtnNewRadioButton_15_30.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_30.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_30.setBounds(190, 120, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_30);
		
		JRadioButton rdbtnNewRadioButton_15_31 = new JRadioButton("");
		rdbtnNewRadioButton_15_31.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_31.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_31.setBounds(167, 120, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_31);
		
		JRadioButton rdbtnNewRadioButton_15_32 = new JRadioButton("");
		rdbtnNewRadioButton_15_32.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_32.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_32.setBounds(144, 120, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_32);
		
		JRadioButton rdbtnNewRadioButton_15_33 = new JRadioButton("");
		rdbtnNewRadioButton_15_33.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_33.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_33.setBounds(121, 120, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_33);
		
		JRadioButton rdbtnNewRadioButton_15_34 = new JRadioButton("");
		rdbtnNewRadioButton_15_34.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_34.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_34.setBounds(98, 120, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_34);
		
		JRadioButton rdbtnNewRadioButton_15_35 = new JRadioButton("");
		rdbtnNewRadioButton_15_35.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_35.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_35.setBounds(75, 120, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_35);
		
		JRadioButton rdbtnNewRadioButton_15_36 = new JRadioButton("");
		rdbtnNewRadioButton_15_36.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_36.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_36.setBounds(52, 120, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_36);
		
		JRadioButton rdbtnNewRadioButton_15_37 = new JRadioButton("");
		rdbtnNewRadioButton_15_37.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_37.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_37.setBounds(29, 120, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_37);
		
		JRadioButton rdbtnNewRadioButton_15_38 = new JRadioButton("");
		rdbtnNewRadioButton_15_38.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_38.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_38.setBounds(6, 120, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_38);
		
		JRadioButton rdbtnNewRadioButton_15_39 = new JRadioButton("");
		rdbtnNewRadioButton_15_39.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_39.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_39.setBounds(6, 144, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_39);
		
		JRadioButton rdbtnNewRadioButton_15_40 = new JRadioButton("");
		rdbtnNewRadioButton_15_40.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_40.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_40.setBounds(29, 144, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_40);
		
		JRadioButton rdbtnNewRadioButton_15_41 = new JRadioButton("");
		rdbtnNewRadioButton_15_41.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_41.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_41.setBounds(52, 144, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_41);
		
		JRadioButton rdbtnNewRadioButton_15_42 = new JRadioButton("");
		rdbtnNewRadioButton_15_42.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_42.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_42.setBounds(75, 144, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_42);
		
		JRadioButton rdbtnNewRadioButton_15_43 = new JRadioButton("");
		rdbtnNewRadioButton_15_43.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_43.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_43.setBounds(98, 144, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_43);
		
		JRadioButton rdbtnNewRadioButton_15_44 = new JRadioButton("");
		rdbtnNewRadioButton_15_44.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_44.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_44.setBounds(121, 143, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_44);
		
		JRadioButton rdbtnNewRadioButton_15_45 = new JRadioButton("");
		rdbtnNewRadioButton_15_45.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_45.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_45.setBounds(144, 144, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_45);
		
		JRadioButton rdbtnNewRadioButton_15_46 = new JRadioButton("");
		rdbtnNewRadioButton_15_46.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_46.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_46.setBounds(167, 143, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_46);
		
		JRadioButton rdbtnNewRadioButton_15_47 = new JRadioButton("");
		rdbtnNewRadioButton_15_47.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_47.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_47.setBounds(190, 143, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_47);
		
		JRadioButton rdbtnNewRadioButton_15_48 = new JRadioButton("");
		rdbtnNewRadioButton_15_48.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_48.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_48.setBounds(213, 144, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_48);
		
		JRadioButton rdbtnNewRadioButton_15_49 = new JRadioButton("");
		rdbtnNewRadioButton_15_49.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_49.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_49.setBounds(6, 167, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_49);
		
		JRadioButton rdbtnNewRadioButton_15_50 = new JRadioButton("");
		rdbtnNewRadioButton_15_50.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_50.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_50.setBounds(29, 167, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_50);
		
		JRadioButton rdbtnNewRadioButton_15_51 = new JRadioButton("");
		rdbtnNewRadioButton_15_51.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_51.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_51.setBounds(52, 167, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_51);
		
		JRadioButton rdbtnNewRadioButton_15_52 = new JRadioButton("");
		rdbtnNewRadioButton_15_52.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_52.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_52.setBounds(75, 167, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_52);
		
		JRadioButton rdbtnNewRadioButton_15_53 = new JRadioButton("");
		rdbtnNewRadioButton_15_53.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_53.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_53.setBounds(98, 167, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_53);
		
		JRadioButton rdbtnNewRadioButton_15_54 = new JRadioButton("");
		rdbtnNewRadioButton_15_54.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_54.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_54.setBounds(121, 166, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_54);
		
		JRadioButton rdbtnNewRadioButton_15_55 = new JRadioButton("");
		rdbtnNewRadioButton_15_55.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_55.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_55.setBounds(144, 167, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_55);
		
		JRadioButton rdbtnNewRadioButton_15_56 = new JRadioButton("");
		rdbtnNewRadioButton_15_56.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_56.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_56.setBounds(167, 166, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_56);
		
		JRadioButton rdbtnNewRadioButton_15_57 = new JRadioButton("");
		rdbtnNewRadioButton_15_57.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_57.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_57.setBounds(190, 166, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_57);
		
		JRadioButton rdbtnNewRadioButton_15_58 = new JRadioButton("");
		rdbtnNewRadioButton_15_58.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_58.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_58.setBounds(213, 167, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_58);
		
		JRadioButton rdbtnNewRadioButton_15_59 = new JRadioButton("");
		rdbtnNewRadioButton_15_59.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_59.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_59.setBounds(6, 190, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_59);
		
		JRadioButton rdbtnNewRadioButton_15_60 = new JRadioButton("");
		rdbtnNewRadioButton_15_60.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60.setBounds(29, 190, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_60);
		
		JRadioButton rdbtnNewRadioButton_15_60_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_1.setBounds(52, 190, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_60_1);
		
		JRadioButton rdbtnNewRadioButton_15_60_2 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_2.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_2.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_2.setBounds(75, 190, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_60_2);
		
		JRadioButton rdbtnNewRadioButton_15_60_3 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_3.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_3.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_3.setBounds(98, 190, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_60_3);
		
		JRadioButton rdbtnNewRadioButton_15_60_4 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_4.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_4.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_4.setBounds(121, 190, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_60_4);
		
		JRadioButton rdbtnNewRadioButton_15_60_5 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_5.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_5.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_5.setBounds(144, 190, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_60_5);
		
		JRadioButton rdbtnNewRadioButton_15_60_6 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_6.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_6.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_6.setBounds(167, 189, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_60_6);
		
		JRadioButton rdbtnNewRadioButton_15_60_7 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_7.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_7.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_7.setBounds(190, 189, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_60_7);
		
		JRadioButton rdbtnNewRadioButton_15_60_8 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_8.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_8.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_8.setBounds(213, 190, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_60_8);
		
		JRadioButton rdbtnNewRadioButton_15_59_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_59_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_59_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_59_1.setBounds(6, 214, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_59_1);
		
		JRadioButton rdbtnNewRadioButton_15_60_9 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_9.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_9.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_9.setBounds(29, 214, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_60_9);
		
		JRadioButton rdbtnNewRadioButton_15_60_1_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_1_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_1_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_1_1.setBounds(52, 214, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_60_1_1);
		
		JRadioButton rdbtnNewRadioButton_15_60_2_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_2_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_2_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_2_1.setBounds(75, 214, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_60_2_1);
		
		JRadioButton rdbtnNewRadioButton_15_60_3_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_3_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_3_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_3_1.setBounds(98, 214, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_60_3_1);
		
		JRadioButton rdbtnNewRadioButton_15_60_4_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_4_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_4_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_4_1.setBounds(121, 214, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_60_4_1);
		
		JRadioButton rdbtnNewRadioButton_15_60_5_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_5_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_5_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_5_1.setBounds(144, 214, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_60_5_1);
		
		JRadioButton rdbtnNewRadioButton_15_60_6_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_6_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_6_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_6_1.setBounds(167, 213, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_60_6_1);
		
		JRadioButton rdbtnNewRadioButton_15_60_7_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_7_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_7_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_7_1.setBounds(190, 213, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_60_7_1);
		
		JRadioButton rdbtnNewRadioButton_15_60_8_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_8_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_8_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_8_1.setBounds(213, 214, 21, 21);
		panel_1.add(rdbtnNewRadioButton_15_60_8_1);
		
		labeltop = new JTextField();
		labeltop.setEditable(false);
		labeltop.setHorizontalAlignment(SwingConstants.CENTER);
		labeltop.setForeground(Color.GREEN);
		labeltop.setBackground(Color.DARK_GRAY);
		labeltop.setFont(new Font("Verdana", Font.BOLD, 17));
		labeltop.setText("A  B  C  D  E  F  G H  I  J\r\n");
		labeltop.setBounds(65, 30, 237, 33);
		contentPane.add(labeltop);
		labeltop.setColumns(10);
		
		JLabel zero = new JLabel("0");
		zero.setForeground(Color.GREEN);
		zero.setFont(new Font("Tahoma", Font.BOLD, 17));
		zero.setBounds(42, 79, 18, 13);
		contentPane.add(zero);
		
		JLabel one = new JLabel("1");
		one.setForeground(Color.GREEN);
		one.setFont(new Font("Tahoma", Font.BOLD, 17));
		one.setBounds(42, 102, 18, 13);
		contentPane.add(one);
		
		JLabel two = new JLabel("2");
		two.setForeground(Color.GREEN);
		two.setFont(new Font("Tahoma", Font.BOLD, 17));
		two.setBounds(42, 125, 18, 13);
		contentPane.add(two);
		
		JLabel three = new JLabel("3");
		three.setForeground(Color.GREEN);
		three.setFont(new Font("Tahoma", Font.BOLD, 17));
		three.setBounds(42, 148, 18, 13);
		contentPane.add(three);
		
		JLabel four = new JLabel("4");
		four.setForeground(Color.GREEN);
		four.setFont(new Font("Tahoma", Font.BOLD, 17));
		four.setBounds(41, 171, 18, 13);
		contentPane.add(four);
		
		JLabel five = new JLabel("5");
		five.setForeground(Color.GREEN);
		five.setFont(new Font("Tahoma", Font.BOLD, 17));
		five.setBounds(42, 194, 18, 13);
		contentPane.add(five);
		
		JLabel six = new JLabel("6");
		six.setForeground(Color.GREEN);
		six.setFont(new Font("Tahoma", Font.BOLD, 17));
		six.setBounds(42, 217, 18, 13);
		contentPane.add(six);
		
		JLabel seven = new JLabel("7");
		seven.setForeground(Color.GREEN);
		seven.setFont(new Font("Tahoma", Font.BOLD, 17));
		seven.setBounds(42, 240, 18, 13);
		contentPane.add(seven);
		
		JLabel eight = new JLabel("8");
		eight.setForeground(Color.GREEN);
		eight.setFont(new Font("Tahoma", Font.BOLD, 17));
		eight.setBounds(41, 263, 18, 13);
		contentPane.add(eight);
		
		JLabel nine = new JLabel("9");
		nine.setForeground(Color.GREEN);
		nine.setFont(new Font("Tahoma", Font.BOLD, 17));
		nine.setBounds(41, 286, 18, 13);
		contentPane.add(nine);
		
		Panel panel_1_1 = new Panel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.GREEN);
		panel_1_1.setBounds(65, 346, 240, 243);
		contentPane.add(panel_1_1);
		
		JRadioButton rdbtnNewRadioButton_16 = new JRadioButton("");
		rdbtnNewRadioButton_16.setForeground(Color.WHITE);
		rdbtnNewRadioButton_16.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_16.setBounds(6, 5, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_16);
		
		JRadioButton rdbtnNewRadioButton_1_7 = new JRadioButton("");
		rdbtnNewRadioButton_1_7.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1_7.setBounds(29, 5, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_1_7);
		
		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("");
		rdbtnNewRadioButton_1_1_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1_1_1.setBounds(52, 5, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_2_1 = new JRadioButton("");
		rdbtnNewRadioButton_1_2_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1_2_1.setBounds(75, 5, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_1_2_1);
		
		JRadioButton rdbtnNewRadioButton_1_3_1 = new JRadioButton("");
		rdbtnNewRadioButton_1_3_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1_3_1.setBounds(98, 5, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_1_3_1);
		
		JRadioButton rdbtnNewRadioButton_1_4_1 = new JRadioButton("");
		rdbtnNewRadioButton_1_4_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1_4_1.setBounds(121, 5, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_1_4_1);
		
		JRadioButton rdbtnNewRadioButton_1_5_1 = new JRadioButton("");
		rdbtnNewRadioButton_1_5_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1_5_1.setBounds(144, 5, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_1_5_1);
		
		JRadioButton rdbtnNewRadioButton_1_6_1 = new JRadioButton("");
		rdbtnNewRadioButton_1_6_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1_6_1.setBounds(167, 5, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_1_6_1);
		
		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("");
		rdbtnNewRadioButton_2_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_2_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_2_1.setBounds(190, 5, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_2_1);
		
		JRadioButton rdbtnNewRadioButton_3_1 = new JRadioButton("");
		rdbtnNewRadioButton_3_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_3_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_3_1.setBounds(213, 5, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_3_1);
		
		JRadioButton rdbtnNewRadioButton_4_1 = new JRadioButton("");
		rdbtnNewRadioButton_4_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_4_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_4_1.setBounds(6, 28, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_4_1);
		
		JRadioButton rdbtnNewRadioButton_5_1 = new JRadioButton("");
		rdbtnNewRadioButton_5_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_5_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_5_1.setBounds(29, 28, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_5_1);
		
		JRadioButton rdbtnNewRadioButton_6_1 = new JRadioButton("");
		rdbtnNewRadioButton_6_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_6_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_6_1.setBounds(52, 28, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_6_1);
		
		JRadioButton rdbtnNewRadioButton_7_1 = new JRadioButton("");
		rdbtnNewRadioButton_7_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_7_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_7_1.setBounds(75, 28, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_7_1);
		
		JRadioButton rdbtnNewRadioButton_8_1 = new JRadioButton("");
		rdbtnNewRadioButton_8_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_8_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_8_1.setBounds(98, 28, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_8_1);
		
		JRadioButton rdbtnNewRadioButton_9_1 = new JRadioButton("");
		rdbtnNewRadioButton_9_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_9_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_9_1.setBounds(121, 28, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_9_1);
		
		JRadioButton rdbtnNewRadioButton_10_1 = new JRadioButton("");
		rdbtnNewRadioButton_10_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_10_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_10_1.setBounds(144, 28, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_10_1);
		
		JRadioButton rdbtnNewRadioButton_11_1 = new JRadioButton("");
		rdbtnNewRadioButton_11_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_11_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_11_1.setBounds(167, 28, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_11_1);
		
		JRadioButton rdbtnNewRadioButton_12_1 = new JRadioButton("");
		rdbtnNewRadioButton_12_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_12_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_12_1.setBounds(190, 28, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_12_1);
		
		JRadioButton rdbtnNewRadioButton_13_1 = new JRadioButton("");
		rdbtnNewRadioButton_13_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_13_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_13_1.setBounds(213, 28, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_13_1);
		
		JRadioButton rdbtnNewRadioButton_14_1 = new JRadioButton("");
		rdbtnNewRadioButton_14_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_14_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_14_1.setBounds(6, 51, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_14_1);
		
		JRadioButton rdbtnNewRadioButton_15_61 = new JRadioButton("");
		rdbtnNewRadioButton_15_61.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_61.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_61.setBounds(29, 51, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_61);
		
		JRadioButton rdbtnNewRadioButton_15_1_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_1_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_1_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_1_1.setBounds(52, 51, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_1_1);
		
		JRadioButton rdbtnNewRadioButton_15_2_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_2_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_2_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_2_1.setBounds(75, 51, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_2_1);
		
		JRadioButton rdbtnNewRadioButton_15_3_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_3_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_3_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_3_1.setBounds(98, 51, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_3_1);
		
		JRadioButton rdbtnNewRadioButton_15_4_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_4_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_4_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_4_1.setBounds(121, 51, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_4_1);
		
		JRadioButton rdbtnNewRadioButton_15_5_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_5_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_5_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_5_1.setBounds(144, 51, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_5_1);
		
		JRadioButton rdbtnNewRadioButton_15_6_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_6_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_6_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_6_1.setBounds(167, 51, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_6_1);
		
		JRadioButton rdbtnNewRadioButton_15_7_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_7_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_7_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_7_1.setBounds(190, 51, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_7_1);
		
		JRadioButton rdbtnNewRadioButton_15_8_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_8_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_8_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_8_1.setBounds(213, 51, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_8_1);
		
		JRadioButton rdbtnNewRadioButton_15_9_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_9_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_9_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_9_1.setBounds(6, 74, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_9_1);
		
		JRadioButton rdbtnNewRadioButton_15_10_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_10_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_10_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_10_1.setBounds(29, 74, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_10_1);
		
		JRadioButton rdbtnNewRadioButton_15_11_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_11_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_11_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_11_1.setBounds(52, 74, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_11_1);
		
		JRadioButton rdbtnNewRadioButton_15_12_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_12_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_12_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_12_1.setBounds(75, 74, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_12_1);
		
		JRadioButton rdbtnNewRadioButton_15_13_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_13_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_13_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_13_1.setBounds(98, 74, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_13_1);
		
		JRadioButton rdbtnNewRadioButton_15_14_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_14_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_14_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_14_1.setBounds(121, 74, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_14_1);
		
		JRadioButton rdbtnNewRadioButton_15_15_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_15_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_15_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_15_1.setBounds(144, 74, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_15_1);
		
		JRadioButton rdbtnNewRadioButton_15_16_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_16_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_16_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_16_1.setBounds(167, 74, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_16_1);
		
		JRadioButton rdbtnNewRadioButton_15_17_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_17_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_17_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_17_1.setBounds(190, 74, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_17_1);
		
		JRadioButton rdbtnNewRadioButton_15_18_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_18_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_18_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_18_1.setBounds(213, 74, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_18_1);
		
		JRadioButton rdbtnNewRadioButton_15_19_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_19_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_19_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_19_1.setBounds(6, 97, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_19_1);
		
		JRadioButton rdbtnNewRadioButton_15_20_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_20_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_20_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_20_1.setBounds(29, 97, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_20_1);
		
		JRadioButton rdbtnNewRadioButton_15_21_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_21_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_21_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_21_1.setBounds(52, 97, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_21_1);
		
		JRadioButton rdbtnNewRadioButton_15_22_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_22_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_22_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_22_1.setBounds(75, 97, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_22_1);
		
		JRadioButton rdbtnNewRadioButton_15_23_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_23_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_23_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_23_1.setBounds(98, 97, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_23_1);
		
		JRadioButton rdbtnNewRadioButton_15_24_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_24_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_24_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_24_1.setBounds(121, 97, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_24_1);
		
		JRadioButton rdbtnNewRadioButton_15_25_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_25_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_25_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_25_1.setBounds(144, 97, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_25_1);
		
		JRadioButton rdbtnNewRadioButton_15_26_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_26_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_26_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_26_1.setBounds(167, 97, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_26_1);
		
		JRadioButton rdbtnNewRadioButton_15_27_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_27_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_27_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_27_1.setBounds(190, 97, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_27_1);
		
		JRadioButton rdbtnNewRadioButton_15_28_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_28_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_28_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_28_1.setBounds(213, 97, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_28_1);
		
		JRadioButton rdbtnNewRadioButton_15_29_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_29_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_29_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_29_1.setBounds(213, 120, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_29_1);
		
		JRadioButton rdbtnNewRadioButton_15_30_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_30_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_30_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_30_1.setBounds(190, 120, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_30_1);
		
		JRadioButton rdbtnNewRadioButton_15_31_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_31_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_31_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_31_1.setBounds(167, 120, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_31_1);
		
		JRadioButton rdbtnNewRadioButton_15_32_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_32_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_32_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_32_1.setBounds(144, 120, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_32_1);
		
		JRadioButton rdbtnNewRadioButton_15_33_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_33_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_33_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_33_1.setBounds(121, 120, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_33_1);
		
		JRadioButton rdbtnNewRadioButton_15_34_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_34_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_34_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_34_1.setBounds(98, 120, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_34_1);
		
		JRadioButton rdbtnNewRadioButton_15_35_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_35_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_35_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_35_1.setBounds(75, 120, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_35_1);
		
		JRadioButton rdbtnNewRadioButton_15_36_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_36_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_36_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_36_1.setBounds(52, 120, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_36_1);
		
		JRadioButton rdbtnNewRadioButton_15_37_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_37_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_37_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_37_1.setBounds(29, 120, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_37_1);
		
		JRadioButton rdbtnNewRadioButton_15_38_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_38_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_38_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_38_1.setBounds(6, 120, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_38_1);
		
		JRadioButton rdbtnNewRadioButton_15_39_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_39_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_39_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_39_1.setBounds(6, 144, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_39_1);
		
		JRadioButton rdbtnNewRadioButton_15_40_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_40_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_40_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_40_1.setBounds(29, 144, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_40_1);
		
		JRadioButton rdbtnNewRadioButton_15_41_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_41_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_41_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_41_1.setBounds(52, 144, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_41_1);
		
		JRadioButton rdbtnNewRadioButton_15_42_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_42_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_42_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_42_1.setBounds(75, 144, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_42_1);
		
		JRadioButton rdbtnNewRadioButton_15_43_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_43_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_43_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_43_1.setBounds(98, 144, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_43_1);
		
		JRadioButton rdbtnNewRadioButton_15_44_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_44_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_44_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_44_1.setBounds(121, 143, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_44_1);
		
		JRadioButton rdbtnNewRadioButton_15_45_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_45_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_45_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_45_1.setBounds(144, 144, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_45_1);
		
		JRadioButton rdbtnNewRadioButton_15_46_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_46_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_46_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_46_1.setBounds(167, 143, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_46_1);
		
		JRadioButton rdbtnNewRadioButton_15_47_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_47_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_47_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_47_1.setBounds(190, 143, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_47_1);
		
		JRadioButton rdbtnNewRadioButton_15_48_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_48_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_48_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_48_1.setBounds(213, 144, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_48_1);
		
		JRadioButton rdbtnNewRadioButton_15_49_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_49_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_49_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_49_1.setBounds(6, 167, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_49_1);
		
		JRadioButton rdbtnNewRadioButton_15_50_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_50_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_50_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_50_1.setBounds(29, 167, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_50_1);
		
		JRadioButton rdbtnNewRadioButton_15_51_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_51_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_51_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_51_1.setBounds(52, 167, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_51_1);
		
		JRadioButton rdbtnNewRadioButton_15_52_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_52_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_52_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_52_1.setBounds(75, 167, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_52_1);
		
		JRadioButton rdbtnNewRadioButton_15_53_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_53_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_53_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_53_1.setBounds(98, 167, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_53_1);
		
		JRadioButton rdbtnNewRadioButton_15_54_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_54_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_54_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_54_1.setBounds(121, 166, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_54_1);
		
		JRadioButton rdbtnNewRadioButton_15_55_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_55_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_55_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_55_1.setBounds(144, 167, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_55_1);
		
		JRadioButton rdbtnNewRadioButton_15_56_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_56_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_56_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_56_1.setBounds(167, 166, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_56_1);
		
		JRadioButton rdbtnNewRadioButton_15_57_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_57_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_57_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_57_1.setBounds(190, 166, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_57_1);
		
		JRadioButton rdbtnNewRadioButton_15_58_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_58_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_58_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_58_1.setBounds(213, 167, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_58_1);
		
		JRadioButton rdbtnNewRadioButton_15_59_2 = new JRadioButton("");
		rdbtnNewRadioButton_15_59_2.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_59_2.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_59_2.setBounds(6, 190, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_59_2);
		
		JRadioButton rdbtnNewRadioButton_15_60_10 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_10.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_10.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_10.setBounds(29, 190, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_60_10);
		
		JRadioButton rdbtnNewRadioButton_15_60_1_2 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_1_2.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_1_2.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_1_2.setBounds(52, 190, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_60_1_2);
		
		JRadioButton rdbtnNewRadioButton_15_60_2_2 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_2_2.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_2_2.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_2_2.setBounds(75, 190, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_60_2_2);
		
		JRadioButton rdbtnNewRadioButton_15_60_3_2 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_3_2.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_3_2.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_3_2.setBounds(98, 190, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_60_3_2);
		
		JRadioButton rdbtnNewRadioButton_15_60_4_2 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_4_2.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_4_2.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_4_2.setBounds(121, 190, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_60_4_2);
		
		JRadioButton rdbtnNewRadioButton_15_60_5_2 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_5_2.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_5_2.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_5_2.setBounds(144, 190, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_60_5_2);
		
		JRadioButton rdbtnNewRadioButton_15_60_6_2 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_6_2.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_6_2.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_6_2.setBounds(167, 189, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_60_6_2);
		
		JRadioButton rdbtnNewRadioButton_15_60_7_2 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_7_2.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_7_2.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_7_2.setBounds(190, 189, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_60_7_2);
		
		JRadioButton rdbtnNewRadioButton_15_60_8_2 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_8_2.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_8_2.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_8_2.setBounds(213, 190, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_60_8_2);
		
		JRadioButton rdbtnNewRadioButton_15_59_1_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_59_1_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_59_1_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_59_1_1.setBounds(6, 214, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_59_1_1);
		
		JRadioButton rdbtnNewRadioButton_15_60_9_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_9_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_9_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_9_1.setBounds(29, 214, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_60_9_1);
		
		JRadioButton rdbtnNewRadioButton_15_60_1_1_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_1_1_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_1_1_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_1_1_1.setBounds(52, 214, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_60_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_15_60_2_1_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_2_1_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_2_1_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_2_1_1.setBounds(75, 214, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_60_2_1_1);
		
		JRadioButton rdbtnNewRadioButton_15_60_3_1_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_3_1_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_3_1_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_3_1_1.setBounds(98, 214, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_60_3_1_1);
		
		JRadioButton rdbtnNewRadioButton_15_60_4_1_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_4_1_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_4_1_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_4_1_1.setBounds(121, 214, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_60_4_1_1);
		
		JRadioButton rdbtnNewRadioButton_15_60_5_1_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_5_1_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_5_1_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_5_1_1.setBounds(144, 214, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_60_5_1_1);
		
		JRadioButton rdbtnNewRadioButton_15_60_6_1_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_6_1_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_6_1_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_6_1_1.setBounds(167, 213, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_60_6_1_1);
		
		JRadioButton rdbtnNewRadioButton_15_60_7_1_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_7_1_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_7_1_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_7_1_1.setBounds(190, 213, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_60_7_1_1);
		
		JRadioButton rdbtnNewRadioButton_15_60_8_1_1 = new JRadioButton("");
		rdbtnNewRadioButton_15_60_8_1_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_15_60_8_1_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_15_60_8_1_1.setBounds(213, 214, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_15_60_8_1_1);
		
		labelbottom = new JTextField();
		labelbottom.setText("A  B  C  D  E  F  G H  I  J\r\n");
		labelbottom.setHorizontalAlignment(SwingConstants.CENTER);
		labelbottom.setForeground(Color.GREEN);
		labelbottom.setFont(new Font("Verdana", Font.BOLD, 17));
		labelbottom.setEditable(false);
		labelbottom.setColumns(10);
		labelbottom.setBackground(Color.DARK_GRAY);
		labelbottom.setBounds(65, 307, 237, 33);
		contentPane.add(labelbottom);
		
		JLabel bzero = new JLabel("0");
		bzero.setForeground(Color.GREEN);
		bzero.setFont(new Font("Tahoma", Font.BOLD, 17));
		bzero.setBounds(43, 357, 18, 13);
		contentPane.add(bzero);
		
		JLabel bone = new JLabel("1");
		bone.setForeground(Color.GREEN);
		bone.setFont(new Font("Tahoma", Font.BOLD, 17));
		bone.setBounds(43, 380, 18, 13);
		contentPane.add(bone);
		
		JLabel btwo = new JLabel("2");
		btwo.setForeground(Color.GREEN);
		btwo.setFont(new Font("Tahoma", Font.BOLD, 17));
		btwo.setBounds(43, 403, 18, 13);
		contentPane.add(btwo);
		
		JLabel bthree = new JLabel("3");
		bthree.setForeground(Color.GREEN);
		bthree.setFont(new Font("Tahoma", Font.BOLD, 17));
		bthree.setBounds(43, 426, 18, 13);
		contentPane.add(bthree);
		
		JLabel bfour = new JLabel("4");
		bfour.setForeground(Color.GREEN);
		bfour.setFont(new Font("Tahoma", Font.BOLD, 17));
		bfour.setBounds(42, 449, 18, 13);
		contentPane.add(bfour);
		
		JLabel bfive = new JLabel("5");
		bfive.setForeground(Color.GREEN);
		bfive.setFont(new Font("Tahoma", Font.BOLD, 17));
		bfive.setBounds(43, 472, 18, 13);
		contentPane.add(bfive);
		
		JLabel bsix = new JLabel("6");
		bsix.setForeground(Color.GREEN);
		bsix.setFont(new Font("Tahoma", Font.BOLD, 17));
		bsix.setBounds(43, 495, 18, 13);
		contentPane.add(bsix);
		
		JLabel bseven = new JLabel("7");
		bseven.setForeground(Color.GREEN);
		bseven.setFont(new Font("Tahoma", Font.BOLD, 17));
		bseven.setBounds(43, 518, 18, 13);
		contentPane.add(bseven);
		
		JLabel beight = new JLabel("8");
		beight.setForeground(Color.GREEN);
		beight.setFont(new Font("Tahoma", Font.BOLD, 17));
		beight.setBounds(42, 541, 18, 13);
		contentPane.add(beight);
		
		JLabel bnine = new JLabel("9");
		bnine.setForeground(Color.GREEN);
		bnine.setFont(new Font("Tahoma", Font.BOLD, 17));
		bnine.setBounds(42, 564, 18, 13);
		contentPane.add(bnine);
		
		txtBattleship = new JTextField();
		txtBattleship.setEditable(false);
		txtBattleship.setBackground(Color.GRAY);
		txtBattleship.setForeground(Color.GREEN);
		txtBattleship.setFont(new Font("Tahoma", Font.BOLD, 72));
		txtBattleship.setText("BATTLESHIP");
		txtBattleship.setBounds(396, 40, 502, 79);
		contentPane.add(txtBattleship);
		txtBattleship.setColumns(10);
		
		txtGameByCole = new JTextField();
		txtGameByCole.setBackground(Color.DARK_GRAY);
		txtGameByCole.setForeground(Color.GREEN);
		txtGameByCole.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtGameByCole.setText("Game by Cole Nussear and George Fotiou");
		txtGameByCole.setBounds(398, 148, 500, 36);
		contentPane.add(txtGameByCole);
		txtGameByCole.setColumns(10);
		
		JButton firebtn = new JButton("FIRE");
		firebtn.setBackground(Color.DARK_GRAY);
		firebtn.setForeground(Color.GREEN);
		firebtn.setFont(new Font("Verdana", Font.BOLD, 20));
		firebtn.setBounds(351, 240, 195, 77);
		contentPane.add(firebtn);
		
		JPanel ShipYard = new JPanel();
		ShipYard.setBackground(Color.LIGHT_GRAY);
		ShipYard.setBounds(340, 403, 205, 183);
		contentPane.add(ShipYard);
		
		JLabel lblNewLabel_11 = new JLabel("Ships");
		lblNewLabel_11.setForeground(Color.GREEN);
		lblNewLabel_11.setLabelFor(ShipYard);
		ShipYard.setLayout(null);
		
		JLabel carrier = new JLabel("| % % % % % |");
		carrier.setFont(new Font("Tahoma", Font.PLAIN, 17));
		carrier.setBounds(10, 10, 150, 29);
		ShipYard.add(carrier);
		carrier.setBackground(Color.DARK_GRAY);
		carrier.setForeground(Color.BLACK);
		
		JLabel battleship = new JLabel("| # # # # |");
		battleship.setForeground(Color.BLACK);
		battleship.setFont(new Font("Tahoma", Font.PLAIN, 17));
		battleship.setBackground(Color.DARK_GRAY);
		battleship.setBounds(10, 49, 112, 29);
		ShipYard.add(battleship);
		
		JLabel cruiser = new JLabel("| & & & |");
		cruiser.setForeground(Color.BLACK);
		cruiser.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cruiser.setBackground(Color.DARK_GRAY);
		cruiser.setBounds(10, 88, 82, 29);
		ShipYard.add(cruiser);
		
		JLabel Submarine = new JLabel("| ! ! ! |");
		Submarine.setForeground(Color.BLACK);
		Submarine.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Submarine.setBackground(Color.DARK_GRAY);
		Submarine.setBounds(10, 118, 61, 29);
		ShipYard.add(Submarine);
		
		JLabel destroyer = new JLabel("| ? ? |");
		destroyer.setForeground(Color.BLACK);
		destroyer.setFont(new Font("Tahoma", Font.PLAIN, 17));
		destroyer.setBackground(Color.DARK_GRAY);
		destroyer.setBounds(119, 118, 54, 29);
		ShipYard.add(destroyer);
		lblNewLabel_11.setBackground(Color.GRAY);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_11.setBounds(412, 360, 86, 50);
		contentPane.add(lblNewLabel_11);
		
		LogWindow = new JTextField();
		LogWindow.setEditable(false);
		LogWindow.setBackground(Color.GRAY);
		LogWindow.setForeground(Color.GREEN);
		LogWindow.setFont(new Font("Tahoma", Font.PLAIN, 16));
		LogWindow.setHorizontalAlignment(SwingConstants.LEFT);
		LogWindow.setText("Please place the ships on the grid...");
		LogWindow.setBounds(620, 217, 303, 153);
		contentPane.add(LogWindow);
		LogWindow.setColumns(10);
		
		JLabel LogLabel = new JLabel("Log");
		LogLabel.setLabelFor(LogWindow);
		LogLabel.setForeground(Color.GREEN);
		LogLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		LogLabel.setBackground(Color.GRAY);
		LogLabel.setBounds(749, 174, 86, 50);
		contentPane.add(LogLabel);
		
		JList list = new JList();
		list.setBackground(Color.YELLOW);
		list.setBounds(795, 562, -166, -102);
		contentPane.add(list);
		
		JTextArea shipStats = new JTextArea();
		shipStats.setEditable(false);
		shipStats.setBackground(Color.DARK_GRAY);
		shipStats.setFont(new Font("Tahoma", Font.BOLD, 16));
		shipStats.setForeground(Color.GREEN);
		shipStats.setText("Carrier (%) Holes Left: 5 \r\nBattleship (#) Holes Left: 4 \r\nCruiser(&) Holes Left: 3 \r\nSubmarine(!) Holes Left: 3 \r\nDestroyer(?) Holes Left: 2 ");
		shipStats.setBounds(641, 490, 299, 128);
		contentPane.add(shipStats);
		
		JTextArea txtrEnemyShipsLeft = new JTextArea();
		txtrEnemyShipsLeft.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtrEnemyShipsLeft.setForeground(Color.GREEN);
		txtrEnemyShipsLeft.setBackground(Color.DARK_GRAY);
		txtrEnemyShipsLeft.setEditable(false);
		txtrEnemyShipsLeft.setText("Enemy Ships Left: 5");
		txtrEnemyShipsLeft.setBounds(641, 463, 231, 29);
		contentPane.add(txtrEnemyShipsLeft);
		
		JLabel statLabel = new JLabel("Stats");
		statLabel.setLabelFor(txtrEnemyShipsLeft);
		statLabel.setForeground(Color.GREEN);
		statLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		statLabel.setBounds(725, 423, 86, 16);
		contentPane.add(statLabel);
	}
}
