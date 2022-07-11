import javax.swing.*;

public class Clase26form extends JFrame{
 
 private JLabel label1; 
 private JLabel label2;

 public Clase26form(){
  setLayout(null);
  label1 = new JLabel("Que rica la milanguitA!!!!");
  label1.setBounds(0,10,200,100);
  
  add(label1);

  label2 = new JLabel("Que hizo la tia luchita!!!");
  label2.setBounds(0,100,200,100);
  add(label2);
  
 }

  public static void main(String args[]){
   Clase26form form1 = new Clase26form();
   form1.setBounds(0,0,700,700);
   form1.setResizable(false);
   form1.setLocationRelativeTo(null);
   form1.setVisible(true);
  }
}