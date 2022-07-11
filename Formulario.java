import javax.swing.*;

public class Formulario extends JFrame{
 
 private JLabel label1;
 
public Formulario(){
 setLayout(null);
 label1 = new JLabel("Hola My Love!!!");
 label1.setBounds(50,50,200,200);
 add(label1);
 }
 public static void main(String args[]){
  Formulario formulario1 = new Formulario();
  formulario1.setBounds(0,0,400,300);
  formulario1.setVisible(true);
  formulario1.setLocationRelativeTo(null);
 }

}