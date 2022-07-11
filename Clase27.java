import javax.swing.*;
import java.awt.event.*;


public class Clase27 extends JFrame implements ActionListener{
 
 JButton boton1; 
 public Clase27(){
   setLayout(null);
   boton1 = new JButton("cerrar");
   boton1.setBounds(150,150,100,30);
   add(boton1);
   boton1.addActionListener(this);
   
   } 
 public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1 ){
    System.exit(0);
   }
 }  
 public static void main(String args[]){
  Clase27 form1 = new Clase27();
  form1.setBounds(0,0,400,350);
  form1.setVisible(true);
  form1.setResizable(false);
  form1.setLocationRelativeTo(null);
 }
}