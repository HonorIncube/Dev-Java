package TD1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class EX1 extends JFrame {

	/**
	 * 
	 */
	private JPanel contentPane;
	private JTextField Text;
	private JTextField Text_1;
	private JLabel Label_2;
	private JLabel Label_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EX1 frame = new EX1();
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
	public EX1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Text = new JTextField();
		Text.setBounds(69, 104, 178, 23);
		contentPane.add(Text);
		Text.setColumns(10);
		
		JButton Boutton = new JButton("CALCUL");
		Boutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(Text.getText() + "\n" +  Text_1.getText());
				int a = Integer.parseInt(Text.getText());
				int b = Integer.parseInt(Text_1.getText());
				int c = a + b;
				
				String d = String.valueOf(c);
				
				Label_3.setText(d);
				

			}
		});
		Boutton.setBounds(222, 138, 105, 56);
		contentPane.add(Boutton);
		
		Text_1 = new JTextField();
		Text_1.setBounds(298, 104, 162, 23);
		contentPane.add(Text_1);
		Text_1.setColumns(10);
		
		JLabel Label = new JLabel("Chiffre uno");
		Label.setBounds(108, 79, 105, 14);
		contentPane.add(Label);
		
		JLabel Label_1 = new JLabel("Chiffre dos");
		Label_1.setBounds(340, 79, 92, 14);
		contentPane.add(Label_1);
		
		Label_2 = new JLabel("Résultat");
		Label_2.setBounds(255, 205, 49, 14);
		contentPane.add(Label_2);
		
		Label_3 = new JLabel(":");
		Label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Label_3.setBounds(255, 230, 86, 45);
		contentPane.add(Label_3);
	}
}
