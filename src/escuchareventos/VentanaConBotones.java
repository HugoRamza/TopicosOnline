package escuchareventos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.*;

/** 
 * Creación de una ventana con tres botones
 * ActionListener en los botones
 * Uso del objeto-evento para detectar en que botón se hizo click
 */
public class VentanaConBotones extends JFrame implements ActionListener{

    private JPanel  pnlContenido = new JPanel();
    private JButton btnUno  = new JButton("Boton 1");
    private JButton btnDos  = new JButton("Boton 2");
    private JButton btnTres = new JButton("Boton 3");

    
    public static void main(String[] args) {
        VentanaConBotones winVentana = new VentanaConBotones();
        winVentana.setVisible(true);
    }

    
    public VentanaConBotones() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,550,300);
    
        pnlContenido.setBorder(new EmptyBorder(5,5,5,5));
        pnlContenido.setLayout(null);
        pnlContenido.add(btnUno);
        pnlContenido.add(btnDos);
        pnlContenido.add(btnTres);
        setContentPane(pnlContenido);

        btnUno.setBounds(100,180,100,30);
        btnDos.setBounds(220,180,100,30);
        btnTres.setBounds(340,180,100,30);
        
        btnUno.addActionListener(this);
        btnDos.addActionListener(this);
        btnTres.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evento) {      
        if (evento.getSource() == btnUno)  { System.out.println("Click en botón 1"); }
        if (evento.getSource() == btnDos)  { System.out.println("Click en botón 2"); }
        if (evento.getSource() == btnTres) { System.out.println("Click en botón 3"); }
    }
}
