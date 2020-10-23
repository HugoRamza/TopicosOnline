package parcial1.guibasicas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SerieNumeros extends JFrame {

    private JPanel     contentPane;
    private JButton    btn_Salir;
    private JButton    btn_Generar;
    private JTextField txt_Ini;
    private JTextField txt_Inc;
    private JTextField txt_Fin;
    private JComboBox<Integer>  cmb_Lista;

    public static void main (String[] args) {
        SerieNumeros frame = new SerieNumeros();
        frame.setVisible(true);
    }

    public SerieNumeros() {
        setTitle("Generador de Series");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        btn_Generar = new JButton("Generar");
        btn_Generar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
       
            String inicioS,finalS,incS;
            int inicioI,finalI,incI;
            
            inicioS= txt_Ini.getText();
            finalS = txt_Fin.getText();
            incS   = txt_Inc.getText();
            
            if ( inicioS.length()==0 || finalS.length()==0 || incS.length()==0 ) {
                JOptionPane.showMessageDialog(contentPane, "Faltan Parametros");
            } else {
            
                cmb_Lista.removeAllItems();
                
                inicioI= Integer.parseInt(inicioS);
                finalI = Integer.parseInt(finalS);
                incI   = Integer.parseInt(incS);
            
                for(int x=inicioI; x<= finalI; x+=incI) {
                    cmb_Lista.addItem(x);
                }
            
                cmb_Lista.setEnabled(true);
            }
            
            }
        });
        btn_Generar.setBounds(49, 204, 97, 25);
        
        btn_Salir = new JButton("Salir");
        btn_Salir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
            System.exit(0);
            }
        });
        btn_Salir.setBounds(295, 204, 97, 25);

        contentPane.add(btn_Generar);
        contentPane.add(btn_Salir);
        
        txt_Ini = new JTextField();
        txt_Ini.setBounds(178, 24, 116, 22);
        contentPane.add(txt_Ini);
        txt_Ini.setColumns(10);
        
        txt_Inc = new JTextField();
        txt_Inc.setColumns(10);
        txt_Inc.setBounds(178, 94, 116, 22);
        contentPane.add(txt_Inc);
        
        txt_Fin = new JTextField();
        txt_Fin.setColumns(10);
        txt_Fin.setBounds(178, 59, 116, 22);
        contentPane.add(txt_Fin);
        
        JLabel lblInicio = new JLabel("Inicio");
        lblInicio.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblInicio.setBounds(49, 27, 97, 16);
        contentPane.add(lblInicio);
        
        JLabel lblFin = new JLabel("Fin");
        lblFin.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblFin.setBounds(49, 62, 97, 16);
        contentPane.add(lblFin);
        
        JLabel lblIncremento = new JLabel("Incremento");
        lblIncremento.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblIncremento.setBounds(49, 97, 97, 16);
        contentPane.add(lblIncremento);
        
        cmb_Lista = new JComboBox<Integer>();
        cmb_Lista.setEnabled(false);
        cmb_Lista.setBounds(178, 141, 116, 22);
        contentPane.add(cmb_Lista);
        
        JLabel lblListaGenerada = new JLabel("Lista Generada");
        lblListaGenerada.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblListaGenerada.setBounds(49, 143, 123, 16);
        contentPane.add(lblListaGenerada);
        
        JButton btn_Limpiar = new JButton("Limpiar");
        btn_Limpiar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            
            txt_Ini.setText("");
            txt_Fin.setText("");
            txt_Inc.setText("");
            cmb_Lista.removeAllItems();
            cmb_Lista.setEnabled(false);
            btn_Limpiar.setEnabled(true);
            }
        });
        btn_Limpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btn_Limpiar.setBounds(178, 204, 97, 25);
        contentPane.add(btn_Limpiar);
    }
}
