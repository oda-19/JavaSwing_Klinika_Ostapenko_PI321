import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.awt.Cursor;
import java.awt.SystemColor;

public class Diagnoz extends JFrame {

	private JPanel contentPane;
	private static JTable table;
	private JScrollPane scrollPane;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diagnoz frame = new Diagnoz();
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
	public Diagnoz() {
		setForeground(SystemColor.control);
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setTitle("Справочник диагнозов");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 240, 395);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBackground(SystemColor.control);
		scrollPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		scrollPane.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		scrollPane.setBounds(12, 11, 201, 295);
		contentPane.add(scrollPane);
		
		table = new JTable(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Код", "Название"
			}
		));
		table.setForeground(SystemColor.infoText);
		table.setBackground(SystemColor.WHITE);
		table.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		Font bigFont = new Font("Trebuchet MS", Font.BOLD, 16);
		table.getTableHeader().setFont(bigFont);
		
		table.getColumnModel().getColumn(0).setPreferredWidth(50);
		table.getColumnModel().getColumn(1).setPreferredWidth(130);
		
		table.setRowHeight(30);

		scrollPane.setViewportView(table);
		table.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		table.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();

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
				XSSFSheet excelSheet = workbook.getSheetAt(4);
				
				try {
					for (int row = 1; row <= excelSheet.getLastRowNum(); row++) {
						XSSFRow excelRow = excelSheet.getRow(row);

						XSSFCell excelKod = excelRow.getCell(0);
	                    XSSFCell excelNazvanie = excelRow.getCell(1);
	                    
	                    model.addRow(new Object[]{excelKod, excelNazvanie});
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
		btnNewButton_3.setBounds(27, 317, 170, 30);
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
