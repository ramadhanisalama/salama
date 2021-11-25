import javax.swing.JOptionPane;
   class JOP{
       public static void main(String [] args){
           String name = JOptionPane.showInputDialog("Enter your name");
           JOptionPane.showMessageDialog(null, "Your name is " + name);


           int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
           JOptionPane.showMessageDialog(null, "Your age is" + age);

           double height = Double.parseDouble(JOptionPane.showInputDialog("It is recommended to get your height"));
           JOptionPane.showMessageDialog(null, "Your height is " + height+ "cm tall ");
       }
   }








