import javax.swing.JFrame;
import javax.swing.JPanel;


public class Window extends JFrame {
	
	public Window(){
		
		this.setTitle("Tutorys - Login window");
		this.setSize(400, 280);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new LoginPanel());
		this.setVisible(true);
	}
}
