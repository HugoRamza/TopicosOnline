package escuchareventos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

/** 
 * Creación de una ventana y un botón
 * Sin escuchar eventos
 */
public class VentanaBoton extends JFrame {
    private JPanel pnlContenido;

    public static void main(String[] args) {
        VentanaBoton winVentanaBoton = new VentanaBoton();
        winVentanaBoton.setVisible(true);
        winVentanaBoton.setTitle("VentanaBoton");
    }

    public VentanaBoton() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,450,300);
        JButton btnAceptar = new JButton("Aceptar");

        pnlContenido = new JPanel();
        pnlContenido.setBorder(new EmptyBorder(5,5,5,5));
        pnlContenido.setLayout(null);
        pnlContenido.add(btnAceptar);
        setContentPane(pnlContenido);

        btnAceptar.setBounds(180,178,97,30);
    }
}
