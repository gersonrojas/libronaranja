package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;

public class plantilla extends JFrame implements MouseListener,Printable{

	private JPanel contentPane;
	private JTextField txtremitente;
	private JTextField txtmaterial;
	private JTable table_1;
	private JTextField txtclase;
	private JTextField txtonu;
	private JTextField txtdescripcion;
	private JTextField txtcantidad;
	private JTextField txtfecha;
	private JTextField txttelefono;
	private JPanel panelcontenedor;
	private JTextField txtpresentacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					plantilla frame = new plantilla();
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
	public plantilla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 764);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		table_1 = new JTable();
		table_1.setBounds(184, 369, 1, 1);
		contentPane.add(table_1);
		
		panelcontenedor = new JPanel();
		panelcontenedor.setBackground(Color.WHITE);
		panelcontenedor.setBounds(0, 0, 596, 725);
		contentPane.add(panelcontenedor);
		panelcontenedor.setLayout(null);
		
				JPanel panel_13 = new JPanel();
				panel_13.setBounds(107, 337, 461, 105);
				panelcontenedor.add(panel_13);
				panel_13.setBackground(Color.WHITE);
				panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
				panel_13.setLayout(null);
				
						JTextPane txtpnAplicarElSistema = new JTextPane();
						txtpnAplicarElSistema.setFont(new Font("Tahoma", Font.PLAIN, 10));
						txtpnAplicarElSistema.setText(
								"Aplicar el sistema de freno, apagar el motor. Colocar las se\u00F1ales de peligro. LLAMAR primero a los bomberos 116 y luego comunicar al n\u00FAmero de tel\u00E9fono del \u00E1rea de seguridad de la empresa de transportes para luego este comunique al destinatario y proveedor.C\u00F3mo acci\u00F3n inmediata de precauci\u00F3n, aisl\u00E9 el \u00E1rea del derrame.Mantener alejado al personal no autorizado.Permanezca en direcci\u00F3n del viento. Tener a la mano los documentos de transporte y siga los pasos de su plan de contingencia, proporcione informaci\u00F3n a las autoridades o equipos de respuesta.");
						txtpnAplicarElSistema.setBounds(2, 5, 451, 89);
						panel_13.add(txtpnAplicarElSistema);
						
								JPanel panel_15 = new JPanel();
								panel_15.setBounds(107, 440, 461, 65);
								panelcontenedor.add(panel_15);
								panel_15.setBackground(Color.WHITE);
								panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
								panel_15.setLayout(null);
								
										JTextPane txtpnUtilizarEquipoDe = new JTextPane();
										txtpnUtilizarEquipoDe.setFont(new Font("Tahoma", Font.PLAIN, 10));
										txtpnUtilizarEquipoDe.setText(
												"Utilizar equipo de protecci\u00F3n personal adecuado, Evitar que penetre en el alcantarillado o aguas superficiales, Evitar que penetre en el subsuelo o la tierra, En caso de penetraci\u00F3n en cursos de agua, el suelo o los desag\u00FCes, avisar a las autoridades competentes.Tratar el material recogido seg\u00FAn se indica en el apartado \u201Celiminaci\u00F3n de residuos\u201D.");
										txtpnUtilizarEquipoDe.setBounds(2, 4, 455, 59);
										panel_15.add(txtpnUtilizarEquipoDe);
										
												JPanel panel_16 = new JPanel();
												panel_16.setBounds(9, 440, 99, 65);
												panelcontenedor.add(panel_16);
												panel_16.setBackground(Color.WHITE);
												panel_16.setBorder(new LineBorder(new Color(0, 0, 0), 2));
												panel_16.setLayout(null);
												
														JTextPane txtpnDerrame = new JTextPane();
														txtpnDerrame.setFont(new Font("Arial Black", Font.BOLD, 10));
														txtpnDerrame.setText("Derrame");
														txtpnDerrame.setBounds(10, 23, 79, 28);
														panel_16.add(txtpnDerrame);
														
																JPanel panel_19 = new JPanel();
																panel_19.setBounds(9, 530, 99, 65);
																panelcontenedor.add(panel_19);
																panel_19.setBackground(Color.WHITE);
																panel_19.setBorder(new LineBorder(new Color(0, 0, 0), 2));
																panel_19.setLayout(null);
																
																		JTextPane txtpnPrimeroAuxilios = new JTextPane();
																		txtpnPrimeroAuxilios.setFont(new Font("Arial Black", Font.BOLD, 10));
																		txtpnPrimeroAuxilios.setText("Primeros Auxilos");
																		txtpnPrimeroAuxilios.setBounds(10, 11, 79, 39);
																		panel_19.add(txtpnPrimeroAuxilios);
																		
																				JPanel panel_20 = new JPanel();
																				panel_20.setBounds(107, 530, 461, 65);
																				panelcontenedor.add(panel_20);
																				panel_20.setBackground(Color.WHITE);
																				panel_20.setBorder(new LineBorder(new Color(0, 0, 0), 2));
																				panel_20.setLayout(null);
																				
																						JTextPane txtpnEnContactoCon = new JTextPane();
																						txtpnEnContactoCon.setFont(new Font("Tahoma", Font.PLAIN, 10));
																						txtpnEnContactoCon.setText(
																								"En contacto con ojos: lavar con abundante agua durante 15 minutos y llamar ayuda medica. En contacto con la piel : remover ropa y zapatos contaminados, lavar la zona afectada con abundante agua y jab\u00F3n durante 5 minutos. En caso de ingesti\u00F3n no provocar el vomito y prestar ayuda medica inmediata.");
																						txtpnEnContactoCon.setBounds(2, 5, 451, 55);
																						panel_20.add(txtpnEnContactoCon);
																						
																								JPanel panel = new JPanel();
																								panel.setBounds(75, 0, 423, 38);
																								panelcontenedor.add(panel);
																								panel.setBorder(new LineBorder(new Color(0, 0, 0), 0));
																								panel.setBackground(Color.WHITE);
																								panel.setLayout(null);
																								
																										JLabel lblFormatoDeLa = new JLabel("FORMATO DE LA HOJA DE RESUMEN DE SEGURIDAD PARA EL TRANSPORTE ");
																										lblFormatoDeLa.setFont(new Font("Tahoma", Font.BOLD, 11));
																										lblFormatoDeLa.setBounds(10, 0, 412, 25);
																										panel.add(lblFormatoDeLa);
																										
																												JLabel lblTerrestreDeMateriales = new JLabel("TERRESTRE DE MATERIALES Y RESIDUOS PELIGROSOS");
																												lblTerrestreDeMateriales.setFont(new Font("Tahoma", Font.BOLD, 11));
																												lblTerrestreDeMateriales.setBounds(55, 25, 306, 14);
																												panel.add(lblTerrestreDeMateriales);
																												
																														JPanel panel_1 = new JPanel();
																														panel_1.setBounds(10, 37, 346, 50);
																														panelcontenedor.add(panel_1);
																														panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 0));
																														panel_1.setBackground(Color.WHITE);
																														panel_1.setLayout(null);
																														
																																JLabel lblNombreODenominacion = new JLabel("NOMBRE  O  DENOMINACION  DEL  REMITENTE:");
																																lblNombreODenominacion.setFont(new Font("Tahoma", Font.BOLD, 11));
																																lblNombreODenominacion.setBounds(10, 11, 294, 14);
																																panel_1.add(lblNombreODenominacion);
																																
																																		txtremitente = new JTextField();
																																		txtremitente.setEditable(false);
																																		txtremitente.setText(formulario.empresa);
																																		txtremitente.setBounds(10, 29, 326, 20);
																																		panel_1.add(txtremitente);
																																		txtremitente.setColumns(10);
																																		
																																				JPanel panel_3 = new JPanel();
																																				panel_3.setBounds(20, 98, 261, 51);
																																				panelcontenedor.add(panel_3);
																																				panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 0));
																																				panel_3.setBackground(Color.WHITE);
																																				panel_3.setLayout(null);
																																				
																																						JLabel lblDenominacionDelMaterial = new JLabel("DENOMINACION  DEL  MATERIAL  O  RESIDUO");
																																						lblDenominacionDelMaterial.setFont(new Font("Tahoma", Font.BOLD, 11));
																																						lblDenominacionDelMaterial.setBounds(10, 2, 259, 14);
																																						panel_3.add(lblDenominacionDelMaterial);
																																						
																																								JLabel lblPeligrosoATransportar = new JLabel("PELIGROSO  A  TRANSPORTAR:");
																																								lblPeligrosoATransportar.setFont(new Font("Tahoma", Font.BOLD, 11));
																																								lblPeligrosoATransportar.setBounds(10, 16, 188, 14);
																																								panel_3.add(lblPeligrosoATransportar);
																																								
																																										txtmaterial = new JTextField();
																																										txtmaterial.setEditable(false);
																																										txtmaterial.setText(formulario.producto);
																																										txtmaterial.setBounds(10, 31, 177, 20);
																																										panel_3.add(txtmaterial);
																																										txtmaterial.setColumns(10);
																																										
																																												JPanel panel_8 = new JPanel();
																																												panel_8.setBounds(21, 163, 521, 38);
																																												panelcontenedor.add(panel_8);
																																												panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 0));
																																												panel_8.setBackground(Color.WHITE);
																																												panel_8.setForeground(Color.BLACK);
																																												panel_8.setLayout(null);
																																												
																																														JLabel lblDescripcin = new JLabel("DESCRIPCI\u00D3N:");
																																														lblDescripcin.setFont(new Font("Tahoma", Font.BOLD, 11));
																																														lblDescripcin.setBounds(10, 0, 90, 14);
																																														panel_8.add(lblDescripcin);
																																														
																																																txtdescripcion = new JTextField();
																																																txtdescripcion.setEditable(false);
																																																txtdescripcion.setText(formulario.descripcion);
																																																txtdescripcion.setBounds(10, 13, 501, 20);
																																																panel_8.add(txtdescripcion);
																																																txtdescripcion.setColumns(10);
																																																
																																																		JPanel panel_4 = new JPanel();
																																																		panel_4.setBounds(307, 98, 235, 65);
																																																		panelcontenedor.add(panel_4);
																																																		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 0));
																																																		panel_4.setBackground(Color.WHITE);
																																																		panel_4.setLayout(null);
																																																										
																																																												txtclase = new JTextField();
																																																												txtclase.setText(formulario.clase);
																																																												txtclase.setEditable(false);
																																																												txtclase.setBounds(105, 10, 99, 20);
																																																												panel_4.add(txtclase);
																																																												txtclase.setColumns(10);
																																																												
																																																														txtonu = new JTextField();
																																																														txtonu.setEditable(false);
																																																														txtonu.setText(formulario.onu);
																																																														txtonu.setBounds(105, 38, 99, 20);
																																																														panel_4.add(txtonu);
																																																														txtonu.setColumns(10);
																																																														
																																																														JLabel lblClase = new JLabel("CLASE:");
																																																														lblClase.setFont(new Font("Tahoma", Font.BOLD, 11));
																																																														lblClase.setBounds(30, 18, 52, 14);
																																																														panel_4.add(lblClase);
																																																														
																																																														JLabel lblNroOnu = new JLabel("NRO. ONU:");
																																																														lblNroOnu.setFont(new Font("Tahoma", Font.BOLD, 11));
																																																														lblNroOnu.setBounds(22, 41, 73, 14);
																																																														panel_4.add(lblNroOnu);
																																																														
																																																																JLabel lblTelefonoDelRemitente = new JLabel("TELEFONO  DEL  REMITENTE:");
																																																																lblTelefonoDelRemitente.setBounds(379, 52, 178, 14);
																																																																panelcontenedor.add(lblTelefonoDelRemitente);
																																																																lblTelefonoDelRemitente.setFont(new Font("Tahoma", Font.BOLD, 11));
																																																																
																																																																txttelefono = new JTextField();
																																																																txttelefono.setEditable(false);
																																																																txttelefono.setBounds(376, 67, 166, 20);
																																																																panelcontenedor.add(txttelefono);
																																																																txttelefono.setText(formulario.telefono);
																																																																txttelefono.setColumns(10);
																																																																						
																																																																								JLabel lblFechaDeEmisin = new JLabel("Fecha de emisi\u00F3n");
																																																																								lblFechaDeEmisin.setBounds(435, 658, 107, 14);
																																																																								panelcontenedor.add(lblFechaDeEmisin);
																																																																								lblFechaDeEmisin.setFont(new Font("Tahoma", Font.BOLD, 11));
																																																																								
																																																																										txtfecha = new JTextField();
																																																																										txtfecha.setBounds(445, 683, 86, 20);
																																																																										panelcontenedor.add(txtfecha);
																																																																										txtfecha.setText(formulario.fecha);
																																																																										txtfecha.setEditable(false);
																																																																										txtfecha.setColumns(10);
																																																																										
																																																																												JPanel panel_2 = new JPanel();
																																																																												panel_2.setBounds(107, 212, 461, 38);
																																																																												panelcontenedor.add(panel_2);
																																																																												panel_2.setBackground(Color.WHITE);
																																																																												panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
																																																																												panel_2.setLayout(null);
																																																																												
																																																																														JTextPane txtpnProductoPotencialmentePeligroso = new JTextPane();
																																																																														txtpnProductoPotencialmentePeligroso.setFont(new Font("Tahoma", Font.PLAIN, 9));
																																																																														txtpnProductoPotencialmentePeligroso.setBounds(2, 3, 451, 27);
																																																																														panel_2.add(txtpnProductoPotencialmentePeligroso);
																																																																														txtpnProductoPotencialmentePeligroso.setText(
																																																																																"Por ingesti\u00F3n: Puede causar n\u00E1useas y v\u00F3mitos; Por inhalaci\u00F3n: Irritaci\u00F3n en la respiraci\u00F3n, dolor de cabeza y mareos;  Contacto con los ojos y piel: Puede causar irritaci\u00F3nm, picazon, dolor y da\u00F1o ocular.");
																																																																														
																																																																																JPanel panel_10 = new JPanel();
																																																																																panel_10.setBounds(9, 212, 99, 38);
																																																																																panelcontenedor.add(panel_10);
																																																																																panel_10.setBorder(new LineBorder(Color.BLACK, 2));
																																																																																panel_10.setBackground(Color.WHITE);
																																																																																panel_10.setLayout(null);
																																																																																
																																																																																		JTextPane txtpnPeligro = new JTextPane();
																																																																																		txtpnPeligro.setFont(new Font("Arial Black", Font.BOLD, 10));
																																																																																		txtpnPeligro.setText("Peligro");
																																																																																		txtpnPeligro.setBounds(10, 11, 60, 20);
																																																																																		panel_10.add(txtpnPeligro);
																																																																																		
																																																																																				JTextPane textPane = new JTextPane();
																																																																																				textPane.setBounds(0, 42, 89, 94);
																																																																																				panel_10.add(textPane);
																																																																																				
																																																																																						JPanel panel_12 = new JPanel();
																																																																																						panel_12.setBounds(9, 248, 99, 90);
																																																																																						panelcontenedor.add(panel_12);
																																																																																						panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
																																																																																						panel_12.setBackground(Color.WHITE);
																																																																																						panel_12.setLayout(null);
																																																																																						
																																																																																								JTextPane txtpnEquipoDeProteccion = new JTextPane();
																																																																																								txtpnEquipoDeProteccion.setFont(new Font("Arial Black", Font.BOLD, 10));
																																																																																								txtpnEquipoDeProteccion.setText("Equipo de protecci\u00F3n de debe llevar el veh\u00EDculo\r\n");
																																																																																								txtpnEquipoDeProteccion.setBounds(10, 7, 79, 79);
																																																																																								panel_12.add(txtpnEquipoDeProteccion);
																																																																																								
																																																																																										JPanel panel_11 = new JPanel();
																																																																																										panel_11.setBounds(107, 248, 461, 91);
																																																																																										panelcontenedor.add(panel_11);
																																																																																										panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
																																																																																										panel_11.setBackground(Color.WHITE);
																																																																																										panel_11.setLayout(null);
																																																																																										
																																																																																												JTextPane txtpnUnidadSealesDe = new JTextPane();
																																																																																												txtpnUnidadSealesDe.setFont(new Font("Tahoma", Font.PLAIN, 10));
																																																																																												txtpnUnidadSealesDe.setText(
																																																																																														"Unidad: Se\u00F1ales de peligro ( conos de seguridad) , contar con material absorbente.linterna de mano, chaleco fluorescente, traje nivel C para protecci\u00F3n contra qu\u00EDmicos. Persona: EPPS, Cuerpo: Use traje protector (Overol) Protecci\u00F3n ocular: use gafas resistente para qu\u00EDmicosRespiratorio: En \u00E1reas mal ventiladas, situaciones de emergencia o si se exceden los niveles de exposici\u00F3n, use un respirador aut\u00F3nomo.Manos: Guantes de pc, nitrilo o neoprene, resistentes a los qu\u00EDmicos. Pies: Botas de cuero o jebe con puntera, resistentes a los qu\u00EDmicos.");
																																																																																												txtpnUnidadSealesDe.setBounds(2, 6, 451, 82);
																																																																																												panel_11.add(txtpnUnidadSealesDe);
																																																																																												
																																																																																														JPanel panel_14 = new JPanel();
																																																																																														panel_14.setBounds(9, 336, 99, 107);
																																																																																														panelcontenedor.add(panel_14);
																																																																																														panel_14.setBackground(Color.WHITE);
																																																																																														panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
																																																																																														panel_14.setLayout(null);
																																																																																														
																																																																																																JTextPane txtpnAccionesInmediatasPor = new JTextPane();
																																																																																																txtpnAccionesInmediatasPor.setFont(new Font("Arial Black", Font.BOLD, 10));
																																																																																																txtpnAccionesInmediatasPor.setText("Accion inmediata por el conductor ante la emergencia");
																																																																																																txtpnAccionesInmediatasPor.setBounds(5, 2, 89, 105);
																																																																																																panel_14.add(txtpnAccionesInmediatasPor);
																																																																																																
																																																																																																		JPanel panel_21 = new JPanel();
																																																																																																		panel_21.setBounds(107, 593, 461, 42);
																																																																																																		panelcontenedor.add(panel_21);
																																																																																																		panel_21.setBackground(Color.WHITE);
																																																																																																		panel_21.setBorder(new LineBorder(new Color(0, 0, 0), 2));
																																																																																																		panel_21.setLayout(null);
																																																																																																		
																																																																																																				JTextPane txtpnBomberosempresaRemitente = new JTextPane();
																																																																																																				txtpnBomberosempresaRemitente.setFont(new Font("Tahoma", Font.PLAIN, 10));
																																																																																																				txtpnBomberosempresaRemitente.setText("Bomberos: 116 / Polic\u00EDa: 105 / Defensa Civil: 110  / Cruz Rojas: 115");
																																																																																																				txtpnBomberosempresaRemitente.setBounds(10, 11, 394, 19);
																																																																																																				panel_21.add(txtpnBomberosempresaRemitente);
																																																																																																				
																																																																																																						JPanel panel_22 = new JPanel();
																																																																																																						panel_22.setBounds(9, 593, 99, 42);
																																																																																																						panelcontenedor.add(panel_22);
																																																																																																						panel_22.setBackground(Color.WHITE);
																																																																																																						panel_22.setBorder(new LineBorder(new Color(0, 0, 0), 2));
																																																																																																						panel_22.setLayout(null);
																																																																																																						
																																																																																																								JTextPane txtpnTelefonosDeEmergencia = new JTextPane();
																																																																																																								txtpnTelefonosDeEmergencia.setFont(new Font("Arial Black", Font.PLAIN, 10));
																																																																																																								txtpnTelefonosDeEmergencia.setText("Tel\u00E9fono de Emergencia");
																																																																																																								txtpnTelefonosDeEmergencia.setBounds(10, 3, 79, 36);
																																																																																																								panel_22.add(txtpnTelefonosDeEmergencia);
																																																																																																								
																																																																																																										JPanel panel_18 = new JPanel();
																																																																																																										panel_18.setBounds(9, 503, 559, 29);
																																																																																																										panelcontenedor.add(panel_18);
																																																																																																										panel_18.setBackground(Color.WHITE);
																																																																																																										panel_18.setBorder(new LineBorder(new Color(0, 0, 0), 2));
																																																																																																										panel_18.setLayout(null);
																																																																																																										
																																																																																																												JTextPane txtpnIncendio = new JTextPane();
																																																																																																												txtpnIncendio.setFont(new Font("Arial Black", Font.BOLD, 10));
																																																																																																												txtpnIncendio.setText("Incendio");
																																																																																																												txtpnIncendio.setBounds(10, 4, 79, 20);
																																																																																																												panel_18.add(txtpnIncendio);
																																																																																																												
																																																																																																														JPanel panel_17 = new JPanel();
																																																																																																														panel_17.setBounds(97, 0, 462, 28);
																																																																																																														panel_18.add(panel_17);
																																																																																																														panel_17.setBackground(Color.WHITE);
																																																																																																														panel_17.setBorder(new LineBorder(new Color(0, 0, 0), 2));
																																																																																																														panel_17.setLayout(null);
																																																																																																														
																																																																																																																JTextPane txtpnUsarTrajeDe = new JTextPane();
																																																																																																																txtpnUsarTrajeDe.setFont(new Font("Tahoma", Font.PLAIN, 10));
																																																																																																																txtpnUsarTrajeDe.setText("Usar traje de protecci\u00F3n qu\u00EDmica y equipo de respiraci\u00F3n autonoma.");
																																																																																																																txtpnUsarTrajeDe.setBounds(3, 2, 325, 20);
																																																																																																																panel_17.add(txtpnUsarTrajeDe);
																																																																																																																
																																																																																																																		JPanel panel_9 = new JPanel();
																																																																																																																		panel_9.setBounds(20, 652, 392, 51);
																																																																																																																		panelcontenedor.add(panel_9);
																																																																																																																		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 0));
																																																																																																																		panel_9.setBackground(Color.WHITE);
																																																																																																																		panel_9.setLayout(null);
																																																																																																																		
																																																																																																																				JLabel lblCantidadYPresentacion = new JLabel("Cantidad");
																																																																																																																				lblCantidadYPresentacion.setBounds(0, 11, 55, 9);
																																																																																																																				panel_9.add(lblCantidadYPresentacion);
																																																																																																																				lblCantidadYPresentacion.setFont(new Font("Tahoma", Font.BOLD, 11));
																																																																																																																				
																																																																																																																						txtcantidad = new JTextField();
																																																																																																																						txtcantidad.setText(formulario.cantidad);
																																																																																																																						txtcantidad.setEditable(false);
																																																																																																																						txtcantidad.setBounds(0, 31, 133, 20);
																																																																																																																						panel_9.add(txtcantidad);
																																																																																																																						txtcantidad.setColumns(10);
																																																																																																																						
																																																																																																																						JLabel lblPresentacion = new JLabel("Presentacion");
																																																																																																																						lblPresentacion.setFont(new Font("Tahoma", Font.BOLD, 11));
																																																																																																																						lblPresentacion.setBounds(151, 11, 78, 9);
																																																																																																																						panel_9.add(lblPresentacion);
																																																																																																																						
																																																																																																																						txtpresentacion = new JTextField();
																																																																																																																						txtpresentacion.setText(formulario.presentacion);
																																																																																																																						txtpresentacion.setEditable(false);
																																																																																																																						txtpresentacion.setColumns(10);
																																																																																																																						txtpresentacion.setBounds(149, 31, 215, 20);
																																																																																																																						panel_9.add(txtpresentacion);
		ImageIcon img = new ImageIcon("C:\\Users\\user\\Pictures\\Formulario1.PNG");
		imprimir();
	}

	private static class __Tmp {
		private static void __tmp() {
			javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
	@Override

	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

		 if (pageIndex > 0) { 
		   return NO_SUCH_PAGE;
		}

		Graphics2D g2d = (Graphics2D)graphics;
		g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
	

		panelcontenedor.printAll(graphics);

			

		return PAGE_EXISTS;

		
	}
	protected void mouseClickedChartPanel(MouseEvent arg0) {
		

		
		 try {
			   PrinterJob job = PrinterJob.getPrinterJob();
			   job.setPrintable(this);
			   job.printDialog();
			   job.print();
			   dispose();
			 } catch (PrinterException ex) {
			   ex.printStackTrace();
			 }
		
	}
	public void imprimir() {
		 try {
			   PrinterJob job = PrinterJob.getPrinterJob();
			   job.setPrintable(this);
			   job.printDialog();
			   job.print();
			   dispose();
			 } catch (PrinterException ex) {
			   ex.printStackTrace();
			 }
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
