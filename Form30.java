import javax.swing.*;


public class Form30 extends JFrame {
 private JTextField field1;
 private JTextArea Area1;
 

 public Form30(){
  setLayout(null);
  field1 = new JTextField();
  field1.setBounds(10,10,200,30);
  add(field1);

  Area1 = new JTextArea();
  Area1.setBounds(10,50,400,300); 
  add(Area1);
 } 

  
  

public static void main(String args[]){
   Form30 form1 = new Form30();
   form1.setBounds(0,0,540,400);
   form1.setVisible(true); 
   form1.setResizable(false);
   form1.setLocationRelativeTo(null);
 }
}
