import javax.swing.*;

public class Form31 extends JFrame{
 private JTextField textfield1;
 private JScrollPane scroll1;
 private JTextArea area1;

 public Form31(){
  setLayout(null);
  textfield1 = new JTextField();
  textfield1.setBounds(10,10,200,30);
  add(textfield1);

  area1 = new JTextArea("");
  scroll1 = new JScrollPane(area1);
  scroll1.setBounds(10,50,400,300);
  add(scroll1);
 }
  public static void main(String args[]){
   Form31 formulario = new Form31();
   formulario.setBounds(0,0,540,400);
   formulario.setVisible(true);
   formulario.setResizable(true);
   formulario.setLocationRelativeTo(null);
  }
  
 
 
}