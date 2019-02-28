package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;

public class formulario extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtempresa;
	private JTextField txtprodu;
	private JTextField txtdescrip;
	private JTextField txtonu;
	private JButton btnimprimir;
	public static String empresa;
	public static String producto;
	public static String descripcion;
	public static String onu;
	public static String cantidad;
	public static String  telefono;
	public static String  clase;
	public static String fecha;
	public static String presentacion;
	private JTextField txtcantidad;
	private JTextField txttelefono;
	private JComboBox cmbclase;
	private JTextField txtpresentacion;
	private JDateChooser chosserfecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formulario frame = new formulario();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setForeground(Color.WHITE);
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFecha.setBounds(56, 354, 46, 14);
		contentPane.add(lblFecha);
		
		chosserfecha = new JDateChooser();
		chosserfecha.setBounds(115, 354, 134, 28);
		contentPane.add(chosserfecha);
		
		txtpresentacion = new JTextField();
		txtpresentacion.setColumns(10);
		txtpresentacion.setBounds(113, 175, 89, 20);
		contentPane.add(txtpresentacion);
		
		JLabel lblOresentacion = new JLabel("Presentacion");
		lblOresentacion.setForeground(Color.WHITE);
		lblOresentacion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOresentacion.setBounds(20, 176, 82, 17);
		contentPane.add(lblOresentacion);
		
		JLabel lblCantidadYPresentacin = new JLabel("Cantidad ");
		lblCantidadYPresentacin.setForeground(Color.WHITE);
		lblCantidadYPresentacin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCantidadYPresentacin.setBounds(30, 143, 63, 17);
		contentPane.add(lblCantidadYPresentacin);
		
		txtcantidad = new JTextField();
		txtcantidad.setBounds(115, 131, 89, 20);
		contentPane.add(txtcantidad);
		txtcantidad.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(113, 218, 86, 20);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		JLabel lblTe = new JLabel("Tel\u00E9fono ");
		lblTe.setForeground(Color.WHITE);
		lblTe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTe.setBounds(30, 220, 72, 14);
		contentPane.add(lblTe);
		
		JLabel lblClase = new JLabel("Clase");
		lblClase.setForeground(Color.WHITE);
		lblClase.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblClase.setBounds(40, 309, 46, 14);
		contentPane.add(lblClase);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		lblDescripcin.setForeground(Color.WHITE);
		lblDescripcin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDescripcin.setBounds(20, 106, 72, 14);
		contentPane.add(lblDescripcin);
		
		JLabel lblNonu = new JLabel("N_ONU");
		lblNonu.setForeground(Color.WHITE);
		lblNonu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNonu.setBounds(40, 264, 46, 14);
		contentPane.add(lblNonu);
		
		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setForeground(Color.WHITE);
		lblProducto.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblProducto.setBounds(30, 59, 63, 14);
		contentPane.add(lblProducto);
		
		JLabel lblEmpresa_1 = new JLabel("Empresa");
		lblEmpresa_1.setForeground(Color.WHITE);
		lblEmpresa_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmpresa_1.setBounds(40, 12, 63, 14);
		contentPane.add(lblEmpresa_1);

		txtempresa = new JTextField();
		txtempresa.setBounds(113, 11, 157, 20);
		contentPane.add(txtempresa);
		txtempresa.setColumns(10);

		txtprodu = new JTextField();
		txtprodu.setBounds(115, 50, 157, 20);
		contentPane.add(txtprodu);
		txtprodu.setColumns(10);

		txtdescrip = new JTextField();
		txtdescrip.setBounds(113, 91, 157, 20);
		contentPane.add(txtdescrip);
		txtdescrip.setColumns(10);

		txtonu = new JTextField();
		txtonu.setBounds(113, 262, 63, 20);
		contentPane.add(txtonu);
		txtonu.setColumns(10);

		cmbclase = new JComboBox();
		cmbclase.setModel(new DefaultComboBoxModel(new String[] {"No aplica", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cmbclase.setBounds(113, 307, 89, 20);
		contentPane.add(cmbclase);

		btnimprimir = new JButton("Imprimir");
		btnimprimir.addActionListener(this);
		btnimprimir.setBounds(175, 433, 110, 37);
		contentPane.add(btnimprimir);

		JLabel lbformulario = new JLabel("");
		lbformulario.setForeground(Color.WHITE);
		lbformulario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbformulario.setBounds(-21, -21, 514, 522);
		ImageIcon img = new ImageIcon(getClass().getResource("/img/bosco.jpg"));
		Icon img2 = new ImageIcon(img.getImage().getScaledInstance(lbformulario.getWidth(), lbformulario.getHeight(),
				Image.SCALE_DEFAULT));
		lbformulario.setIcon(img2);
		contentPane.add(lbformulario);
		
		JLabel lblEmpresa = new JLabel("Empresa");
		lblEmpresa.setForeground(Color.WHITE);
		lblEmpresa.setBounds(73, 326, 46, 14);
		contentPane.add(lblEmpresa);
		
		JLabel lblA = new JLabel("a");
		lblA.setForeground(Color.WHITE);
		lblA.setBounds(353, 293, 46, 14);
		contentPane.add(lblA);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(353, 254, 1, 2);
		contentPane.add(separator);

	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnimprimir) {
			do_btimprimir_actionPerformed(arg0);
		}
	}

	protected void do_btimprimir_actionPerformed(ActionEvent arg0) {
		
		empresa = txtempresa.getText();
		producto = txtprodu.getText();
		descripcion = txtdescrip.getText();
		onu = txtonu.getText();
		telefono = txttelefono.getText();
		cantidad = txtcantidad.getText();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		fecha = formato.format(chosserfecha.getDate());
		clase =  cmbclase.getSelectedItem().toString();
		presentacion=txtpresentacion.getText();
		
		dispose();

		plantilla p = new plantilla();
		p.setVisible(true);
		p.setLocationRelativeTo(null);
		p.setResizable(false);
	}
}
