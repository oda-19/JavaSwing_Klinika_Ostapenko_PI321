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
import com.github.lgooddatepicker.components.DatePicker;
import java.awt.Component;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

public class DobavitPashient extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DobavitPashient frame = new DobavitPashient(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	String fio;
	String pol;
	String snils;
	String oms;
	String datarog;
	String telefon;
	String mestopolog;
    
	/**
	 * Create the frame.
	 * @param model 
	 */
	public DobavitPashient(DefaultTableModel model) {
		setBackground(SystemColor.control);	
		setTitle("Добавить пациента");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 420);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ФИО");
		lblNewLabel.setForeground(SystemColor.infoText);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel.setBackground(SystemColor.control);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 11, 96, 30);
		contentPane.add(lblNewLabel);
		
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
		textField.setBounds(118, 12, 156, 30);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("СНИЛС");
		lblNewLabel_1.setForeground(SystemColor.infoText);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_1.setBackground(SystemColor.control);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_1.setBounds(12, 52, 96, 30);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField_1.getText().length() >= 14)
					e.consume();
		    }
		});
		textField_1.setForeground(SystemColor.infoText);
		textField_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(118, 53, 156, 30);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("ОМС");
		lblNewLabel_2.setForeground(SystemColor.infoText);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_2.setBackground(SystemColor.control);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_2.setBounds(12, 93, 96, 30);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField_2.getText().length() >= 19)
					e.consume();
		    }
		});
		textField_2.setForeground(SystemColor.infoText);
		textField_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(118, 94, 156, 30);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("Пол");
		lblNewLabel_3.setForeground(SystemColor.infoText);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_3.setBackground(SystemColor.control);
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_3.setBounds(12, 134, 96, 30);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(SystemColor.infoText);
		comboBox.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		comboBox.setBackground(SystemColor.control);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Мужской", "Женский"}));
		comboBox.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		comboBox.setBounds(118, 135, 156, 30);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Дата");
		lblNewLabel_4.setForeground(SystemColor.infoText);
		lblNewLabel_4.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_4.setBackground(SystemColor.control);
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_4.setBounds(12, 175, 96, 19);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("рождения");
		lblNewLabel_5.setForeground(SystemColor.infoText);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_5.setBackground(SystemColor.control);
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_5.setBounds(12, 195, 96, 30);
		contentPane.add(lblNewLabel_5);
		
		DatePicker datePicker = new DatePicker();
		datePicker.getComponentDateTextField().setEditable(false);
		datePicker.getComponentToggleCalendarButton().setText("    \u25BC");
		datePicker.getComponentDateTextField().setBackground(UIManager.getColor("text"));
		datePicker.getComponentDateTextField().setCaretColor(UIManager.getColor("infoText"));
		datePicker.getComponentDateTextField().setDisabledTextColor(UIManager.getColor("infoText"));
		datePicker.getComponentDateTextField().setForeground(SystemColor.infoText);
		datePicker.getComponentDateTextField().setSelectionColor(SystemColor.activeCaption);
		datePicker.getComponentDateTextField().setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		datePicker.getComponentDateTextField().setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		datePicker.getComponentToggleCalendarButton().setForeground(SystemColor.infoText);
		datePicker.getComponentToggleCalendarButton().setHorizontalAlignment(SwingConstants.LEADING);
		datePicker.getComponentToggleCalendarButton().setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		datePicker.getComponentToggleCalendarButton().setBackground(SystemColor.activeCaption);
		datePicker.getComponentToggleCalendarButton().setFont(new Font("Segoe UI", Font.PLAIN, 8));
		datePicker.getComponentToggleCalendarButton().setActionCommand("");
		datePicker.getComponentToggleCalendarButton().setAlignmentX(Component.CENTER_ALIGNMENT);
		datePicker.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		datePicker.setBorder(new EmptyBorder(0, 0, 0, 0));
		datePicker.setForeground(SystemColor.infoText);
		datePicker.setBackground(SystemColor.control);
		datePicker.setBounds(118, 180, 156, 30);
		contentPane.add(datePicker);
		
		JLabel lblNewLabel_6 = new JLabel("Номер");
		lblNewLabel_6.setForeground(SystemColor.infoText);
		lblNewLabel_6.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_6.setBackground(SystemColor.control);
		lblNewLabel_6.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_6.setBounds(12, 236, 96, 19);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("телефона");
		lblNewLabel_7.setForeground(SystemColor.infoText);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_7.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_7.setBackground(SystemColor.control);
		lblNewLabel_7.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_7.setBounds(12, 256, 96, 30);
		contentPane.add(lblNewLabel_7);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField_3.getText().length() >= 17)
					e.consume();
		    }
		});
		textField_3.setForeground(SystemColor.infoText);
		textField_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(118, 302, 156, 30);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_8 = new JLabel("Место");
		lblNewLabel_8.setForeground(SystemColor.infoText);
		lblNewLabel_8.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_8.setBackground(SystemColor.control);
		lblNewLabel_8.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_8.setBounds(12, 297, 96, 19);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("проживания");
		lblNewLabel_9.setForeground(SystemColor.infoText);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_9.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_9.setBackground(SystemColor.control);
		lblNewLabel_9.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_9.setBounds(12, 317, 96, 30);
		contentPane.add(lblNewLabel_9);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField_4.getText().length() >= 50)
					e.consume();
		    }
		});
		textField_4.setForeground(SystemColor.infoText);
		textField_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(118, 241, 156, 30);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("ОК");
		btnNewButton.setForeground(SystemColor.infoText);
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pashient.AddRowToJTable(new Object[]{
						 textField.getText(),
						 textField_1.getText(),
						 textField_2.getText(),
						 comboBox.getSelectedItem(),
						 datePicker.getDate(),
						 textField_3.getText(),
						 textField_4.getText(),
                  });
				 dispose();
			}
		});

		btnNewButton.setBounds(106, 343, 89, 30);
		contentPane.add(btnNewButton);
	}
}
