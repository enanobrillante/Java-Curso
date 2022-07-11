import javax.swing.*;

public class Formulario2 extends JFrame{
 
 public Formulario2(){
   setLayout(null);
 }

 public static void main (String args[]){
   Formulario2 form = new Formulario2();
   form.setBounds(350,0,400,550);
   form.setVisible(true);
   form.setLocationRelativeTo(null);
   form.setResizable(false);
 }
}