package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtusuario;
	private JButton btnIngresar;
	private JPasswordField txtcontra;
	private JLabel lblContrasea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Pictures\\Login.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setBounds(26, 78, 72, 30);
		contentPane.add(lblContrasea);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setBounds(26, 39, 72, 30);
		contentPane.add(lblUsuario);

		txtusuario = new JTextField();
		txtusuario.setBounds(134, 35, 121, 23);
		contentPane.add(txtusuario);
		txtusuario.setColumns(10);

		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(this);
		btnIngresar.setBounds(162, 184, 93, 30);
		contentPane.add(btnIngresar);

		txtcontra = new JPasswordField();
		txtcontra.setBounds(134, 82, 121, 23);
		contentPane.add(txtcontra);

		JLabel lbimagen = new JLabel("");
		lbimagen.setBounds(0, 0, 461, 282);
		ImageIcon img = new ImageIcon(getClass().getResource("/img/Login.jpg"));
		Icon img2 = new ImageIcon(
				img.getImage().getScaledInstance(lbimagen.getWidth(), lbimagen.getHeight(), Image.SCALE_DEFAULT));
		lbimagen.setIcon(img2);
		contentPane.add(lbimagen);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnIngresar) {
			do_btnIngresar_actionPerformed(e);
		}
	}

	protected void do_btnIngresar_actionPerformed(ActionEvent e) {

		String usuario = "carlos";
		String contraseña = "matawww";

		String usuariodef = txtusuario.getText();
		String clavedef = new String(txtcontra.getPassword());

		if (usuariodef.equals(usuario) && clavedef.equals(contraseña)) {
			dispose();
			formulario f = new formulario();
			f.setLocationRelativeTo(null);
			f.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta ");
		}

	}
}
