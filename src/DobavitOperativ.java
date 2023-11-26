import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import com.github.lgooddatepicker.components.DatePicker;

public class DobavitOperativ extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DobavitOperativ frame = new DobavitOperativ(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	String snils;
	String vrach;
	String diagnoz;
	String dataPriema;
	String vremyaPriema;
	private JTextField textField_1;
	private JTextField textField;
    
	/**
	 * Create the frame.
	 * @param model 
	 */
	public DobavitOperativ(DefaultTableModel model) {
		setBackground(SystemColor.control);	
		setTitle("Добавить запись на прием");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 381, 298);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("СНИЛС пациента");
		lblNewLabel.setForeground(SystemColor.infoText);
		lblNewLabel.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(SystemColor.control);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 11, 131, 30);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(SystemColor.infoText);
		comboBox.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		comboBox.setBackground(SystemColor.control);
		comboBox.setModel(new DefaultComboBoxModel(Operativ.SnilsLoad(false)));
		comboBox.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		comboBox.setBounds(153, 11, 200, 30);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Врач");
		lblNewLabel_1.setForeground(SystemColor.infoText);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_1.setBackground(SystemColor.control);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_1.setBounds(12, 52, 131, 30);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(SystemColor.infoText);
		comboBox_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		comboBox_1.setBackground(SystemColor.control);
		comboBox_1.setModel(new DefaultComboBoxModel(Operativ.VrachLoad(false)));
		comboBox_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		comboBox_1.setBounds(153, 52, 200, 30);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("Диагноз");
		lblNewLabel_2.setForeground(SystemColor.infoText);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_2.setBackground(SystemColor.control);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_2.setBounds(12, 93, 131, 30);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		comboBox_2.setForeground(SystemColor.infoText);
		comboBox_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		comboBox_2.setBackground(SystemColor.control);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"H00.0", "H00.1", "H01.0", "H02.2", "H02.3", "H04.0", "H04.2", "H05.4", "H10", "H11.0",
				"H15.0", "H15.1", "H16", "H18.6", "H20", "H21.0", "H27.0", "H40", "H50.5", "H52", "H52.0", "H52.1", "H52.2", "H52.4", "H53.2"
				}));
		comboBox_2.setBounds(153, 93, 200, 30);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_3 = new JLabel("Дата приема");
		lblNewLabel_3.setForeground(SystemColor.infoText);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_3.setBackground(SystemColor.control);
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_3.setBounds(12, 134, 131, 30);
		contentPane.add(lblNewLabel_3);
		
		DatePicker datePicker = new DatePicker();
		datePicker.getComponentToggleCalendarButton().setForeground(SystemColor.infoText);
		datePicker.getComponentDateTextField().setForeground(SystemColor.infoText);
		datePicker.setForeground(SystemColor.infoText);
		datePicker.getComponentToggleCalendarButton().setText("\u25BC");
		datePicker.getComponentToggleCalendarButton().setFont(new Font("Segoe UI", Font.PLAIN, 8));
		datePicker.getComponentDateTextField().setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		datePicker.getComponentToggleCalendarButton().setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		datePicker.getComponentToggleCalendarButton().setBackground(SystemColor.activeCaption);
		datePicker.getComponentDateTextField().setSelectionColor(SystemColor.activeCaption);
		datePicker.getComponentDateTextField().setDisabledTextColor(SystemColor.infoText);
		datePicker.getComponentDateTextField().setBackground(SystemColor.text);
		datePicker.getComponentDateTextField().setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		datePicker.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		datePicker.setBorder(new EmptyBorder(0, 0, 0, 0));
		datePicker.setBackground(SystemColor.control);
		datePicker.setBounds(153, 134, 200, 30);
		contentPane.add(datePicker);
		
		JLabel lblNewLabel_4 = new JLabel("Время приема");
		lblNewLabel_4.setForeground(SystemColor.infoText);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_4.setBackground(SystemColor.control);
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_4.setBounds(12, 175, 131, 30);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField.getText().length() >= 5)
					e.consume();
		    }
		});
		textField.setForeground(SystemColor.infoText);
		textField.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(153, 175, 200, 30);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("ОК");
		btnNewButton.setForeground(SystemColor.infoText);
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operativ.AddRowToJTable(new Object[]{
						 comboBox.getSelectedItem(),
						 comboBox_1.getSelectedItem(),
						 comboBox_2.getSelectedItem(),
						 datePicker.getDate(),
						 textField.getText(),
                  });
				 dispose();
			}
		});

		btnNewButton.setBounds(140, 216, 89, 30);
		contentPane.add(btnNewButton);
	}
}
