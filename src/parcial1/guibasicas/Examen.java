package guibasicas;

import java.awt.event.*;  
import javax.swing.*;  
  
class Examen extends JFrame implements ActionListener {  
    JLabel       lab_Pregunta;  
    JRadioButton rad_opcion[]=new JRadioButton[3];  
    ButtonGroup  rad_grupo;  
    JButton      btn_Anterior;
    JButton      btn_Siguiente;  
    JButton      btn_Evaluar;
    JButton      btn_Salir;
    
    int preguntaActual=0;  
    int resultado;
    
    public static void main(String args[]) {  
        new Examen();  
    }  

  
    Examen() {  
        lab_Pregunta=new JLabel();  
        rad_grupo   =new ButtonGroup();  

        add(lab_Pregunta);  
        
        for(int i=0;i<=2;i++)  {  
            rad_opcion[i]=new JRadioButton();     
            
            add(rad_opcion[i]);  
            rad_grupo.add(rad_opcion[i]);  
            }  
        
        despliegaPreguntaRespuestas();  
        
        lab_Pregunta.setBounds(30,40,450,20);  
        rad_opcion[0].setBounds(100,80,300,20);  
        rad_opcion[1].setBounds(100,110,300,20);  
        rad_opcion[2].setBounds(100,140,300,20);  

        btn_Anterior =new JButton("Anterior");  
        btn_Siguiente=new JButton("Siguiente");  
        btn_Evaluar  =new JButton("Evaluar");  
        btn_Salir    =new JButton("Salir");  

        btn_Anterior.setBounds(50,250,90,30);
        btn_Siguiente.setBounds(150,250,90,30);  
        btn_Evaluar.setBounds(250,250,90,30);  
        btn_Salir.setBounds(350,250,90,30);  
        btn_Anterior.setEnabled(false);
        btn_Evaluar.setEnabled(true);

        btn_Anterior.addActionListener(this);  
        btn_Siguiente.addActionListener(this);  
        btn_Evaluar.addActionListener(this);  
        btn_Salir.addActionListener(this);  

        add(btn_Anterior);  
        add(btn_Siguiente);  
        add(btn_Evaluar);  
        add(btn_Salir);  
 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setVisible(true);  
        setSize(600,400);  
        setTitle("Acrónimos en Java");   
    }  
 
    
  /*-----------------------------------
    Inicializar preguntas y respuestas
   -----------------------------------*/
    public void actionPerformed(ActionEvent e)  {  
        
        if(e.getSource()==btn_Siguiente) {  
            preguntaActual++;  
            
            despliegaPreguntaRespuestas();    
            if(preguntaActual==1)  {  
                btn_Anterior.setEnabled(true);  
                btn_Siguiente.setEnabled(true);  
            }
            if(preguntaActual==4)  {  
                btn_Anterior.setEnabled(true);  
                btn_Siguiente.setEnabled(false);  
            }  
        }  
        
        if(e.getSource()==btn_Anterior) {  
            preguntaActual--;  
            
            despliegaPreguntaRespuestas();    
            if(preguntaActual==0)  {  
                btn_Anterior.setEnabled(false);  
                btn_Siguiente.setEnabled(true);  
            }
            if(preguntaActual==4)  {  
                btn_Anterior.setEnabled(true);  
                btn_Siguiente.setEnabled(true);  
            }  
        }  

        if(e.getSource()==btn_Evaluar) {  
            resultado = 0;
            if (rad_opcion[0].isSelected()) resultado++;  
            if (rad_opcion[1].isSelected()) resultado++;  
            if (rad_opcion[2].isSelected()) resultado++;  
        
            JOptionPane.showMessageDialog(null, "Su resultado es : "+resultado);
        }  

        if(e.getSource()==btn_Salir) {  
            System.exit(0);
        }  

    }  

    
    
    /*-----------------------------------
       Inicializar preguntas y respuestas
      -----------------------------------*/
    void despliegaPreguntaRespuestas()  {  
        if(preguntaActual==0)  {  
            lab_Pregunta.setText("1) JVM quiere decir...?");  
            rad_opcion[0].setText("Java Virtual Microprocessor");
            rad_opcion[1].setText("Java Virtual Machine");
            rad_opcion[2].setText("Java Virtual Mobile");   
        }  
        if(preguntaActual==1)  {  
            lab_Pregunta.setText("2) JRE quiere decir...?");  
            rad_opcion[0].setText("Java Running Enterprise");
            rad_opcion[1].setText("Java Running Environment");
            rad_opcion[2].setText("Java Response Encapsulated");
        }  
        if(preguntaActual==2)  {  
            lab_Pregunta.setText("3) JDK quiere decir...?");  
            rad_opcion[0].setText("Java Deployment Kit");
            rad_opcion[1].setText("Java Debugger Kit");
            rad_opcion[2].setText("Java Development Kit");  
        }
        if(preguntaActual==3)  {  
            lab_Pregunta.setText("4) JSE quiere decir...?");  
            rad_opcion[0].setText("Java System Edition");
            rad_opcion[1].setText("Java Standard Enterprise");
            rad_opcion[2].setText("Java Standard Edition");  
            }  
        if(preguntaActual==4)  {  
            lab_Pregunta.setText("4) JEE quiere decir...?");  
            rad_opcion[0].setText("Java Enterprise Edition");
            rad_opcion[1].setText("Java Enterprise Environment");
            rad_opcion[2].setText("Java Expert Edition");  
            }  
    }  
    
    
    /*------------------------------------------
       Revision de preguntas y regresa resultado
     -------------------------------------------*/
    boolean revisar() {  
        if(preguntaActual==0) return(rad_opcion[2].isSelected());  
        if(preguntaActual==1) return(rad_opcion[2].isSelected());
        if(preguntaActual==2) return(rad_opcion[2].isSelected());
        if(preguntaActual==3) return(rad_opcion[1].isSelected());
        if(preguntaActual==4) return(rad_opcion[0].isSelected());
        return false;  
    }  
}  
