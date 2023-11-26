import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Cursor;
import java.awt.SystemColor;

public class Kartochka extends JFrame {

	private JPanel contentPane;
	private static JTable table;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JTable table_1;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kartochka frame = new Kartochka();
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
	public Kartochka() {
		setForeground(SystemColor.control);
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setTitle("Карточка пациента");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1155, 358);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(SystemColor.control);
		scrollPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		scrollPane.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		scrollPane.setBounds(12, 52, 1115, 84);
		contentPane.add(scrollPane);
		
		table = new JTable(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ФИО", "СНИЛС", "ОМС", "Дата рождения", "Место жительства"
			}
		));
		table.setBackground(SystemColor.WHITE);
		table.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		Font bigFont = new Font("Trebuchet MS", Font.BOLD, 16);
		table.getTableHeader().setFont(bigFont);
		
		table.getColumnModel().getColumn(0).setPreferredWidth(270);
		table.getColumnModel().getColumn(1).setPreferredWidth(130);
		table.getColumnModel().getColumn(2).setPreferredWidth(170);
		table.getColumnModel().getColumn(3).setPreferredWidth(140);
		table.getColumnModel().getColumn(4).setPreferredWidth(400);

		table.setRowHeight(30);
		
		scrollPane.setViewportView(table);
		table.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		table.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBackground(SystemColor.control);
		scrollPane_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		scrollPane_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		scrollPane_1.setBounds(244, 147, 662, 117);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"СНИЛС пациента", "Врач", "Диагноз", "Дата приема", "Время приема"
				}
		));
		table_1.setBackground(SystemColor.WHITE);
		table_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table_1.getTableHeader().setFont(bigFont);
		
		table_1.getColumnModel().getColumn(0).setWidth(0);
		table_1.getColumnModel().getColumn(0).setMinWidth(0);
		table_1.getColumnModel().getColumn(0).setMaxWidth(0); 

		table_1.getColumnModel().getColumn(1).setPreferredWidth(290);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(80);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(130);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(140);

		table_1.setRowHeight(30);
		
		scrollPane_1.setViewportView(table_1);
		table_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		table_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		
		DefaultTableModel model1 = (DefaultTableModel)table_1.getModel();
		
		lblNewLabel = new JLabel("Введите СНИЛС пациента");
		lblNewLabel.setForeground(SystemColor.infoText);
		lblNewLabel.setBackground(SystemColor.control);
		lblNewLabel.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel.setBounds(409, 11, 201, 30);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(SystemColor.infoText);
		textField.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
				table.setRowSorter(tr);
				tr.setRowFilter(RowFilter.regexFilter(textField.getText(), 1));
				TableRowSorter<DefaultTableModel> tr1 = new TableRowSorter<DefaultTableModel>(model1);
				table_1.setRowSorter(tr1);
				tr1.setRowFilter(RowFilter.regexFilter(textField.getText(), 0));
			}
		});
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField.setBounds(620, 11, 132, 30);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnNewButton_3 = new JButton("Импорт из Excel");
		btnNewButton_3.setForeground(SystemColor.infoText);
		btnNewButton_3.setBackground(SystemColor.inactiveCaption);
		btnNewButton_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FileInputStream file = null;
				XSSFWorkbook workbook = null;
				
				try {
					file = new FileInputStream(new File("C:\\Users\\79034\\Desktop\\Остапенко Д. А. ПИ-321. Контрольный пример Java.xlsx"));
					workbook = new XSSFWorkbook (file);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				XSSFSheet excelSheet = workbook.getSheetAt(1);
				XSSFSheet excelSheet1 = workbook.getSheetAt(3);
				
				try {
					for (int row = 1; row <= excelSheet.getLastRowNum(); row++) {
						XSSFRow excelRow = excelSheet.getRow(row);

		                XSSFCell excelFio = excelRow.getCell(0);
		                XSSFCell excelSnils = excelRow.getCell(1);
		                XSSFCell excelOms = excelRow.getCell(2);
		                XSSFCell excelDatarog = excelRow.getCell(4);
		                XSSFCell excelMestopolog = excelRow.getCell(6);
		                    
		                model.addRow(new Object[]{excelFio, excelSnils, excelOms, excelDatarog, excelMestopolog});
		            }

					for (int row = 1; row <= excelSheet1.getLastRowNum(); row++) {
						XSSFRow excelRow1 = excelSheet1.getRow(row);
						
						XSSFCell excelSnils = excelRow1.getCell(0);
						XSSFCell excelVrach = excelRow1.getCell(1);
		                XSSFCell excelDiagnoz = excelRow1.getCell(2);
		                XSSFCell excelDataPriema = excelRow1.getCell(3);
		                XSSFCell excelVremyaPriema = excelRow1.getCell(4);
		                    
		                model1.addRow(new Object[]{excelSnils, excelVrach, excelDiagnoz, excelDataPriema, excelVremyaPriema});
		            }
					
					JOptionPane.showMessageDialog(null, "Успешно!");
				} finally {
		        	try {
		        		if (workbook != null) {
		        			workbook.close();
		                }
		            } catch (IOException iOException) {
		            	JOptionPane.showMessageDialog(null, iOException.getMessage());
		            }
		        }
			}
		});
		btnNewButton_3.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_3.setBounds(502, 275, 170, 30);
		contentPane.add(btnNewButton_3);
	}

	 public static void AddRowToJTable(Object[] dataRow)
	 {
		 DefaultTableModel model = (DefaultTableModel)table.getModel();
	     model.addRow(dataRow);
	 }   
	 public static void DeleteRowToJTable(int dataRow)
	 {
		 DefaultTableModel model = (DefaultTableModel)table.getModel();
		 model.removeRow(dataRow);
	 }    
}
