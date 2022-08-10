import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class SampleWindow extends JFrame {
    public SampleWindow(){
        this.setSize(200,200);
        this.setTitle("mywindow");
        JPanel panel=new JPanel();

        JButton B=new JButton("OK");
        JTextField C=new JTextField("NAME");
        JButton D=new JButton("NO");
        JLabel F=new JLabel("SELAM");

        //Container c=this.getContentPane();
        //c.setBackground(Color.YELLOW);
        panel.setLayout(new BorderLayout());
        panel.add(B,BorderLayout.NORTH);
        panel.add(C,BorderLayout.CENTER);
        panel.add(D);
        panel.add(F);
        this.add(panel);
        this.pack();

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);//pencereyi gormek icin true yapilmali
    }

    public static void main(String[] args) {
        SampleWindow s=new SampleWindow();


    }
}
