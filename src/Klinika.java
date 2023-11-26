import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;

public class Klinika extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Klinika frame = new Klinika();
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
	public Klinika() {
		setTitle("Справочник клиники");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 390);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Местонахождение: ул. Суворова, д. 39");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(SystemColor.text);
		lblNewLabel.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel.setForeground(SystemColor.infoText);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel.setBounds(61, 61, 337, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Телефон регистратуры: 8(863)333-02-14");
		lblNewLabel_1.setForeground(SystemColor.infoText);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(61, 90, 337, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Время работы:");
		lblNewLabel_2.setForeground(SystemColor.infoText);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(61, 135, 337, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Понедельник - пятница: 8:00 - 19:00");
		lblNewLabel_3.setForeground(SystemColor.infoText);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(61, 164, 337, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Перерыв: 13:00 - 14:00");
		lblNewLabel_4.setForeground(SystemColor.infoText);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(61, 193, 337, 30);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Руководитель: Темиров Николай Эдуардович");
		lblNewLabel_5.setForeground(SystemColor.infoText);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(61, 238, 337, 30);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Телефон руководителя: 8(863)002-69-19");
		lblNewLabel_6.setForeground(SystemColor.infoText);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(61, 267, 337, 30);
		contentPane.add(lblNewLabel_6);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(SystemColor.text);
		panel.setBounds(32, 32, 398, 287);
		contentPane.add(panel);
	}
}
