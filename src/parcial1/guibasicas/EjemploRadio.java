package parcial1.guibasicas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JOptionPane;

public class EjemploRadio extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel pnl_Contenido;

    public static void main(String[] args) {
        EjemploRadio ventana = new EjemploRadio();
        ventana.setVisible(true);
    }

    
    public EjemploRadio() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 446, 320);
        pnl_Contenido = new JPanel();
        pnl_Contenido.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(pnl_Contenido);
        pnl_Contenido.setLayout(null);

        JButton btn_Aceptar = new JButton("Aceptar");
        JButton btn_Salir   = new JButton("Salir");
        JLabel lblSexo = new JLabel("Sexo:");
        btn_Aceptar.setBounds(103, 187, 97, 25);
        btn_Salir.setBounds(283, 187, 97, 25);
        lblSexo.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblSexo.setBounds(88, 41, 56, 16);
        pnl_Contenido.add(btn_Aceptar);
        pnl_Contenido.add(btn_Salir);
        pnl_Contenido.add(lblSexo);

        
        JRadioButton rad_Masculino = new JRadioButton("Masculino");
        JRadioButton rad_Femenino  = new JRadioButton("Femenino");
        ButtonGroup  rad_Sexo      = new ButtonGroup();
        rad_Masculino.setBounds(160, 37, 127, 25);
        rad_Femenino.setBounds(160, 71, 127, 25);
        pnl_Contenido.add(rad_Masculino);
        pnl_Contenido.add(rad_Femenino);
        rad_Sexo.add(rad_Masculino);
        rad_Sexo.add(rad_Femenino);
        
        
        btn_Aceptar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evento) {
           
            String res_Sexo="Su sexo es : ";
            JRadioButton[] vector_Sexo = {rad_Masculino,rad_Femenino};
            
            for(int x=0; x<vector_Sexo.length; x++) {
                if ( vector_Sexo[x].isSelected()) {
                    res_Sexo = res_Sexo+vector_Sexo[x].getText();
                }
            }
            JOptionPane.showMessageDialog(pnl_Contenido,res_Sexo);
            }});
        
        
        btn_Salir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evento) {
            System.exit(0);
            }
        });
        
    }
}
