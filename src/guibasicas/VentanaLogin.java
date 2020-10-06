package guibasicas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaLogin extends JFrame {
    private static final long serialVersionUID = 1L;
	private JPanel            contentPane;
	private JTextField        txt_Nombre;
	private JPasswordField    txt_Password;
	private JTextField        txt_Resultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin frame = new VentanaLogin();
					frame.setVisible(true);
					frame.setTitle("Acceso");
			        
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public VentanaLogin() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lab_Nombre = new JLabel("Nombre");
		lab_Nombre.setBounds(54, 44, 56, 16);

		JLabel lab_Password = new JLabel("Password");
		lab_Password.setBounds(54, 96, 66, 16);

		txt_Nombre = new JTextField();
		txt_Nombre.setBounds(164, 41, 149, 22);
		txt_Nombre.setColumns(10);
		
		txt_Password = new JPasswordField();
		txt_Password.setBounds(164, 93, 149, 22);
		
		txt_Resultado = new JTextField();
		txt_Resultado.setEnabled(false);
		txt_Resultado.setBounds(154, 218, 116, 22);
		txt_Resultado.setColumns(10);

		contentPane.add(lab_Nombre);
		contentPane.add(lab_Password);
		contentPane.add(txt_Nombre);
		contentPane.add(txt_Password);
		contentPane.add(txt_Resultado);

		JButton btn_Aceptar = new JButton("Aceptar");
		btn_Aceptar.setBounds(76, 173, 97, 25);
		btn_Aceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
			String varNombre;
			String varPassword;
			String varResultado;
			
			varNombre = txt_Nombre.getText();
			varPassword = new String(txt_Password.getPassword());
			
			if (varNombre.equals("Gerardo") && varPassword.equals("Pineda")) {
				varResultado = "Login Correcto";
			} else {
				varResultado = "Login Incorrecto";
			}
			txt_Resultado.setText(varResultado);
			}}
		);
		
		btn_Aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btn_Cancelar = new JButton("Cancelar");

		btn_Cancelar.setBounds(256, 173, 97, 25);

		contentPane.add(btn_Aceptar);
		contentPane.add(btn_Cancelar);
	}
}
