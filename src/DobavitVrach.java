import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;

public class DobavitVrach extends JFrame {

	private JPanel contentPane;
	private static JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DobavitVrach frame = new DobavitVrach(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	String dolgnost;
	String fio;
	String pn;
	String vt;
	String sr;
	String cht;
	String pt;
	String vremyaPriema;
	private JTextField textField_1;
    
	/**
	 * Create the frame.
	 * @param model 
	 */
	public DobavitVrach(DefaultTableModel model) {
		setBackground(SystemColor.control);	
		setTitle("Добавить врача");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 327, 419);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Должность");
		lblNewLabel.setForeground(SystemColor.infoText);
		lblNewLabel.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(SystemColor.control);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 11, 105, 30);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(SystemColor.infoText);
		comboBox.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		comboBox.setBackground(SystemColor.control);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Главный врач", "Заместитель глав.врача", "Терапевт", "Офтальмолог", "Офтальмохирург",
				"Лазерный офтальмохирург", "Анастезиолог-реаниматолог"}));
		comboBox.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		comboBox.setBounds(127, 12, 173, 30);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("ФИО");
		lblNewLabel_1.setForeground(SystemColor.infoText);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_1.setBackground(SystemColor.control);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_1.setBounds(12, 52, 105, 30);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField.getText().length() >= 60)
					e.consume();
		    }
		});
		textField.setForeground(SystemColor.infoText);
		textField.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(127, 53, 173, 30);
		contentPane.add(textField);
		
		JLabel lblNewLabel_4 = new JLabel("Понедельник");
		lblNewLabel_4.setForeground(SystemColor.infoText);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_4.setBackground(SystemColor.control);
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_4.setBounds(12, 93, 105, 30);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(SystemColor.infoText);
		comboBox_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		comboBox_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		comboBox_1.setBackground(SystemColor.control);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Да", "Нет"}));
		comboBox_1.setBounds(127, 93, 173, 30);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_5 = new JLabel("Вторник");
		lblNewLabel_5.setForeground(SystemColor.infoText);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_5.setBackground(SystemColor.control);
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_5.setBounds(12, 134, 105, 30);
		contentPane.add(lblNewLabel_5);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setForeground(SystemColor.infoText);
		comboBox_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		comboBox_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		comboBox_2.setBackground(SystemColor.control);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Да", "Нет"}));
		comboBox_2.setBounds(127, 134, 173, 30);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_6 = new JLabel("Среда");
		lblNewLabel_6.setForeground(SystemColor.infoText);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_6.setBackground(SystemColor.control);
		lblNewLabel_6.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_6.setBounds(12, 175, 105, 30);
		contentPane.add(lblNewLabel_6);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setForeground(SystemColor.infoText);
		comboBox_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		comboBox_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		comboBox_3.setBackground(SystemColor.control);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Да", "Нет"}));
		comboBox_3.setBounds(127, 175, 173, 30);
		contentPane.add(comboBox_3);
		
		JLabel lblNewLabel_7 = new JLabel("Четверг");
		lblNewLabel_7.setForeground(SystemColor.infoText);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_7.setBackground(SystemColor.control);
		lblNewLabel_7.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_7.setBounds(12, 216, 105, 30);
		contentPane.add(lblNewLabel_7);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setForeground(SystemColor.infoText);
		comboBox_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		comboBox_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		comboBox_4.setBackground(SystemColor.control);
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Да", "Нет"}));
		comboBox_4.setBounds(127, 216, 173, 30);
		contentPane.add(comboBox_4);
		
		JLabel lblNewLabel_8 = new JLabel("Пятница");
		lblNewLabel_8.setForeground(SystemColor.infoText);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_8.setBackground(SystemColor.control);
		lblNewLabel_8.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_8.setBounds(12, 257, 105, 30);
		contentPane.add(lblNewLabel_8);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setForeground(SystemColor.infoText);
		comboBox_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		comboBox_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		comboBox_5.setBackground(SystemColor.control);
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Да", "Нет"}));
		comboBox_5.setBounds(127, 257, 173, 30);
		contentPane.add(comboBox_5);
		
		JLabel lblNewLabel_9 = new JLabel("Часы приема");
		lblNewLabel_9.setForeground(SystemColor.infoText);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_9.setBackground(SystemColor.control);
		lblNewLabel_9.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_9.setBounds(12, 298, 105, 30);
		contentPane.add(lblNewLabel_9);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField_1.getText().length() >= 13)
					e.consume();
		    }
		});
		textField_1.setForeground(SystemColor.infoText);
		textField_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_1.setBounds(127, 298, 173, 30);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("ОК");
		btnNewButton.setForeground(SystemColor.infoText);
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vrach.AddRowToJTable(new Object[]{
						 comboBox.getSelectedItem(),
						 textField.getText(),
						 comboBox_1.getSelectedItem(),
						 comboBox_2.getSelectedItem(),
						 comboBox_3.getSelectedItem(),
						 comboBox_4.getSelectedItem(),
						 comboBox_5.getSelectedItem(),
						 textField_1.getText(),
                  });
			}
		});

		btnNewButton.setBounds(111, 339, 89, 30);
		contentPane.add(btnNewButton);
	}
}
