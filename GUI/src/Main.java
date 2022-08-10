import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
	JFrame window=new JFrame();
	window.setSize(200,200);
	window.setTitle("mywindow");
	window.setVisible(true);//pencereyi gormek icin true yapilmali
    window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}
