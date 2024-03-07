import javax.swing.JFrame;  //main window where components are added to create a GUI

public class GameFrame extends JFrame{

	GameFrame(){
			
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();  // resizes the frame to fit all the components
		this.setVisible(true);
		this.setLocationRelativeTo(null);  //positions window in the middle of screen
		
	}
}