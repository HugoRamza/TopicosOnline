package guibasicas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContadorPalabras extends JFrame {

    private JPanel contentPane;
    private JTextArea textArea;

    public ContadorPalabras() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);
        
        JButton btnContar = new JButton("Contar");
        btnContar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });

        btnContar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            
            String texto;
            String[] palabras;
            
            texto = textArea.getText();
            palabras = texto.split(" ",-1);
            JOptionPane.showMessageDialog(contentPane, "El tetxo contiene "+palabras.length+" palabras");
            }
        });
        
        btnContar.setBounds(81, 218, 97, 25);
        contentPane.add(btnContar);
        
        JButton btnSalir = new JButton("Salir");
        btnSalir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
            System.exit(0);
            }
        });
        btnSalir.setBounds(251, 218, 97, 25);
        contentPane.add(btnSalir);
        
        JLabel lblTecleeSusComentarios = new JLabel("Teclee sus Comentarios:");
        lblTecleeSusComentarios.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblTecleeSusComentarios.setBounds(83, 47, 252, 16);
        contentPane.add(lblTecleeSusComentarios);
        
        textArea = new JTextArea();
        textArea.setBounds(81, 76, 267, 129);
        contentPane.add(textArea);
    }
}
