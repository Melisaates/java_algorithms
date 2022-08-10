import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Object[] S={"A","B","C"};
        Object m=JOptionPane.showInputDialog(null,"seç","soru",JOptionPane.QUESTION_MESSAGE,
                null,S,S[0]);
        JOptionPane.showMessageDialog(null,m.toString());

   /* String name=JOptionPane.showInputDialog("name");
    int age=Integer.parseInt(JOptionPane.showInputDialog("age"));

    */


        /*    Object []options={"yes","no"};
        JOptionPane.showOptionDialog(null,"melisa","title",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
                null,null,options[1]);

     */
    }
}
